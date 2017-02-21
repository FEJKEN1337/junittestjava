package pl.edu.pw.ii.pte.junit.timeout;

import org.junit.Test;

public class TimeoutTest {

	@Test(timeout = 1000)
	public void infinity() {
		while (true) {
			;
		}
	}
}
