package pl.edu.pw.ii.pte.junit.tdd.step2;

import static org.junit.Assert.*;

import org.junit.Test;

public class StackTests {

	@Test
	public void newlyCreatedStackIsEmpty() {
		Stack s = new Stack();

		assertTrue(s.isEmpty());
	}
	
	@Test
	public void afterPushStackIsNoLongerEmpty() {
//  UNCOMMENT FOR SECOND STEP IN TDD		
//		Stack s = new Stack();
//		
//		s.push(1);
//		
//		assertFalse(s.isEmpty());
	}

}
