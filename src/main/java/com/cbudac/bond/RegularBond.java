package com.cbudac.bond;

import java.math.BigDecimal;

public class RegularBond extends ZeroBond{
	
	private double couponRate;
	
	public RegularBond(double period, double price, double couponRate){
		super(period, price);
		this.couponRate = couponRate;
	}

	public double getCouponRate() {
		return couponRate;
	}

	@Override
	public BigDecimal calculateYield(IYieldCalculatorFactory calculatorFactory) {
		return calculatorFactory.getYieldCalculator(this).calculateBond();
	}
}
