package pl.edu.pw.ii.pte.junit.tdd.step4.result;

import static org.junit.Assert.*;

import java.util.EmptyStackException;

import org.junit.Test;

public class StackTests {

	@Test
	public void newlyCreatedStackIsEmpty() {
		Stack s = new Stack();

		assertTrue(s.isEmpty());
	}

	@Test
	public void afterPushStackIsNoLongerEmpty() {
		Stack s = new Stack();

		s.push(1);

		assertFalse(s.isEmpty());
	}

	@Test
	public void afterPushAndPopStackIsEmptyAgain() {
		Stack s = new Stack();

		s.push(1);
		s.pop();

		assertTrue(s.isEmpty());
	}

	@Test(expected = EmptyStackException.class)
	public void emptyStackThrowsOnPop() {
		Stack s = new Stack();

		s.pop();
	}

}
