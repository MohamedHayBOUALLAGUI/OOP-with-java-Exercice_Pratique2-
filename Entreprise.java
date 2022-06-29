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
	 // On vérifie si l’employé donné est un employé de l’entreprise
	public boolean aPourEmploye(Employe emp) {
		return listEmployes.contains(emp);
	}
	
	//Ajoute l’employé à la liste des employés de l’entreprise, s’il est déjà engagé avec cette 
	//dernière une exception est générée
	//s’il appartient à une autre entreprise : l’employé doit quitter son ancienne entreprise
	public void engager(Employe emp) throws EmployeException{
		if(this.aPourEmploye(emp)) {
			throw new EmployeException("l'employé est déjà engagé avec cette entreprise!");
		}
		Entreprise myAncienEntreprise=emp.getMyEntreprise();
		if(myAncienEntreprise!=null) {
			myAncienEntreprise.listEmployes.remove(emp);
		}
		this.listEmployes.add(emp);
		emp.setEntreprise(this);
	}
	
	//Retire l’employé de la liste des employés de l’entreprise, s’il n’appartient pas à 
	//l’entreprise une exception est générée
	
	public void seSeparerDe(Employe emp) throws EmployeException {
		if(!this.aPourEmploye(emp)) {
			throw new EmployeException(emp.getName()+" n’appartient pas à l'entreprise");
		}
		
		this.listEmployes.remove(emp);
		emp.setEntreprise(null);
	} 
	//afficher les employés
	
	public void affichageEmployes(){
		System.out.println("liste des employés de l'entreprise : "+this.name);
		for(Employe emp:listEmployes) {
			System.out.println(emp);
		}
	}


	
	
}
