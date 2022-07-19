package training;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * 실습 3 - 로또 번호
 */
public class LottoNumberTest {

	@ParameterizedTest
	@ValueSource(ints = {
			1, 45
	})
	void 로또넘버생성시_유효한값이_주어지면_생성한_로또넘버를_리턴한다(int number) {
		LottoNumber lottoNumber = new LottoNumber(number);

		assertThat(lottoNumber).isEqualTo(new LottoNumber(number));
	}

	@ParameterizedTest
	@ValueSource(ints = {
			0, -1, 46
	})
	void 로또넘버는_유효하지않은_값일경우_예외발생(int number) {
		assertThatIllegalArgumentException()
				.isThrownBy(() -> new LottoNumber(number))
				.withMessage("유효하지 않은 값입니다.");
	}
}
