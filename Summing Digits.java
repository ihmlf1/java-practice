package myproject;
import java.util.Scanner;
public class myjava {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(in.hasNext()) {
			String n=in.next();
			if(n.charAt(0)=='0') {
				in.close();
				break;
			}
			while(n.length()>1) {
				int total=0;
				for(int i=0;i<n.length();i++) {
					total+=n.charAt(i)-'0';
				}
				n="";
				while(total>0) {
					n+=(char)total%10;
					total/=10;
				}
			}
			System.out.printf("%s\n",n);
		}
	}
}
