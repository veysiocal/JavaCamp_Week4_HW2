package concretes;


import abstracts.GamerManager;
import abstracts.SaleManager;
import entities.concretes.Games;
import entities.concretes.Campaign;
import entities.concretes.Gamer;

public class GamerManagerConc implements GamerManager{
	

	public void validation(Gamer gamer) {
		if((gamer.getId()==232) && (gamer.getFirstName()== "Veysi") && (gamer.getLastName()== "Öcal") && (gamer.getNationalityId()=="12345678998") && (gamer.getDateOfBirth()== 1998)) {
			System.out.println("Login succesful");
		}
		else {
			System.out.println("Incorrect entry.");
		}

	}
	@Override
	public void register(Gamer gamer) {
		// TODO Auto-generated method stub
		System.out.println(gamer.getFirstName()+" is registered.");
	}

	@Override
	public void updateInfos(Gamer gamer) {
		// TODO Auto-generated method stub
		System.out.println("Infos of " +gamer.getFirstName()+ " are updated.");
		
	}

	@Override
	public void deleteAccount(Gamer gamer) {
		// TODO Auto-generated method stub
		System.out.println("The account of " +gamer.getFirstName()+ " has ben deleted.");
		
	}
	
	
	
}
