package entities.concretes;

import entities.abstracts.Entity;
public class Gamer implements Entity{
	private int id;
	private String firstName;
	private String lastName;
	private String nationalityId;
	private int dateOfBirth;
	private Games games;
	
	public Gamer(int id, String firstName, String lastName, String nationalityId, int dateOfBirth, Games games) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		this.dateOfBirth = dateOfBirth;
		this.games = games;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public int getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Games getGames() {
		return games;
	}

	public void setGames(Games games) {
		this.games = games;
	}
	
	
	
}
