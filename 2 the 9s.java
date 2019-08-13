package myproject;
import java.util.Scanner;
public class myjava {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String a=in.next();
		while(a.length()!=1||a.charAt(a.length()-1)!='0') {
			int total=0,end=0;
			boolean nine=false;
			for(int i=0;i<a.length();i++) {
				total+=a.charAt(i)-'0';
			}
			if(total==9) {
				nine=true;
			}
			while(total%9==0) {
				int temp=0;
				while(total>0) {
					temp+=total%10;
					total/=10;
				}
				total=temp;
				if(total==9) {
					break;
				}
				end++;
			}
			if(end==0) {
				if(!nine) {
					System.out.println(a+" is not a multiple of 9.");
				}
				else {
					System.out.printf("%s is a multiple of 9 and has 9-degree %d.\n",a,end+1);
				}
			}
			else {
				System.out.printf("%s is a multiple of 9 and has 9-degree %d.\n",a,end+2);
			}
			a=in.next();
		}
		in.close();
	}
}
