public class Model {

	public int increment(int i) {
		return i = i + 1;
	}

	public int decrement(int i, int max) {
		if (i > max) {
			i = i - 1;
		} else {
			// error
		}
		return i;
	}
}
