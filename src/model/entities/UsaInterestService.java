package model.entities;
 

import model.services.InterestService;

public class UsaInterestService implements InterestService {
	private double interest;

	public UsaInterestService(double interest) {
		this.interest = interest;
	}
	
	@Override
	public double getInterest() {
		return interest;
	}
	

}
