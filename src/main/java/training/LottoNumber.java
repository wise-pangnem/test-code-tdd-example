package training;

public record LottoNumber(
		int number
) {
	private static final int MIN_NUMBER = 1;
	private static final int MAX_NUMBER = 45;

	public LottoNumber {
		validateScope(number);
	}

	private void validateScope(int number) {
		if (number < MIN_NUMBER || number > MAX_NUMBER) {
			throw new IllegalArgumentException("유효하지 않은 값입니다.");
		}
	}
}
