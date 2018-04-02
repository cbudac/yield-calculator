package com.cbudac.yieldcalculator;

import com.cbudac.bond.IYieldCalculator;
import com.cbudac.bond.IYieldCalculatorFactory;
import com.cbudac.bond.RealBond;
import com.cbudac.bond.RegularBond;
import com.cbudac.bond.ZeroBond;

public class YieldCalculatorFactory implements IYieldCalculatorFactory {

	@Override
	public IYieldCalculator getYieldCalculator(RealBond bond) {
		return new RealBondCalculator(bond);
	}

	@Override
	public IYieldCalculator getYieldCalculator(RegularBond bond) {
		return new RegularBondCalculator(bond);
	}

	@Override
	public IYieldCalculator getYieldCalculator(ZeroBond bond) {
		return new ZeroBondCalculator(bond);
	}

}
