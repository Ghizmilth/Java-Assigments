/**
Program submitted by Hidaner Ferrer
*/

import java.util.Random;

public class RandomNumberGuesser extends NumberGuesser {

	private int randomValue;
	private boolean randomValueNeedsUpdating;
	private Random generator;

	public RandomNumberGuesser(int l, int h) {
		super(l, h);

		randomValueNeedsUpdating = true;
		generator = new Random();
	}

	public int getCurrentGuess() {

		if (randomValueNeedsUpdating) {
			randomValue = low + (generator.nextInt((high - low) + 1));
			randomValueNeedsUpdating = false;
		}

		return randomValue;
	}

	public void higher() {
		super.higher();
		if((high-low) < 1){
			throw new IllegalArgumentException("A negative bound is not accepted");
		}
		randomValueNeedsUpdating = true;
	}

	public void lower() {
		super.lower();
		if((high-low) < 1){
			throw new IllegalArgumentException("A negative bound is not accepted");
		}
		randomValueNeedsUpdating = true;
	}

	public void reset() {
		super.reset();
		randomValueNeedsUpdating = true;
	}

}
