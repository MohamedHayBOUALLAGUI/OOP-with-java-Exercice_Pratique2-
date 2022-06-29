package Exercice_Pratique2;

import java.util.ArrayList;
import java.util.List;

public class Entreprise {
	private String name;
	private List<Employe> listEmployes;
	
	public Entreprise(String name) {
		this.name=name;
		listEmployes= new ArrayList<Employe>();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
		
	}
	 // On v�rifie si l�employ� donn� est un employ� de l�entreprise
	public boolean aPourEmploye(Employe emp) {
		return listEmployes.contains(emp);
	}
	
	//Ajoute l�employ� � la liste des employ�s de l�entreprise, s�il est d�j� engag� avec cette 
	//derni�re une exception est g�n�r�e
	//s�il appartient � une autre entreprise : l�employ� doit quitter son ancienne entreprise
	public void engager(Employe emp) throws EmployeException{
		if(this.aPourEmploye(emp)) {
			throw new EmployeException("l'employ� est d�j� engag� avec cette entreprise!");
		}
		Entreprise myAncienEntreprise=emp.getMyEntreprise();
		if(myAncienEntreprise!=null) {
			myAncienEntreprise.listEmployes.remove(emp);
		}
		this.listEmployes.add(emp);
		emp.setEntreprise(this);
	}
	
	//Retire l�employ� de la liste des employ�s de l�entreprise, s�il n�appartient pas � 
	//l�entreprise une exception est g�n�r�e
	
	public void seSeparerDe(Employe emp) throws EmployeException {
		if(!this.aPourEmploye(emp)) {
			throw new EmployeException(emp.getName()+" n�appartient pas � l'entreprise");
		}
		
		this.listEmployes.remove(emp);
		emp.setEntreprise(null);
	} 
	//afficher les employ�s
	
	public void affichageEmployes(){
		System.out.println("liste des employ�s de l'entreprise : "+this.name);
		for(Employe emp:listEmployes) {
			System.out.println(emp);
		}
	}


	
	
}
