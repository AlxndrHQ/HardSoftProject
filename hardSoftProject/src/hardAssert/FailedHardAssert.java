package hardAssert;

import org.testng.Assert; 
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FailedHardAssert {
	public void hardAssertTest() {
		Assert.assertEquals(2,2, "Error on the 1st validation");
		Assert.assertEquals(1,1, "Error on the 2nd validation");
		Assert.assertEquals(1,2, "Error on the 3rd validation");
		Assert.assertEquals(1,1, "Error on the 4th validation");
	}
}
