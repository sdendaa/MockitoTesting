package junit.entity;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickBeforAfterTest {
	
	@BeforeClass// Especially used for data connection
	public static void setUpClass(){
		System.out.println("Before class");
	}

	@Before// to setup before each test case especially when entities data change 
	//between different cases
	public void setUp() {
		System.out.println("Before test");
	}
	
	@Test
	public void test1() {
		System.out.println("Test one executed");
	}
	@Test
	public void test2() {
		System.out.println("Test two executed");
	}

	@After//to clear data after each test case
	public void tearDown() {
		System.out.println("After test");
	}
	
	@AfterClass
	public static void tearDownClass(){
		System.out.println("after class");
	}

}
