package myproject;
import java.util.Scanner;
public class myjava {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(in.hasNext()) {
			int a=in.nextInt(),re=0,temp=a;
			boolean p=prime(a),emirp;
			while(a!=0) {
				re*=10;
				re+=a%10;
				a/=10;
			}
			emirp=prime(re);
			if(!p) {
				System.out.println(temp+" is not prime.");
			}
			else if(!emirp||re==temp) {
				System.out.println(temp+" is prime.");
			}
			else {
				System.out.println(temp+" is emirp.");
			}
		}
		in.close();
	}
	static boolean prime(int in) {
		for(int i=2;i<=java.lang.Math.sqrt(in);i++) {
			if(in%i==0) {
				return false;
			}
		}
		return true;
	}
}
