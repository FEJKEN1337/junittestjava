package pl.edu.pw.ii.pte.junit.timeout;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;

public class GlobalTimeoutTest {
	public static String log;

	@Rule
	public Timeout globalTimeout = Timeout.seconds(1); // 1 second max per
														// method tested

	@Test
	public void infinity() throws Exception {
		while (true) {
			;
		}
	}

	@Test
	public void testSleepForTooLong() throws Exception {
		log += "ran1";
		Thread.sleep(100_000); // sleep for 100 seconds
	}

}
