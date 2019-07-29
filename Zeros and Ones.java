package myproject;
import java.util.Scanner;
public class myjava {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int Case=1;
		while(in.hasNext()) {
			String a=in.next();
			System.out.println("Case "+Case+":");
			Case++;
			int b=in.nextInt();
			for(;b>0;b--) {
				int min=in.nextInt(),max=in.nextInt();
				if(min>max) {
					int temp=max;
					max=min;
					min=temp;
				}
				boolean check=true;
				for(int i=min,j=min+1;check&&j<=max;j++) {
					if(a.charAt(i)!=a.charAt(j)) {
						check=false;
						break;
					}
				}
				if(check) {
					System.out.println("Yes");
				}
				else {
					System.out.println("No");
				}
			}
		}
		in.close();
	}
}
