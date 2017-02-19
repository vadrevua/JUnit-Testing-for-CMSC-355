
//Aditya Vadrevu
//CMSC 355
//Professor Debra Duke
//2/17/2017

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Assert;

public class RationalTest {

	Rational fraction1 = new Rational(1, 2);
	Rational fraction2 = new Rational(1, 4);

	@Test(expected = IllegalArgumentException.class)
	public void testDenominatorIsZero() {
		Rational fraction0 = new Rational(1, 0);
		if (fraction0.denominatorNum == 0) {
			Assert.fail("Denominator is zero");
		}
	}

	@Test
	public void testAddition() {
		fraction1.setNumeratorNum(1);
		fraction1.setDenominatorNum(2);
		fraction1.add(fraction2);
		if (fraction1.getNumeratorNum() != 6 && fraction1.getDenominatorNum() != 8) {
			Assert.fail("not 6/8");
		} else {
			Assert.assertTrue(true);
		}
	}

	@Test
	public void testSubtraction() {
		fraction1.setNumeratorNum(1);
		fraction1.setDenominatorNum(2);
		fraction1.subtract(fraction2);
		if (fraction1.getNumeratorNum() != 2 && fraction2.getDenominatorNum() != 8) {
			Assert.fail("not 2/8");
		} else {
			Assert.assertTrue(true);
		}
	}

	@Test
	public void testMultiplication() {
		fraction1.setNumeratorNum(1);
		fraction1.setDenominatorNum(2);
		fraction1.multiply(fraction2);
		if (fraction1.getNumeratorNum() != 1 && fraction1.getDenominatorNum() != 8) {
			Assert.fail("not 1/8");
		} else {
			Assert.assertTrue(true);
		}
	}

	@Test
	public void testDivision() {
		fraction1.setNumeratorNum(1);
		fraction1.setDenominatorNum(2);
		fraction1.divide(fraction2);
		if (fraction1.getNumeratorNum() != 4 && fraction1.getDenominatorNum() != 2) {
			Assert.fail("not 4/2");
		} else {
			Assert.assertTrue(true);
		}
	}

	@Test
	public void testBothSigns(){
		fraction1.setNumeratorNum(-1);
		fraction1.setDenominatorNum(-2);
		fraction2.setNumeratorNum(1);
		fraction2.setDenominatorNum(2);
		fraction1.normalize();
		
		if(fraction1.equals(fraction2)){
			Assert.assertTrue(true);
		}
		else{
			Assert.assertFalse(false);
		}
	}
	
	@Test
	public void testDenominatorSign(){
		fraction1.setNumeratorNum(1);
		fraction1.setDenominatorNum(-2);
		fraction2.setNumeratorNum(-1);
		fraction2.setDenominatorNum(2);
		if(fraction1.equals(fraction2)){
			Assert.assertTrue(true);
		}
		else{
			Assert.assertFalse(false);
		}
	}
	
	@Test
	public void testNumeratorIsZero(){
		fraction1.setNumeratorNum(0);
		fraction1.setDenominatorNum(-2);
		fraction2.setNumeratorNum(0);
		fraction2.setDenominatorNum(2);
		if(fraction1.equals(fraction2)){
			Assert.assertTrue(true);
		}
		else{
			Assert.assertFalse(false);
		}
	}
	
	@Test
	public void testEquals() {
		fraction1.setNumeratorNum(1);
		fraction1.setDenominatorNum(4);
		fraction2.setNumeratorNum(1);
		fraction2.setDenominatorNum(4);
		if (fraction1.equals(fraction2)) {
			Assert.assertTrue(true);
		} else {
			Assert.fail("not equal");
		}
	}

	@Test
	public void testToString() {
		String val = "";
		fraction1.setNumeratorNum(1);
		fraction1.setDenominatorNum(2);
		val = fraction1.toString();
		if (val.equals("1/2")) {
			Assert.assertTrue(true);
		} else {
			Assert.fail("not correctly printing ToString");
		}
	}

}
