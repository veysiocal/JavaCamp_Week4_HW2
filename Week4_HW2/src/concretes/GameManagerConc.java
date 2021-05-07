package concretes;

import abstracts.GameManager;
import entities.concretes.Games;

public class GameManagerConc implements GameManager{

	@Override
	public void add(Games game) {
		// TODO Auto-generated method stub
		System.out.println(game.getName()+" is added.");
		
	}

	@Override
	public void delete(Games game) {
		// TODO Auto-generated method stub
		System.out.println(game.getName()+" is deleted.");
	}

	@Override
	public void update(Games game) {
		// TODO Auto-generated method stub
		System.out.println(game.getName()+" is updated.");
	}
	
}
