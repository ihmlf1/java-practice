package myproject;
import java.util.Scanner;
public class myjava {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(true) {
			int num=in.nextInt();
			if(num==0) {
				break;
			}
			System.out.printf("f91(%d) = %d\n",num,f91(num));
		}
		in.close();
	}
	public static int f91(int in){
		if(in>100) {
			return in-10;
		}
		else {
			return f91(f91(in+11));
		}
	}
}
