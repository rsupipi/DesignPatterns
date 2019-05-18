package lazy_Instantiation;

public class Lazy {

	private static Lazy obj;

	private Lazy() {
	}

	public static Lazy getLazy() {

		if (obj == null) {
			synchronized (Lazy.class) {
				if (obj == null) {
					obj = new Lazy();
				}
			}
		}
		return obj;
	}
}