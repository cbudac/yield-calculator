package com.cbudac.bond;
import java.math.BigDecimal;

public interface IBond {
	BigDecimal calculateYield(IYieldCalculatorFactory calculatorFactory);
}
