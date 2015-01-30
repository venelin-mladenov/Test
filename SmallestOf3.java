import java.text.DecimalFormat;
import java.util.Scanner;


public class SmallestOf3{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		DecimalFormat df = new DecimalFormat("###.#");
		System.out.println(df.format(Math.min(a,Math.min(b,c))));
		scan.close();
	}

}
