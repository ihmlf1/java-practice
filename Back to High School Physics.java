package myproject;
import java.util.Scanner;
public class myjava {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(in.hasNext()) {
			int start=in.nextInt(),time=in.nextInt();
			System.out.println(start*2*time);
		}
		in.close();
	}
}
