/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi
 * Description: Using JUnit Testing to test my GradeBook File
 * Due: 2/27/2024
 * Platform/compiler:Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Sakash Khanna
*/

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	private GradeBook grade1;
	
	
	@BeforeEach
	/**
	 * prior testing assigning
	 */
	void setUp() throws Exception {
		grade1=new GradeBook(5);
	}

	@AfterEach
	/**
	 * post test reset
	 */
	void tearDown() throws Exception {
		grade1=null;
	}

	@Test
	/**
	 * tests AddScore method
	 */
	void testAddScore() {
		grade1.addScore(7);
		grade1.addScore(9);
		grade1.addScore(3);
		assertTrue(grade1.toString().equals("7.0 9.0 3.0 0.0 0.0 "));
	}

	@Test
	/**
	 * tests Sum method
	 */
	void testSum() {
		grade1.addScore(7);
		grade1.addScore(9);
		grade1.addScore(3);
		assertEquals(19,grade1.sum());
	}

	@Test
	/**
	 * tests minimum method
	 */
	void testMinimum() {
		grade1.addScore(7);
		grade1.addScore(9);
		grade1.addScore(3);
		assertEquals(3,grade1.minimum());
	}

	@Test
	/**
	 * tests finalScore method
	 */
	void testFinalScore() {
		assertEquals(0,grade1.finalScore());
		grade1.addScore(7);
		grade1.addScore(9);
		grade1.addScore(3); 
		assertEquals(16,grade1.finalScore());
	}

}
