package example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ExpectTest {

	@Test
	@DisplayName("우리는 1 더하기 2는 3이 나오기를 기대합니다.")
	void _1_더하기_2는_3이다() {
		assertThat(1 + 2).isEqualTo(3);
	}
}
