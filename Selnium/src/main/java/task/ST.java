package task;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ST {
	@Test
	public void ST_01() {
		Reporter.log("IT 1",true);
	}
	@Test
	public void ST_02() {
		Reporter.log("IT 2",true);
	}
}
