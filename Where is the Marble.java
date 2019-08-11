package myproject;
import java.util.Scanner;
public class myjava {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt(),ca=1,question=in.nextInt();
		while(n!=0&&question!=0) {
			System.out.printf("CASE# %d:\n", ca);
			int[] num=new int[n];
			for(int i=0;i<n;i++) {
				num[i]=in.nextInt();
				for(int j=i;j>0;j--) {
					if(num[j]<num[j-1]) {
						int temp=num[j-1];
						num[j-1]=num[j];
						num[j]=temp;
					}
				}
			}
			for(int i=0;i<question;i++) {
				int m=in.nextInt();
				boolean check=false;
				for(int j=0;j<n;j++) {
					if(m==num[j]) {
						check=true;
						System.out.printf("%d found at %d\n", m,j+1);
						break;
					}
				}
				if(!check) {
					System.out.printf("%d not found\n", m);
				}
			}
			ca++;
			n=in.nextInt();
			question=in.nextInt();
		}
		in.close();
	}
}
