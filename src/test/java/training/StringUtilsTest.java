package training;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.commons.util.StringUtils;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class StringUtilsTest {

	@Test
	void StringUtils의_isBlank테스트() {
		assertThat(StringUtils.isBlank("")).isTrue();
		assertThat(StringUtils.isBlank(" ")).isTrue();
		assertThat(StringUtils.isBlank(null)).isTrue();
	}

	@ParameterizedTest
	@NullSource
	@ValueSource(strings = {
			"", " "
	})
	void StringUtils의_isBlank테스트_2(String aString) {
		assertThat(StringUtils.isBlank(aString)).isTrue();
	}

}
