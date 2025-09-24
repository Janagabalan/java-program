import java.util.Scanner;
public class Area_of_rectangle {

	public static void main(String[] args) {
		double length,breath,area;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length: ");
		length=sc.nextDouble();
		System.out.println("Enter the breath");
		breath=sc.nextDouble();
		area=length*breath;
		System.out.println("Area:"+area);
		sc.close();
	}

}