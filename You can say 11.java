package myproject;
import java.util.Scanner;
public class myjava {

	public static void main(String[] args) {
		String i;
		Scanner a=new Scanner(System.in);
		while(true) {
			int odd=0,even=0;
			i=a.next();
			if(i.charAt(0)=='0') {
				a.close();
				break;
			}
			for(int j=0;j<i.length();j++) {
				if(j%2==0) {
					odd+=i.charAt(j)-'0';
				}
				else {
					even+=i.charAt(j)-'0';
				}
			}
			if((odd-even)%11==0) {
				System.out.printf("%s is a multiple of 11.\n",i);
			}
			else {
				System.out.printf("%s is not a multiple of 11.\n",i);
			}
		}
	}

}
