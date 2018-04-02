package com.cbudac.bond;

import java.math.BigDecimal;

public class RealBond extends RegularBond{

	private double cpiRate;
	
	public RealBond(double period, double price, double couponRate, double cpiRate){
		super(period, price, couponRate);
		this.cpiRate = cpiRate;
	}
	
	public double getCpiRate() {
		return cpiRate;
	}

	@Override
	public BigDecimal calculateYield(IYieldCalculatorFactory calculatorFactory) {
		return calculatorFactory.getYieldCalculator(this).calculateBond();
	}
}
