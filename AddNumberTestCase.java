package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class AddNumberTestCase {
	
	@Test
	void testEmpty() {
		assertEquals(AddNumbers.add("",","),0);
	}
	
	@Test
	void testValues() {
		assertEquals(AddNumbers.add("1,2",","),3);
	}
	
	@Test
	void testValues1() {
		assertEquals(AddNumbers.add("1\n2,3",","),6);
	}
	
	@Test
	void testValues2() {
		assertEquals(AddNumbers.add("//;\\n1;2",";"),3);
	}
	
	@Test
	void testValues3() {
		assertEquals(AddNumbers.add("1,\n",","),0);
	}
	
	@Test
	void testValues4() {
		assertEquals(AddNumbers.add("-2,6",","),-1);
	}
}
