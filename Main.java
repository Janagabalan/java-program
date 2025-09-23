import java.util.*;
public class Main{
    public static void main(String[] args)
	{
		try(Scanner sc=new Scanner(System.in))
        {
		float bs,hra,da,gs;
		System.out.println("Enter the salary:");
		bs=sc.nextFloat();
		hra=bs*0.4f;
		da=bs*0.2f;
		gs=hra+da+bs;
		System.out.println("Gross Salary: "+gs);
        sc.close();
        }
		}
    }
    