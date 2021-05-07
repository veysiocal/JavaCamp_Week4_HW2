package concretes;

import abstracts.CampaignManager;
import entities.concretes.Campaign;
import entities.concretes.Gamer;

public class CampaignManagerConc implements CampaignManager{

	@Override
	public void add(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println(campaign.getCampaignName()+" campaign is added.");
	}

	@Override
	public void delete(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println(campaign.getCampaignName()+" campaign is deleted.");
	}

	@Override
	public void update(Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println(campaign.getCampaignName()+" campaign is updated.");
		
	}
	
}
