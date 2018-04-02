package com.cbudac.bond;

public interface IYieldCalculatorFactory {
	IYieldCalculator getYieldCalculator(RealBond bond);
	IYieldCalculator getYieldCalculator(RegularBond bond);
	IYieldCalculator getYieldCalculator(ZeroBond bond);
}
