package training;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class LottoNumberTest {

	@Test
	void _1부터_45의값은_허용된값() {
		LottonNumber lottonNumber = new LottonNumber(1);
		assertThat(lottonNumber).isEqualTo(new LottonNumber(1));

		lottonNumber = new LottonNumber(45);
		assertThat(lottonNumber).isEqualTo(new LottonNumber(45));
	}

	@ParameterizedTest
	@ValueSource(ints = {
			0, -1, 46
	})
	void 올바르지않은_값(Integer aInt) {
		assertThatThrownBy(() -> {
			new LottonNumber(aInt);
		}).isInstanceOf(IllegalArgumentException.class);
	}
}
