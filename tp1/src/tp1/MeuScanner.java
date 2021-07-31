package tp1;
import java.util.Scanner;

public class MeuScanner {
	public static int getInt() {
		Scanner read = new Scanner(System.in);
		return read.nextInt();
	}
	public static double getDouble() {
		Scanner read = new Scanner(System.in);
		return read.nextDouble();
	}
	public static short getShort() {
		Scanner read = new Scanner(System.in);
		return read.nextShort();
	}
	public static String getString() {
		Scanner read = new Scanner(System.in);
		return read.nextLine();
	}

}
