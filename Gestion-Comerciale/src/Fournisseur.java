/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anonyme
 */
public class Fournisseur {
    	int NumFournisseur;
	String Societe;
	String Civilite;
	String Nom;
	String Prenom;
	String Adresse;
	String CodePostal;
	String Ville;

    public String getNum() {
        return Integer.toString(NumFournisseur);
    }
 
    public String getSociete() {
        return Societe;
    }

    public String getCivilite() {
        return Civilite;
    }

    public String getNom() {
        return Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public String getAdresse() {
        return Adresse;
    }

    public String getCodePostal() {
        return CodePostal;
    }

    public String getVille() {
        return Ville;
    }

    public String getPays() {
        return Pays;
    }

    public String getTelephone() {
        return Telephone;
    }

    public String getMobile() {
        return Mobile;
    }

    public String getFax() {
        return Fax;
    }

    public void setNum(int Num) {
        this.NumFournisseur=Num;
    }   
    
    public void setSociete(String Societe) {
        this.Societe = Societe;
    }

    public void setCivilite(String Civilite) {
        this.Civilite = Civilite;
    }

    public void setNomClient(String Nom) {
        this.Nom = Nom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    public void setAdresse(String Adresse) {
        this.Adresse = Adresse;
    }

    public void setCodePostal(String CodePostal) {
        this.CodePostal = CodePostal;
    }

    public void setVille(String Ville) {
        this.Ville = Ville;
    }

    public void setPays(String Pays) {
        this.Pays = Pays;
    }

    public void setTelephone(String Telephone) {
        this.Telephone = Telephone;
    }

    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    public void setFax(String Fax) {
        this.Fax = Fax;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getEmail() {
        return Email;
    }
	String Pays;
	String Telephone;
	String Mobile;
	String Fax;
	String Email;
        
        Fournisseur(int Num,String Nom, String Prenom, String Societe, String Civilite, String Adresse, String CodePostal, String Ville, String Pays
        ,String Telephone, String Mobile, String Fax, String Email) {
            this.NumFournisseur=Num;
            this.Nom=Nom;
            this.Prenom=Prenom;
            this.Adresse=Adresse;
            this.Societe=Societe;
            this.Civilite=Civilite;
            this.CodePostal=CodePostal;
            this.Ville=Ville;
            this.Pays=Pays;
            this.Telephone=Telephone;
            this.Mobile=Mobile;
            this.Fax=Fax;
            this.Email=Email;
        }
           
        Fournisseur() {
            
        }
        

        
}
