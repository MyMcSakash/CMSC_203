/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi
 * Description: Tests CryptoManger.java's methods
 * Due: 2/27/2024
 * Platform/compiler:Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Sakash Khanna
 */


import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CryptoManagerTestStudent {

	@Test
	void testIsStringInBounds() {
		assertTrue(CryptoManager.isStringInBounds("THIS SHOULD PASS"));
		assertTrue(CryptoManager.isStringInBounds("\"GOOD NIGHT\""));
		assertFalse(CryptoManager.isStringInBounds("#sleepy"));
		assertFalse(CryptoManager.isStringInBounds("TiRED"));
		assertTrue(CryptoManager.isStringInBounds("\"THIS SHOULD NOT PASS BECAUSE ' IS OUTSIDE THE RANGE\""));
	}//testIsStringInBounds

	@Test
	void testCaesarEncryption() {
		assertEquals("The selected string is not in bounds, Try again.", CryptoManager.caesarEncryption("hello", 6));
		assertEquals("GHI", CryptoManager.caesarEncryption("CDE", 4));
		assertEquals("*'..1", CryptoManager.caesarEncryption("HELLO", 98));
		assertEquals("2::/K9423?", CryptoManager.caesarEncryption("GOOD NIGHT", 107));
		assertEquals("_P^_TYR+T_", CryptoManager.caesarEncryption("TESTING IT", 11));
		assertEquals("WKLV#LV#DQRWKHU#H[DPSOH#RI#WHVW", CryptoManager.caesarEncryption("THIS IS ANOTHER EXAMPLE OF TEST", 3));
	}//testCaesarEncryption

	@Test
	void testBellasoEncryption() {
		assertEquals("\\T*3", CryptoManager.bellasoEncryption("TEST", "HOW_COME_THIS_STRING_IS_LONG"));
		assertEquals("OP_T[9GP!#LFZ^", CryptoManager.bellasoEncryption("HAPPY BIRTHDAY", "GOODBYE"));
		assertEquals("K^$3PJ-\\,UX&W\"", CryptoManager.bellasoEncryption("HOW MANY TESTS", "COMSCI_CLASS"));
		
	}//testBellasoEncryption

	@Test
	void testCaesarDecryption() {
		assertEquals("STORIES", CryptoManager.caesarDecryption("Z[VYPLZ", 7));
		assertEquals("TRYING A STRING AGAIN", CryptoManager.caesarDecryption("\\Z!QVO(I([\\ZQVO(IOIQV", 968));
		assertEquals("VERY BUSY", CryptoManager.caesarDecryption("Q@MT[=PNT", 315));
		assertEquals("THIS IS AN EXAMPLE TEST", CryptoManager.caesarDecryption("XLMW$MW$ER$I\\EQTPI$XIWX", 4));
	}//testCaesarDecryption

	@Test
	void testBellasoDecryption() {
		assertEquals("NINE", CryptoManager.bellasoDecryption("%QOY", "WHAT_IS_YOUR_AGE"));
		assertEquals("GOOD", CryptoManager.bellasoDecryption("UXVL", "NIGHT"));
		assertEquals("TEST AMOUNT", CryptoManager.bellasoDecryption("WQT'3DYP(!W", "CLASS"));
		
		
	}//testBellasoDecryption

}
