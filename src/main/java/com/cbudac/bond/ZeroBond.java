package com.cbudac.bond;

import java.math.BigDecimal;

public class ZeroBond implements IBond {
	
	private double period;
	private double price;
	
	public ZeroBond(double price, double period){
		this.period = period;
		this.price = price;
	}
	
	public double getPeriod() {
		return period;
	}


	public double getPrice() {
		return price;
	}	
	
	@Override
	public BigDecimal calculateYield(IYieldCalculatorFactory calculatorFactory) {
		return calculatorFactory.getYieldCalculator(this).calculateBond();
	}
}
