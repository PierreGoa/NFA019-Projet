package com.nfa019.gestionproduitsrestaurant.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nfa019.gestionproduitsrestaurant.entity.Categorie;
import com.nfa019.gestionproduitsrestaurant.service.ICategorieService;

@RestController
@RequestMapping("/Nfa19App")
public class ApplicationController {

    @Resource
    ICategorieService categorieService;

    @GetMapping(value = "/categorieList")
    public List<Categorie> getCategories() {
        return categorieService.findAll();

    }

    @PostMapping(value = "/createCategorie")
    public void createCategorie(@RequestBody Categorie categorie) {
        categorieService.insertCategorie(categorie);
    }

    @PutMapping(value = "/updateCategorie")
    public void updateEmployee(@RequestBody Categorie categorie) {
        categorieService.updateCategorie(categorie);
    }

    @PutMapping(value = "/executeUpdateCategorie")
    public void executeUpdateEmployee(@RequestBody Categorie categorie) {
        categorieService.executeUpdateCategorie(categorie);
    }

    @DeleteMapping(value = "/deleteCategorieById")
    public void deleteEmployee(@RequestBody Categorie categorie) {
        categorieService.deleteCategorie(categorie);
    }
}
