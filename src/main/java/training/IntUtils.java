package training;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class IntUtils {

	public static List<Integer> returnEvens(Integer... integers) {
		return Arrays.stream(integers)
				.filter(IntUtils::isEven)
				.collect(toList());
	}

	private static boolean isEven(Integer integer) {
		return integer % 2 == 0;
	}

}
