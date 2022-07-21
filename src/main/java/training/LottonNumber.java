package training;

import java.util.Objects;

public record LottonNumber(int number) {
	public static final int MIN_NUMBER = 1;
	public static final int MAX_NUMBER = 45;

	public LottonNumber {
		validate(number);
	}

	private void validate(int number) {
		if (number < MIN_NUMBER || number > MAX_NUMBER) {
			throw new IllegalArgumentException();
		}
	}
}
