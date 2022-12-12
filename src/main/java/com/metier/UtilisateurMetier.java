package com.metier;

import com.dao.IUtilisateurDao;
import com.dao.UtilisateurDao;
import com.entities.Utilisateur;

public class UtilisateurMetier implements IUtilisateurMetier {
	private IUtilisateurDao utilisateurDao = new UtilisateurDao();

	@Override
	public void create(Utilisateur utilisateur) {
		utilisateurDao.add(utilisateur);
	}

	@Override
	public Utilisateur login(Utilisateur utilisateur) {
		return utilisateurDao.findByEmailAndPassword(utilisateur.getEmail(),utilisateur.getPassword());
	}

}
