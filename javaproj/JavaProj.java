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
public class JavaProj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Avis p1 = new Avis("paul","fac",10,"passage favorable");
        Avis p2 = new Avis("max","fac",14,"passage favorable");
        Avis p3 = new Avis("pierre","lycee",10,"passage favorable");
        
        listAvis desAvis = new listAvis();
        desAvis.ajouter(p1);
        desAvis.ajouter(p2);
        desAvis.ajouter(p3);
        
        double moy = desAvis.NoteMoyenne("fac");
        System.out.println(moy);
        desAvis.tousLesAvis(p1);
        
        int[] tab = {2,-2,-7,-8,5,-2,-2};
        System.out.println(nbPGel(tab));
        
        System.out.println(((int)(Math.random() * 10);
    }
    public static String nbPGel(int[] tabDeTemp){
        int nb = 0;
        int cpt = 0;
        int periodeGelLongue = 0;
        for(int i =0;i<tabDeTemp.length;i++){
            if(tabDeTemp[i]<=0){
                nb++;
                cpt++;
            }
            else{
                cpt = 0;
            }
            System.out.println(cpt);
            if(cpt > periodeGelLongue){
                periodeGelLongue = periodeGelLongue + cpt;
            }
        }
        return nb + " periode " + periodeGelLongue;
        
    }
    
    
}
