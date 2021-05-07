package concretes;

import abstracts.SaleManager;
import entities.concretes.Campaign;
import entities.concretes.Gamer;
import entities.concretes.Games;

public class SaleManagerConc implements SaleManager{
	public void salesGame(Games game, Gamer gamer, Campaign campaign) {
		System.out.println(game.getName()+ " game is bought by "+gamer.getFirstName()+" with using "+campaign.getCampaignName()+" campaign which include discount of % "+campaign.getDiscount() );
	}
}
