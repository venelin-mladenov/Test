import java.util.Scanner;


public class CountOfEqualBits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int counter = 0;
		System.out.println(Integer.toBinaryString(n));
		
		while (n > 0){
			if (Long.valueOf(Integer.toBinaryString(n))%10 == Long.valueOf(Integer.toBinaryString(n>>1))%10){
				counter ++;
			}
			n = n >> 1;
		}
		System.out.println(counter);
		scan.close();
	}

}
