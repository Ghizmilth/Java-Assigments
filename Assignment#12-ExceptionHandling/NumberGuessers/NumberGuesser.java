/**
Program submitted by Hidaner Ferrer
*/

public class NumberGuesser {

	protected int high;
	protected int low;

	private int originalHigh;
	private int originalLow;

	public NumberGuesser(int l, int h) {
		low = originalLow = l;
		high = originalHigh = h;
	}

	public int getCurrentGuess() {
		return (high + low) / 2;
	}

	public void higher() {
				if((high-low) == 2){
					throw new IllegalStateException("Error: There is not more range left to guess.");
			  }
				low = getCurrentGuess() + 1;
	}

	public void lower() {
			if((low-high) == 2){
			throw new IllegalStateException("Error: There is not more range left to guess.");
			}
			high = getCurrentGuess() - 1;
	}

	public void reset() {
		low = originalLow;
		high = originalHigh;
	}
}
