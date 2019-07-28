package myproject;
import java.util.Scanner;
public class myjava {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int many=in.nextInt();
		while(many>0) {
			int n=in.nextInt(),m=in.nextInt(),total=0;
			while(n>=m) {
				total+=n/m;
				n=n/m+n%m;
			}
			if(n!=1) {
				System.out.println("cannot do this");
			}
			else {
				System.out.println(total);
			}
			many--;
		}
		in.close();
	}
}
