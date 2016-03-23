/**
 * 
 */
package edu.towson.cis.cosc603.project4.vendingmachine;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Obed Dominguez
 *
 */
public class VendingMachineItemTest {
	
	/**
	 * Declaring necessary test objects for {@link VendingMachineItem}
	 */
	VendingMachineItem name, price;
	VendingMachineException expected;
	 
	
	/**
	 * Initializes the necessary test objects for the test cases to use. 
	 * @param VendingMachineException 
	 * 
	 * @throws Exception the exception
	 */
	
	@Before 
	public void setup() throws VendingMachineException{
		name = new VendingMachineItem("name", 0);
		price = new VendingMachineItem("price", 1);
		expected = new VendingMachineException ("PRICE_LESS_THAN_ZERO_MESSAGE");
	}
	
	/**
	 * Test for the VendingMachineItem () method of the {@link VendingMachineItem} class 
	 * @param <expected>
	 * 
	 */
	@Test
	public void VendingMachineItemConstructorTest(){
		VendingMachineItem test = new VendingMachineItem (null, 0);
		VendingMachineException message = new VendingMachineException("PRICE_LESS_THAN_ZERO_MESSAGE");
		
		String output = test.getName();
		assertNull(output);
		
		double output1 = test.getPrice();
		assertEquals(0, output1, 0);
		
		String errorMessage = message.getMessage();
		assertEquals("PRICE_LESS_THAN_ZERO_MESSAGE", errorMessage, "PRICE_LESS_THAN_ZERO_MESSAGE");
		
	}
	
	 /**
	 * Test for the getName() method of the {@link VendingMachineItem} class
	 * This is testing a string for the getName
	 */
	@Test
	public void getNametest() {
		VendingMachineItem test = new VendingMachineItem("name", 0);
		String output = test.getName();
		assertEquals("name", output, "name");
	}
	
	/**
	 * Test for the getPrice() method of the {@link VendingMachineItem} class
	 * This is testing for a price of double value in the getPrice.  
	 */
		
	@Test
	public void getPriceTest() {
		VendingMachineItem test = new VendingMachineItem(null, 5);
		double output = test.getPrice();
		assertEquals(5, output, 4);
		
	}
	
	/**
	 * Cleans up test object after a test case is executed. 
	 */
	
	@After 
	public void tearDown(){
		name = null;
		price = null;
	}
}
