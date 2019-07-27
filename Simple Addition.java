package myproject;
import java.util.Scanner;
public class myjava {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(in.hasNext()) {
			long a=in.nextInt(),b=in.nextInt(),total=0;
			if(a<0&&b<0) {
				break;
			}
			for(long i=a;i<=b;i++) {
				total+=fun(i);
			}
			System.out.println(total);
		}
		in.close();
	}
	public static int fun(long in) {
		int total=0;
		while(true) {
			if(in%10>0||in==0) {
			total+=in%10;
			break;
			}
			else {
				in/=10;
				continue;
			}
		}
		return total;
	}
}
