package Exercice_Pratique2;

public class Commercial extends Employe {
	// chiffre d'affaires du mois
	private double ca;
	private double fixe;
	// pourcentage du CA pour le calcul du salaire
	private static final double pourcentageCa = 1.0;
	
	public Commercial(String name,double ca,double fixe) {
		super(name);
		this.ca=ca;
		this.fixe=fixe;
	}

	@Override
	public double getSalaire() {
		return (fixe + (pourcentageCa * ca) / 100);
	}

	@Override
	public String toString() {
		return "Commercial: "+super.toString()+" [ca=" + ca + ", fixe=" + fixe + "]";
	}

}
