import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class EquivalencePartitionTesting {
	private TaxPayment tpm;
	private double expect;
	String salary;
	@Before
	public void setUp() throws Exception {
		tpm = new TaxPayment();
	}
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{"123564.16555",40523.8744975},
			{"-1565465.13235", 0},
			{"3500", 0},
			{"3500.1", 0.003},
			{"5000",45.0},
			{"8000.00001",345.000002},
			{"12500",1245.0},
			{"38500.023564",7745.0070692},		
			{"58500",13745.0},
			{"83500.0000001",22495.000000045},
			{"13000", 1370},
			{"58510.123", 13748.54305},
			{"5050.123", 50.0123}

		});
	}
	public EquivalencePartitionTesting(String s, double e) {
		salary = s;
		expect = e;
	}
	
	@Test
	public void groupTests() {
		assertEquals (tpm.calculate(salary), expect, 1e-8);
	}

}
