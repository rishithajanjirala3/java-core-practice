package myPackage;
import java.util.*;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
	}

}
