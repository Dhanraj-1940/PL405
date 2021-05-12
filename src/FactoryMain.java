import java.util.Scanner;

public class FactoryMain {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter name of a flower: ");
		String flowerName = in.nextLine();
		
		FlowerFactory ff = new FlowerFactory();
		Flowers flw = ff.getInstance(flowerName);
		
		System.out.println("Details: "+flw.details());
	}

}
