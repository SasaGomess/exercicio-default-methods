package model.services;

import java.security.InvalidParameterException;

public interface InterestService {
	
	double getInterest();
	
	default double payment(double amount, int months) {
		//programação defensiva com throw
		if (months < 1) {
			throw new InvalidParameterException("Months must be gretear than zero");
		}
		return amount * Math.pow(1.0 + getInterest() / 100.00, months);
	}

}
