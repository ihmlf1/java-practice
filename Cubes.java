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
			boolean check=false;
			for(int i=2;i*i*i-(i-1)*(i-1)*(i-1)<=n&&!check;i++) {
				for(int j=1;i*i*i-j*j*j>=n;j++) {
					if(i*i*i-j*j*j==n) {
					check=true;
					System.out.printf("%d %d\n",i,j);
				}
			}
			}
			if(!check) {
				System.out.printf("No solution\n");
			}
		}
	}
}
