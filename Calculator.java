package myPackage;
import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("1.Add  2.Sub  3.Mul  4.modulo");
		int cal=sc.nextInt();
		
		switch(cal){
		case 1:System.out.println(a+b);
		break;
		case 2:System.out.println(a-b);
		break;
		case 3:System.out.println(a*b);
		break;
		case 4:System.out.println(a%b);
		break;
		default:
			System.out.println("Invalid operator!!");
		
			
		}
		

	}

}
