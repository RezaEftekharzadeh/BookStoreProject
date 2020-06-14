package com.bookstoredb.entity;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {

	@Test
	public void test() {
		Calculator calculator=new Calculator();
		int a=12;
		int b=13;
		int result=calculator.add(a, b);
		int expected=2;
		assertEquals(expected, result);
	}

}
