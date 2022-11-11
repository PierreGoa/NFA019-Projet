package com.nfa019.gestionproduitsrestaurant.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.nfa019.gestionproduitsrestaurant.entity.Categorie;

public class CategorieRowMapper implements RowMapper<Categorie> {

    @Override
    public Categorie mapRow(ResultSet rs, int arg1) throws SQLException {
        Categorie categorie = new Categorie();
        categorie.setIdCategorie(rs.getInt("id_categorie"));
        categorie.setNomCategorie(rs.getString("nom"));
        categorie.setDesignationCategorie(rs.getString("designation"));

        return categorie;
    }
}

