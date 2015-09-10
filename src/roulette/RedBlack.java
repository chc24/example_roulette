package roulette;

import util.ConsoleReader;

public class RedBlack extends Bet{

	public RedBlack(String description, int odds) {
		super(description, odds);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String placeBet() {
		// TODO Auto-generated method stub
		String result = ConsoleReader.promptOneOf("Please bet", Wheel.BLACK, Wheel.RED);
		return result;
	}

	@Override
	public boolean betIsMade() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
