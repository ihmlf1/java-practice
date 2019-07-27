package myproject;
import java.util.Scanner;
import java.util.Arrays;
public class myjava {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		while(a>0) {
			int b=in.nextInt(),total=0;
			int all[]=new int[b];
			while(b>0) {
				all[b-1]=in.nextInt();
				b--;
			}
			Arrays.sort(all);
			for(int k=0;k<all.length;k++) {
				total+=Math.abs(all[k]-all[k/2]);
			}
			System.out.printf("%d\n",total);
			a--;
		}
		in.close();
	}
}
