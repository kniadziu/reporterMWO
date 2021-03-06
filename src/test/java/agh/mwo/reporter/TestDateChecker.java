package agh.mwo.reporter;

import org.junit.Assert;
import org.junit.Test;

public class TestDateChecker {
	@Test
	public void testStartDateFromCommandLineSetWithFlag() {
		DateChecker dateChecker = new DateChecker();
		String opt = "Start";
		String date = "2016-02-11";
		String path = "src\\database\\";
		String result = "";
		try {
			result = dateChecker.setDate(opt, date, path);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Assert.assertEquals(result, date);
	}
	
	@Test
	public void testStartDateFromCommandLineNotSetInFlagSetInPath() {
		DateChecker dateChecker = new DateChecker();
		String opt = "start";
		String date = null;
		String path = "src\\database\\2018\\12";
		String result = "";
		try {
			result = dateChecker.setDate(opt, date, path);
		} catch (Exception e) {
			e.printStackTrace();
		}
		String expected = "2018-12-01";
		Assert.assertEquals(expected, result);
	}
 	
}
