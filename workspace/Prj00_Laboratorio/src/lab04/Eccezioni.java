package lab04;

public class Eccezioni extends Object {

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@SuppressWarnings("deprecation")
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Eccezioni []");
		return builder.toString();
	}

	public static void main(String[] args) {

		String s = null;

		System.out.println(s);

		String welcome = "Benvenuto!";

		char[] caratteri = welcome.toCharArray();

		for (int i = 0; i < caratteri.length; i++) {

			System.out.println(caratteri[i]);

		}

		try {
			if (caratteri.length < 9) {
				throw (new Exception("Mio messaggio: non ci provare!"));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());// e.printStackTrace();
		}

		try {
			char lastChar = caratteri[caratteri.length - 1];
			System.out.println(lastChar);

			String sub = welcome.substring(11);

		} catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {

			System.out.println("errore array");

		} catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("si è verificato un errore in lettura");
		}

	}

}