package packagehellojava;
import java.util.Scanner;
public class hellojava {
	public static void main(String[] args){
		Scanner a=new Scanner(System.in);
		int min=a.nextInt(),max=a.nextInt();
		while(true) {
			if(min==0&&max==0)
				break;
			int total=0;
			for(;min<=max;min++) {
				if(java.lang.Math.sqrt((double)min)==(int)java.lang.Math.sqrt((double)min)) {
				total++;
				}
			}
			System.out.printf("%d\n",total);
			min=a.nextInt();
			max=a.nextInt();
		}
	}
}