package entity;

import java.io.Serializable;

public class User implements Serializable{
private Long idUser; 
private String nom;
private String mdp;
public Long getIdUser() {
	return idUser;
}
public void setIdUser(Long idUser) {
	this.idUser = idUser;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getMdp() {
	return mdp;
}
public User(String nom, String mdp) {
	super();
	this.nom = nom;
	this.mdp = mdp;
}
public User() {
	super();
}
public User(Long idUser, String nom, String mdp) {
	super();
	this.idUser = idUser;
	this.nom = nom;
	this.mdp = mdp;
}
public void setMdp(String mdp) {
	this.mdp = mdp;
}
@Override
public String toString() {
	return "User [idUser=" + idUser + ", nom=" + nom + ", mdp=" + mdp + "]";
}
}
