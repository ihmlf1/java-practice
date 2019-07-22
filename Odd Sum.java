package packagehellojava;
import java.util.Scanner;
public class hellojava {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int ca=sc.nextInt();
		for(short i=0;i<ca;i++) {
			long total=0;
			int min=sc.nextInt(),max=sc.nextInt();
			if(min%2==0) {
				min++;
			}
			if(max%2==0) {
				max--;
			}
			while(min<=max) {
				total+=min;
				min+=2;
			}
			System.out.printf("Case %d: %d\n", i+1,total);
		}
	}
}