package edu.psu.se411.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StackTest {

	private Stack<String> stack = new Stack<String>();
	
	@BeforeEach
	public void init() {
		stack = new Stack<String>();
	}
	
	@Test
	public void checkSomething() {
		stack.push("selem");
		stack.push("ciao");
		stack.pop();
		stack.push("hallo");
		assertEquals("hallo", stack.pop(), "Push-Pop should be correct");
	}
	
	@Test
	public void checkEmptyStackPopThrowsException() {
		NoSuchElementException thrown = assertThrows(NoSuchElementException.class,
				() -> stack.pop(),
		      "Expected pop from empty Stack to throw, but it didn't"
		);

        assertTrue(thrown.getMessage().equals("Stack is empty, cannot pop"));

}

	@Test
	public void checkPoopedElementsInReverseOrder() {
		String result = "";
		stack.push("A");
		stack.push("B");
		stack.pop();
		stack.pop();
		stack.push("C");
		stack.push("D");
		stack.push("E");
		stack.push("F");
		for(int i = 0; i<4; i++) {
			result += stack.pop();
		}
		assertEquals("FEDC", result, "Popped elements should be in reverse order");
	}
	
}
