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
public class VendingMachineTest {
	
	/**
	 * Declaring necessary test objects for {@link VendingMachine}
	 */
	private VendingMachineItem item;
	private String code;
	private double amount; 

	/**
	 * Initializes the necessary test objects for the test cases to use.
	 * 
	 * @throws Exception the exception 
	 */
	
	@Before 
	public void setup() throws Exception {
					
	}
	
	/**
	 * Test for the addItem() method of the {@link VendingMachine} class.
	 *  
	 */
	@Test (expected=NullPointerException.class)
	public void testAddItem(){
		VendingMachine test = new VendingMachine();
		int output = test.addItem(item, code);
		assertEquals(null, output, 0);
	}
	
	/**
	 * Test for the removeItem () method of the {@link VendingMachine} class.
	 */
	@Test (expected=NullPointerException.class)
	public void testRemoveItem() {
		VendingMachine test = new VendingMachine();
		VendingMachineItem output = test.removeItem(null);
		assertEquals(null, output, 0);
	}
	
	/**
	 * Test for the insertMoney () method of the {@link VendingMachine} class.
	 */
	@Test
	public void testInsertMoney() {
		VendingMachine test = new VendingMachine();
		VendingMachine output = test.insertMoney(amount);
		assertEquals(null, output, null);
		
	}
				
	/**
	 * Test for the getBalance () method of the {@link VendingMachine} class.
	 */
	@Test
	public void getBalanceTest(){
		VendingMachine test = new VendingMachine();
		double result = test.getBalance();
		assertEquals(0, result, 0);
	}
	
	/**
	 * Test for the makePurchase () method of the {@link VendingMachine} class.
	 * 
	 */
	@Test(expected=NullPointerException.class)
	public void testMakePurchase() {
		VendingMachine test = new VendingMachine();
		boolean output = test.makePurchase(code);
		assertTrue(output);
		
	}
	
	
	/**
	 * Test for the returnChange () method of the {@link VendingMachine} class. 
	 */
	@Test
	public void returnChangeTest(){
		VendingMachine test = new VendingMachine();
		double result = test.returnChange();
		assertEquals(0, result, 0);
	}
	
	@After
	public void tearDown(){
		item = null;
		code = null;
		amount = 0;
		

		
	}

}
