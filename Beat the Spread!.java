package myproject;
import java.util.Scanner;
public class myjava {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		while(a>0) {
			long sum=in.nextLong(),difference=in.nextLong();
			if(sum-difference<0||(sum+difference)%2!=0||(sum-difference)%2!=0) {
				System.out.println("impossible");
			}
			else {
				System.out.printf("%d %d\n",(sum+difference)/2,(sum-difference)/2);
			}
			a--;
		}
		in.close();
	}
}
