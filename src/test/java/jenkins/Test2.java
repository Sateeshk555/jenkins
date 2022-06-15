package jenkins;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void second() {
		Reporter.log("hello python", true);
	}

}
