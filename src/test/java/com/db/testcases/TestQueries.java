package com.db.testcases;

import static org.junit.jupiter.api.Assertions.assertEquals;

//import static org.junit.Assert.assertEquals;

//import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
//import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import com.db.dbengine.AllQuery;

@RunWith(JUnitPlatform.class)
public class TestQueries {

	AllQuery aq=null;
	
	@BeforeAll
	public static void init() {
		System.out.println("before all");
	}
	@BeforeEach
	public void setup() {
		aq =new AllQuery();
		System.out.println("before each");
	}
	@Test
	public void test1() {
		String[] qry= {"select","city","from","ipl.csv"};
		String expected= "ipl.csv";
		String actual=aq.extfname(qry);
		assertEquals(expected,actual);
	}
	@Test
	public void testbeforewhr() {
		String qry= "select city from ipl.csv where";
		String expected= "select city from ipl.csv ";
		String actual=aq.beforewhr(qry);
		assertEquals(expected,actual);
	}	
	/*@Test
	public void testafterwhr() {
		String qry= "select city from ipl.csv where id > 50";
		String expected= " id > 50";
		String actual=aq.afterwhr(qry);
		assertEquals(expected,actual);
	}*/
	@AfterEach
	public void tearDown() {
		aq=null;
		System.out.println("after each");
	}
	
	@AfterAll
	public static void cleanup() {
		System.out.println("after all");
	}

}
