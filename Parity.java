package myproject;
import java.util.Scanner;
public class myjava {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(true) {
			int numberin=in.nextInt();
			if(numberin==0) {
				in.close();
				break;
			}
			String out = "";
			int total=0;
			while(numberin>0) {
				out+=(char)(numberin%2);
				total+=numberin%2;
				numberin/=2;
			}
			total+=numberin;
			System.out.printf("The parity of ");
			for(int i=out.length()-1;i>=0;i--){
				System.out.print((int)out.charAt(i));
			}
			System.out.printf(" is %d (mod 2).\n",total);
		}
	}
}
