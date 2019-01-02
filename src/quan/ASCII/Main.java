package quan.ASCII;

import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "Nguyen";
//		byte[] bytes = string.getBytes(StandardCharsets.US_ASCII);
		byte[] bytes = string.getBytes(StandardCharsets.US_ASCII);
		System.out.println("Convert " + string + " to ASCII: ");

		for (byte b : bytes) {
			System.out.println(b);
		}
	}

}
