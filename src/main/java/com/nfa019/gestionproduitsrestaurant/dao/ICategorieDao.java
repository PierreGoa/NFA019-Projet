package com.nfa019.gestionproduitsrestaurant.dao;

import java.util.List;
import com.nfa019.gestionproduitsrestaurant.entity.Categorie;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategorieDao {
    List<Categorie> findAll();

    void insertCategorie(Categorie categorie);
    void updateCategorie(Categorie categorie);
    void executeUpdateCategorie(Categorie categorie);
    public void deleteCategorie(Categorie categorie);
}
