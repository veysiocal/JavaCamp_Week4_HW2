package abstracts;

import entities.concretes.Gamer;

public interface GamerManager {
	public void register(Gamer gamer);
	public void updateInfos(Gamer gamer);
	public void deleteAccount(Gamer gamer);
}
