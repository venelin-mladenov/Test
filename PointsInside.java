import java.util.Scanner;


public class PointsInside{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		
		
		if (x > 12.5 && x < 22.5 && y > 6 && y < 13.5){
			if(x > 17.5 && x < 20 && y > 8.5 && y < 13.5){
				System.out.println("Outside");
			}
			else{
				System.out.println("Inside");
			}
		}
		else{
			System.out.println("Outside");
		}
		scan.close();
	}

}
