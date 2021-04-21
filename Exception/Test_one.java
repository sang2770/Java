package Exception;

public class Test_one {
	public static void main(String arg[]) {
		/*
		 * Exception String
		 */
		String nameString=null;
		try {
			Show(nameString);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			
		}
		/*
		 * Array
		 */
		String[] aStrings= {"1", "2", "2"};
		try {
			System.out.println(aStrings[4]);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	static void Show(String a) {
		if(a==null)
			throw new NullPointerException("Chuoi rong");
		else {
			System.out.println(a.length());
		}
	}
}
