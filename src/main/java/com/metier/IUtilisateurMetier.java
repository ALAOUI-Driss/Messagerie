package com.metier;

import com.entities.Utilisateur;

public interface IUtilisateurMetier {
	void create(Utilisateur utilisateur);
	Utilisateur login(Utilisateur utilisateur);
}
