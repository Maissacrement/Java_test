/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproj;

/**
 *
 * @author maissacrement
 */
public class Avis {
    //attribut
    private String pseudo;
    private String nomEtablissement;
    private int note;
    private String texte;
    
    //constructeur
    public Avis(String ps,String nomEta,int note,String texte){
        this.pseudo = ps;
        this.nomEtablissement = nomEta;
        this.note = note;
        this.texte = texte;
    }
    //getteur
    public String getPseudo(){
        return this.pseudo;
    }
    public String getNomEtablissement(){
        return this.nomEtablissement;
    }
    public int getNote(){
        return this.note;
    }
    public String getTexte(){
        return this.texte;
    }
    
    //setteur
    public void setPseudo(String ps){
        this.pseudo = ps;
    }
    public void setNomEtablissement(String nom){
        this.nomEtablissement = nom;
    }
    public void setNote(int note){
        this.note = note;
    }
    public void setTexte(String texte){
        this.texte = texte;
    }
    public String toString(){
        return "pseudo "+this.pseudo+", etablissement "+this.nomEtablissement+", note "+this.note+", texte "+this.texte;
    }
    
    
}
