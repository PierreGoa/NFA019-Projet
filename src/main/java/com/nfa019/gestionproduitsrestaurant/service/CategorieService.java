package com.nfa019.gestionproduitsrestaurant.service;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.nfa019.gestionproduitsrestaurant.entity.Categorie;
import com.nfa019.gestionproduitsrestaurant.dao.CategorieDao;

@Component
public class CategorieService implements ICategorieService{

    @Resource
    CategorieDao categorieDao;
    @Override
    public List<Categorie> findAll() {
        return categorieDao.findAll();
    }
    @Override
    public void insertCategorie(Categorie categorie) {
        categorieDao.insertCategorie(categorie);
    }
    @Override
    public void updateCategorie(Categorie categorie) {
        categorieDao.updateCategorie(categorie);
    }
    @Override
    public void executeUpdateCategorie(Categorie categorie) {
        categorieDao.executeUpdateCategorie(categorie);
    }

    @Override
    public void deleteCategorie(Categorie categorie) {
        categorieDao.deleteCategorie(categorie);
    }
}

