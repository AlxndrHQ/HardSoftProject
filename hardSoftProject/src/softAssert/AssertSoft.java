package softAssert; 

import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.Test;

public class AssertSoft {
	public void softAssertTest() {
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(2,2, "Error on the 1st validation");
		soft.assertEquals(1,1, "Error on the 2nd validation");
		soft.assertEquals(1,2, "Error on the 3rd validation");
		soft.assertEquals(2,1, "Error on the 4th validation");
		soft.assertAll();
	}
}

