package abstracts;

import entities.concretes.*;

public interface CampaignManager {
	public void add(Campaign campaign);
	public void delete(Campaign campaign);
	public void update(Campaign campaign);
}
