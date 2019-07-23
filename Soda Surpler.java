package myproject;
import java.util.Scanner;
public class myjava {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int time=in.nextInt();
		while(time>0) {
			int start=in.nextInt(),getsoda=in.nextInt(),change=in.nextInt();
			int total=0,soda=start+getsoda;
			while(soda>=change) {
				getsoda=soda/change;
				total+=getsoda;
				soda%=change;
				soda+=getsoda;
			}
			System.out.printf("%d\n",total);
			time--;
		}
		in.close();
	}
}
