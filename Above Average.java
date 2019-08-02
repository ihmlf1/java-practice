package myproject;
import java.util.Scanner;
public class myjava {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n>0) {
			int a=in.nextInt();
			double up=0,total=0;
			int[] grade=new int[a];
			for(int i=0;i<a;i++) {
				int g=in.nextInt();
				grade[i]=g;
				total+=g;
			}
			total/=a;
			for(int j=0;j<a;j++) {
				if(total<grade[j]) {
					up++;
				}
			}
			System.out.printf("%.3f%%\n",up/a*100);
			n--;
		}
		in.close();
	}
}
