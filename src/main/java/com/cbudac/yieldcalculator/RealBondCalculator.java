package com.cbudac.yieldcalculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

import com.cbudac.bond.IYieldCalculator;
import com.cbudac.bond.RealBond;

public class RealBondCalculator implements IYieldCalculator {
	private RealBond realBond;
	
	public RealBondCalculator(RealBond realBond){
		this.realBond = realBond;
	}
	
	@Override
	public BigDecimal calculateBond() {
		BigDecimal price = new BigDecimal(realBond.getPrice());
		BigDecimal period = new BigDecimal(realBond.getPeriod());
		BigDecimal couponRate = new BigDecimal(realBond.getCouponRate());
		BigDecimal cpiRate = new BigDecimal(realBond.getCpiRate());
		
		BigDecimal hdrd = new BigDecimal(100); 

		return ((((hdrd.subtract(price)).divide(period.multiply(price))).add(couponRate)).add(cpiRate)).setScale(3, RoundingMode.HALF_UP);
	}
}
