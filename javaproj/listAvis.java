/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproj;

import java.util.ArrayList;

/**
 *
 * @author maissacrement
 */
public class listAvis {
    //attribut
    private ArrayList<Avis> lesAvis;
    
    //constructeur
    public listAvis(){
        this.lesAvis = new ArrayList();
    }
    //methode
    public double NoteMoyenne(String nomEta){
        double moyenne = 0;
        int cpt = 0;
        for(int i = 0;i<this.lesAvis.size();i++){
            if(this.lesAvis.get(i).getNomEtablissement() == nomEta){
                moyenne = this.lesAvis.get(i).getNote() + moyenne;
                cpt++;
            }
        }
        moyenne = moyenne/cpt;
        return moyenne;
    }
    public void ajouter(Avis p1){
        this.lesAvis.add(p1);
    }
    
    public void tousLesAvis(Avis p1){
        for(int i = 0;i<this.lesAvis.size();i++){
            if(this.lesAvis.get(i) == p1){
                System.out.println(p1);
            }
        }
    }
}
