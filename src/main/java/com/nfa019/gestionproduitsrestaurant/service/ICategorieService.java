package com.nfa019.gestionproduitsrestaurant.service;

import java.util.List;
import com.nfa019.gestionproduitsrestaurant.entity.Categorie;

public interface ICategorieService {
    List<Categorie> findAll();

    void insertCategorie(Categorie categorie);

    void updateCategorie(Categorie categorie);

    void executeUpdateCategorie(Categorie categorie);

    void deleteCategorie(Categorie categorie);
}
