package myproject;
import java.util.Scanner;
public class myjava {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt(),ca=1;
		while(n!=0) {
			int[][] num=new int [n][n];
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					num[i][j]=in.nextInt();
				}
			}
			System.out.printf("Case %d:", ca);
			for(int i=0;i<(n+1)/2;i++) {
				int total=0;
				for(int j=i;j<n-i;j++) {
					for(int k=i;k<n-i;k++) {
						if(j==i||j==n-i-1||k==i||k==n-i-1) {
							total+=num[j][k];	
						}
					}
				}
				System.out.printf(" %d", total);
			}
			System.out.println("");
			ca++;
			n=in.nextInt();
		}
		in.close();
	}
}
