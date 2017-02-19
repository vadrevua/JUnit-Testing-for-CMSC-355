//Aditya Vadrevu
//CMSC 355
//Professor Debra Duke
//2/17/2017

public class Rational {
	int numeratorNum;
	int denominatorNum;

	public Rational() { // default constructor
		numeratorNum = 0;
		denominatorNum = 1;
	}

	public Rational(int numerator, int denominator) { // overloaded constructor with 2 variables
		numeratorNum = numerator;
		denominatorNum = denominator;
		if (denominatorNum == 0) {
			throw new IllegalArgumentException("denominator Cannot equal 0"); // throws exception if user inputs 0 as denominator
		}
	}

	// setters and getters
	public int getNumeratorNum() {
		return numeratorNum;
	}

	public void setNumeratorNum(int numeratorNum) {
		this.numeratorNum = numeratorNum;
	}

	public int getDenominatorNum() {
		return denominatorNum;
	}

	public void setDenominatorNum(int denominatorNum) {
		this.denominatorNum = denominatorNum;
	}

	// normalizing signs
	public void normalize() {
		if (numeratorNum < 0 && denominatorNum < 0) {
			Math.abs(numeratorNum);
			Math.abs(denominatorNum);
		} else if (denominatorNum < 0) {
			Math.abs(denominatorNum);
			numeratorNum = -1 * numeratorNum;
		} else {
			Math.abs(numeratorNum);
			Math.abs(denominatorNum);
		}
	}

	// addition
	public void add(Rational rationalNum2) {
		this.normalize();
		rationalNum2.normalize();

		numeratorNum = (this.getNumeratorNum() * rationalNum2.getDenominatorNum()
				+ this.getDenominatorNum() * rationalNum2.getNumeratorNum());
		denominatorNum = this.getDenominatorNum() * rationalNum2.getDenominatorNum();

	}

	// subtraction
	public void subtract(Rational rationalNum2) {
		this.normalize();
		rationalNum2.normalize();

		numeratorNum = (this.getNumeratorNum() * rationalNum2.getDenominatorNum()
				- this.getDenominatorNum() * rationalNum2.getNumeratorNum());

		denominatorNum = this.getDenominatorNum() * rationalNum2.getDenominatorNum();

	}

	// multiplication
	public void multiply(Rational rationalNum2) {
		this.normalize();
		rationalNum2.normalize();

		this.numeratorNum = this.getNumeratorNum() * rationalNum2.getNumeratorNum();
		this.denominatorNum = this.getDenominatorNum() * rationalNum2.getDenominatorNum();

	}

	// division
	public void divide(Rational rationalNum2) {
		this.normalize();
		rationalNum2.normalize();

		this.numeratorNum = this.getNumeratorNum() * rationalNum2.getDenominatorNum();
		this.denominatorNum = this.getDenominatorNum() * rationalNum2.getNumeratorNum();

	}

	// overriding equals
	@Override
	public boolean equals(Object obj) {
		this.normalize();
		Rational rationalNum2 = (Rational) obj;
		rationalNum2.normalize();
		int tempVar1 = this.getNumeratorNum() * rationalNum2.getDenominatorNum();
		int tempVar2 = this.getDenominatorNum() * rationalNum2.getNumeratorNum();
		if (tempVar1 == tempVar2) {
			return true;
		} else {
			return false;
		}
	}

	// overriding toString
	@Override
	public String toString() {
		return this.getNumeratorNum() + "/" + this.getDenominatorNum();
	}
}
