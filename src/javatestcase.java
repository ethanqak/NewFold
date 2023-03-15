import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class javatestcase {

	@Test
	public void NetSaltest() {
		salary test= new salary();
		//Enter 12000 as Basic Salary//
		assertEquals(15372,test.NetSal());
	}

} 

