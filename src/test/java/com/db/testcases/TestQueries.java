package com.db.testcases;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;

//import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import com.db.dbengine.AllQuery;

@RunWith(JUnitPlatform.class )
public class TestQueries {

	AllQuery aq= null;
	
	@BeforeAll
	public static void init() {
		System.out.println("before all");
	}
	@BeforeEach
	public void setup() {
		System.out.println("before each");
	}
	@Test
	public void testSplitQuery() {
		aq=new AllQuery();
		String expected="select city from ipl.csv";
		String[] resarr=aq.splqry(expected);
		String actual=resarr[0];
		for(int i=1;i<resarr.length;i++)
		{
			actual+=" "+resarr[i];
		}
		Assertions.assertEquals(expected,actual);
	}
	@Test
	public void testextfname() {
		aq=new AllQuery();
		String expected="ipl.csv";
		String[] arr= {"select","city","from","ipl.csv"};
		String actual=aq.extfname(arr);
		Assertions.assertEquals(expected,actual);
	}
	@Test
	public void testQueries() {
		aq=new AllQuery();
		String str="select city from ipl.csv where";
		String actual=aq.beforewhr(str);
		String expected="select city from ipl.csv ";
		Assertions.assertEquals(expected,actual);
	}
	@AfterEach
	public void teardown() {
		System.out.println("after each");
	}
	@AfterAll
	public static void cleanup () {
		System.out.println("after all");
	}
}
