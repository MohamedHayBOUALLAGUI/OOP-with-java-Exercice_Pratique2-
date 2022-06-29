package Exercice_Pratique2;

public class TestEmploye {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Entreprise E1 = new Entreprise("Samsung");
			Entreprise E2 = new Entreprise("Apple");
			Entreprise E3 = new Entreprise("Oppo");
			

			Employe C11 = new Commercial("Seif", 5000, 50000);
			EmployeHoraire EH11 = new EmployeHoraire("Mohamed", 42, 75.00,25);
			
			System.out.println("le salaire de "+EH11.getName()+" est égal à "+EH11.getSalaire()+" dinar");
			
		
			E1.engager(C11);
			E1.engager(EH11);
		
			Commercial C21 = new Commercial("Saber", 6000, 40000);
			EmployeHoraire EH21 = new EmployeHoraire("Ali", 45, 105.00, 10);
			E2.engager(C21);
			E2.engager(EH21);
			
			Commercial C31 = new Commercial("Haythem", 7000, 70000);
			EmployeHoraire EH31 = new EmployeHoraire("Adel", 39, 110.00, 12);
			E3.engager(C31);
			E3.engager(EH31);
			
			E1.affichageEmployes();
			E2.affichageEmployes();
			E3.affichageEmployes();
			
			E3.seSeparerDe(EH31);
			System.out.println("après suppression de l'employé "+EH31.getName()+" de l'entreprise "+E3.getName());
			E3.affichageEmployes();
			System.out.println();
			System.out.println(E3.aPourEmploye(EH31));

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
