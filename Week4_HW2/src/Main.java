import entities.concretes.*;
import concretes.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Games game = new Games(1,"cs",320.0);
		Gamer gamer = new Gamer(232,"Veysi","Öcal","12345678998",1998,game);
		Campaign campaign = new Campaign(12,"secondfree",50.0);
		
		GameManagerConc gameManager = new GameManagerConc();
		gameManager.add(game);
		gameManager.delete(game);
		gameManager.update(game);
		
		System.out.println("********************");
		
		GamerManagerConc gamerManager = new GamerManagerConc();
		gamerManager.register(gamer);
		gamerManager.validation(gamer);		
		gamerManager.updateInfos(gamer);
		gamerManager.deleteAccount(gamer);
		
		System.out.println("********************");
		
		CampaignManagerConc campaignManager = new CampaignManagerConc();
		campaignManager.add(campaign);
		campaignManager.delete(campaign);
		campaignManager.update(campaign);
		
		System.out.println("********************");
		
		SaleManagerConc saleManager = new SaleManagerConc();
		saleManager.salesGame(game, gamer, campaign);
	}

}
