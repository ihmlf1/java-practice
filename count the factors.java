package myproject;
import java.util.Scanner;
public class myjava {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(in.hasNext()) {
			int n=in.nextInt();
			if(n==0) {
				in.close();
				break;
			}
			int total=0,origin=n;
			for(int i=2;i<=n;i++) {
				if(prime(i)&&n%i==0) {
					total++;
					while(n%i==0) {
						n/=i;
					}
				}
			}
			System.out.printf("%d : %d\n",origin,total );
		}
	}
	static boolean prime(int in) {
		for(int i=2;i<=Math.sqrt(in);i++) {
			if(in%i==0) {
				return false;
			}
		}
		return true;
	}
}
