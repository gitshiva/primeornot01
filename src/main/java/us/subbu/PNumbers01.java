package us.subbu;


public class PNumbers01 {

			
	long blah;
	String result;
	
	public long getBlah() {
		return blah;
	}
	
	public String getResult() {
		boolean PRIME = true;
		//first check to see if the number is 2
		if (blah <= 1) {
		PRIME = false;
		}
		// now check for three
		else if (blah == 2 || blah == 3) {
			PRIME = true;
		}
		// now check for larger numbers
		// start by checking if number is even, easy test
		else if (blah % 2 == 0 || blah % 3 == 0 || blah % 5 == 0 || blah % 7 == 0) {
		// if mod is 0, that means number is evenly divisible, so NOT PRIME
			PRIME = false;
		}
		// now check for even bigger numbers
		else {			
			for (int i = 11; i < (blah/2)+1; i+=2 /* skipping multiples of 2*/) {
				// we want to divide upto half of numToCheck + 1 just to capture edge cases
				// System.out.println(blah + " % " + i + " = " + blah %i);
				if (blah % i == 0) {
					PRIME = false;
					break; //without break, this loop will continue when there is no need to
				}
			}
		}
		/* if (PRIME) {
			System.out.println(blah + " is PRIME");
			}
			else {
				System.out.println(blah + " is NOT prime");
			} */
				
		if (PRIME) {
			return (blah + " is PRIME");
		}
		else {
			return (blah + " is NOT prime");
		}
	}

	public void setBlah(long blah) {
		this.blah = blah;
	}
}