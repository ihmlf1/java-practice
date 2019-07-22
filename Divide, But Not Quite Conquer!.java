package packagehellojava;
import java.util.Scanner;
public class hellojava {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int in,bein,temp;
		while(sc.hasNextInt()) {
			in=sc.nextInt();
			temp=in;
			bein=sc.nextInt();
			boolean check=true;
			while(in>1) {
				if(in%bein==0) {
					in/=bein;
				}
				else {
					check=false;
					break;
				}
			}
			if(check) {
				while(temp!=1) {
				System.out.printf("%d ",temp);
				temp/=bein;
				}
				System.out.printf("1\n");
			}
			else {
				System.out.print("Boring!\n");
			}
		}
	}
}