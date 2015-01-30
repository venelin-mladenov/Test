import java.util.Scanner;


public class FormattingNumers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		float b = scan.nextFloat();
		float c = scan.nextFloat();
		System.out.println("|" + String.format("%-10s", Integer.toHexString(a).toUpperCase()) + "|" + String.format("%10s",Integer.toBinaryString(a)).replace(' ', '0') + "|"
				+ String.format("%-10.2f", b) + "|" + String.format("%10.3f", c)  + "|");
		scan.close();
	}

}
