package Exercice_Pratique2;

public class EmployeHoraire extends Employe {
	 private double nbHeures;
	 private double tarifHoraire;
	 private double pourcentageHeuresSup;
	 private static final double heuresDues = 39;
	 
	 public EmployeHoraire(String name,double nbHeures,double tarifHoraire,double pourcentageHeuresSup){
			super(name);
			this.nbHeures=nbHeures;
			this.tarifHoraire=tarifHoraire;
			this.pourcentageHeuresSup=pourcentageHeuresSup;		
		}
	 
	 //Les employé payés au nombre d'heures travaillées

	@Override
	public double getSalaire() {
		if(nbHeures>heuresDues) {
			return tarifHoraire*(heuresDues+(nbHeures-heuresDues)*(1+(pourcentageHeuresSup/100)));
		}else {
			return tarifHoraire*heuresDues;	
		}

	}

	@Override
	public String toString() {
		return "EmployeHoraire: "+ super.toString()+" [nbHeures=" + nbHeures + ", tarifHoraire=" + tarifHoraire + ", pourcentageHeuresSup="
				+ pourcentageHeuresSup + "]";
	}
}	
	
	
	
	
