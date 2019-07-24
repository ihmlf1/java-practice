package myproject;
import java.util.Scanner;
public class myjava {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(in.hasNext()) {
			long myarmy=in.nextLong(),opponent=in.nextLong();
			System.out.printf("%d\n",Math.abs(opponent-myarmy));
		}
		in.close();
	}
}
