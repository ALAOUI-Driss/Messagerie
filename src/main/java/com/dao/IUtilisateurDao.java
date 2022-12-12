package com.dao;

import com.entities.Utilisateur;

public interface IUtilisateurDao {
	
	void add(Utilisateur user); 
	Utilisateur find(String email);
	Utilisateur findByEmailAndPassword(String email,String password);
}
