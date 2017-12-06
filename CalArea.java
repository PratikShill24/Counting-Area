import java.util.Scanner;
public class CalArea {
	public static void main(String[] args) {
		double base,height,area;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter Height");
		
		height=input.nextDouble();
		
		System.out.println("The height is"+height);
		
		Scanner input2=new Scanner(System.in);
		
		System.out.println("Enter the base");
		
		base=input2.nextDouble();
		
		System.out.println("The Base is"+base);
		area=0.5*base*height;
		System.out.println("The area is "+area);
		
		
	}

}
