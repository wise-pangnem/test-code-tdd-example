package training;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 실습2 - 짝수 목록만 리턴
 */
class IntUtilsTest {

	@Test
	void returnEvens_메서드는_짝수들을_리턴한다() {
		List<Integer> evens = IntUtils.returnEvens(1, 2, 3, 4, 5);

		assertThat(evens).containsExactly(2, 4);
	}
}
