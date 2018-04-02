package com.cbudac.yieldcalculator;
import java.math.BigDecimal;
import java.math.RoundingMode;

import com.cbudac.bond.IYieldCalculator;
import com.cbudac.bond.RegularBond;

public class RegularBondCalculator implements IYieldCalculator {
	private RegularBond regularBond;
	
	public RegularBondCalculator(RegularBond regularBond){
		this.regularBond = regularBond;
	}
	
	@Override
	public BigDecimal calculateBond() {
		BigDecimal price = new BigDecimal(regularBond.getPrice());
		BigDecimal period = new BigDecimal(regularBond.getPeriod());
		BigDecimal couponRate = new BigDecimal(regularBond.getCouponRate());
		
		BigDecimal hdrd = new BigDecimal(100); 

		return ((hdrd.subtract(price)).divide(period.multiply(price))).add(couponRate).setScale(3, RoundingMode.HALF_UP);
	}
}
