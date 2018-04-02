import java.util.HashSet;
import java.util.Set;

import com.cbudac.bond.IBond;
import com.cbudac.bond.IYieldCalculatorFactory;
import com.cbudac.bond.RealBond;
import com.cbudac.bond.RegularBond;
import com.cbudac.bond.ZeroBond;
import com.cbudac.yieldcalculator.YieldCalculatorFactory;

public class Solution
{
    public static void main(String [] args) throws Exception
    {
    	Set<IBond> bonds = new HashSet<IBond>();
    	bonds.add(new RegularBond(80.0, 10.0, 0.05));
    	bonds.add(new RealBond(80.0, 10.0, 0.05, 0.01));
    	bonds.add(new ZeroBond(80.0, 10.0));
    	
    	IYieldCalculatorFactory ycf = new YieldCalculatorFactory();
    	for (IBond bond : bonds) {
    		System.out.println(bond.calculateYield(ycf));

		}
    }
}
