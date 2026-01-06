//this example code for using constructor
package constructor;

public class Pen {
	String colour;
	int cost;
	 
	Pen (String c,int rs){
		colour=c;
		cost=rs;
	}
	public static void main(String[] args) {
		
		Pen pen1=new Pen("red",10);
		System.out.println("pen1 details:"+ "\n" +pen1.colour + "-" +pen1.cost);
		
		Pen pen2=new Pen("blue",15);
		System.out.println("pen2 details:"+ "\n" +pen2.colour + "-" +pen2.cost);
		
		Pen pen3=new Pen("black",20);
		System.out.println("pen3 details:"+ "\n" +pen3.colour + "-" +pen3.cost);
	}
}

