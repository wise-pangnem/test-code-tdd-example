package training;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.commons.util.StringUtils;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * 실습1 - 라이브러리 학습 테스트 (StringUtils)
 */
public class StringUtilsTest {

	@Test
	void isBlank() {
		assertThat(StringUtils.isBlank(null)).isTrue();
		assertThat(StringUtils.isBlank("")).isTrue();
		assertThat(StringUtils.isBlank(" ")).isTrue();
	}

	@ParameterizedTest
	@NullAndEmptySource
	@ValueSource(strings = {
			" "
	})
	void isBlankWithParameters(String aString) {
		boolean isBlank = StringUtils.isBlank(aString);
		assertThat(isBlank).isTrue();
	}

}
