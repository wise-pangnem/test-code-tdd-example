package training;

import java.util.ArrayList;
import java.util.List;

public class IntUtils {

	public static List<Integer> returnEvens(Integer... integers) {
		List<Integer> evens = new ArrayList<>();

		for (Integer integer : integers) {
			if (integer % 2 == 0) {
				evens.add(integer);
			}
		}

		return evens;
	}
}
