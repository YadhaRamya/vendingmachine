import java.util.Scanner;
public class Drivercls {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner s;
		s= new Scanner(System.in);
		System.out.println("***GOOD EVENING***");
		System.out.println("SELECT 1 FOR CHOCOLATES");
		System.out.println("SELECT 2 FOR BEVERGES");
		System.out.println("SELECT 3 FOR SNACKS");
		i=s.nextInt();
		switch(i) {
		case 1:
			System.out.println("CHOCOLATES");
			Supcls1 s1;
			s1=new Supcls1();
			s1.chocolates();
			break;
		case 2:
			System.out.println("BEVERGES");
			Subcls s2;
			s2=new Subcls();
			s2.Beverges();
			break;
		case 3:
			System.out.println("SNACKS");
			Derivedcls s3;
			s3=new Derivedcls();
			s3.Snacks();
			
		}
	}

}
