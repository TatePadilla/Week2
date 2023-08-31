package controller;

import static org.junit.Assert.*;

import org.junit.Test;

import contoller.StringAppendage;

public class StringAppendageTest {
	StringAppendage stringApp = new StringAppendage();

	@Test
	public void testAppendage() {
		assertEquals("Tate love's java", stringApp.append("Tate ", "love's java"));
	}

	@Test
	public void testAppendageFail() {
		assertEquals("Tate hates java", stringApp.append("Tate ", "love's java"));
	}
}
