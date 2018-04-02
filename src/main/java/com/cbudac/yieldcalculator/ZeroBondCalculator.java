package com.cbudac.yieldcalculator;
import java.math.BigDecimal;
import java.math.RoundingMode;

import com.cbudac.bond.IYieldCalculator;
import com.cbudac.bond.ZeroBond;

public class ZeroBondCalculator implements IYieldCalculator {
	private ZeroBond zeroBond;

	public ZeroBondCalculator(ZeroBond zeroBond){
		this.zeroBond = zeroBond;
	}
	
	@Override
	public BigDecimal calculateBond() {
		BigDecimal price = new BigDecimal(zeroBond.getPrice());
		BigDecimal period = new BigDecimal(zeroBond.getPeriod());
		BigDecimal hdrd = new BigDecimal(100); 

		return ((hdrd.subtract(price)).divide(period.multiply(price))).setScale(3, RoundingMode.HALF_UP);
	}
}
