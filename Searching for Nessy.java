package myproject;
import java.util.Scanner;
public class myjava {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n>0) {
			int a=in.nextInt(),b=in.nextInt();
			System.out.println((a/3)*(b/3));
			n--;
		}
		in.close();
	}
}
