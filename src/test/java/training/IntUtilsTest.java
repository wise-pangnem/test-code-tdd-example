package training;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class IntUtilsTest {

	@Test
	void returnEvens_테스트() {
		List<Integer> integers =
				IntUtils.returnEvens(1, 2, 3, 4, 5);

		assertThat(integers).containsExactly(2, 4);
	}
}
