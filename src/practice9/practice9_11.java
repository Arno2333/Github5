package practice9;
import java.util.Scanner;

public class practice9_11 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("ÇëÊäÈëa¡¢b¡¢c¡¢d¡¢e¡¢f£º");
		double a=input.nextDouble();
		double b=input.nextDouble();
		double c=input.nextDouble();
		double d=input.nextDouble();
		double e=input.nextDouble();
		double f=input.nextDouble();
		
		LinearEquation object=new LinearEquation(a,b,c,d,e,f);
		
		if(object.isSolvable()) 
			System.out.println("X:"+object.getX()+" y:"+object.getY());
		else
			System.out.println("The equation has no solution.");
	
	}
}

class LinearEquation {
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;
	
	LinearEquation(double a, double b, double c, double d, double e, double f) {
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
		this.e=e;
		this.f=f;
	}
	public double getA() {
		return a;	
	}
	public double getB() {
		return b;	
	}	
	public double getC() {
		return c;
	}	
	public double getD() {
		return d;	
	}	
	public double getE() {
		return e;	
	}
	public double getF() {
		return f;
	
	}
	public boolean isSolvable() {
		if((this.a*this.d-this.b*this.c) != 0)
			return true;
		else
			return false;
	}
	public double getX() {
		double x=(this.e*this.d-this.b*this.f)/(this.a*this.d-this.b*this.c);
		return x;
	}
	public double getY() {
		double y=(this.a*this.f-this.e*this.c)/(this.a*this.d-this.b*this.c);
		return y;
}
}