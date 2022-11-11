package com.nfa019.gestionproduitsrestaurant.entity;

public class Categorie {


    private int idCategorie;
    public int getIdCategorie()
    {
        return this.idCategorie;
    }
    public void setIdCategorie(int id){
        this.idCategorie = id;
    }

    private String nomCategorie;
    public String getNomCategorie()
    {
        return this.nomCategorie;
    }
    public void setNomCategorie(String nom){
        this.nomCategorie = nom;
    }

    private String designationCategorie;
    public String getDesignationCategorie()
    {
        return this.designationCategorie;
    }
    public void setDesignationCategorie(String designation){
        this.designationCategorie = designation;
    }

}


