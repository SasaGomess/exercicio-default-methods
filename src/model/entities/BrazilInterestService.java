package model.entities;


import model.services.InterestService;

public class BrazilInterestService implements InterestService {
	private double interest;

	public BrazilInterestService(double interest) {

		this.interest = interest;
	}
	
	@Override
	public double getInterest() {
		return interest;
	}
	
	
}
