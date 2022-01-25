package lab06;

import java.io.IOException;
import java.util.Properties;

public class HelloSystem {

	public static void main(String[] args) {


		String property = System.getProperty("java.vendor");
		System.out.println(property);

		Properties properties = System.getProperties();
		
		properties.list(System.out);
		
		try {
			Runtime.getRuntime().exec("sol");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
