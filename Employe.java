package Exercice_Pratique2;

public abstract class Employe {
	private String name;
	private Entreprise myEntreprise;
	
	public Employe(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public abstract double getSalaire();

	public void setEntreprise(Entreprise myEntreprise) {
		
		this.myEntreprise=myEntreprise;
		
	}
	
	public Entreprise getMyEntreprise(){
		return myEntreprise;
	}
	
	//L'employ� d�missionne (sans aller dans une autre entreprise).
    // Une exception est lev� s�il est d�j� en ch�mage
	
	public void demissionne()throws EmployeException {
		if(this.myEntreprise==null) {
			throw new EmployeException(this.name+" est d�j� en ch�mage!");
			
		}
	}
	@Override
	public String toString() {
		return "Employe [name=" + name + ", myEntreprise=" + myEntreprise.getName() + "]";
	}
}
