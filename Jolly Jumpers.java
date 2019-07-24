package myproject;
import java.util.Scanner;
public class myjava {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(in.hasNext()) {
			int many=in.nextInt();
			int[] all=new int[many];
			boolean check=true;
			boolean[] match=new boolean[many-1];
			for(int i=0;i<many;i++) {
				all[i]=in.nextInt();
			}
			for(int i=0;i<many-1;i++) {
				if(Math.abs(all[i]-all[i+1])<1||Math.abs(all[i]-all[i+1])>=many) {	
					check=false;
					break;
				}
				else {
					if(match[Math.abs(all[i]-all[i+1])-1]) {
						check=false;
						break;
					}
					else {
						match[Math.abs(all[i]-all[i+1])-1]=true;
					}
				}
			}
			if(check) {
				System.out.println("Jolly");
			}
			else {
				System.out.println("Not jolly");
			}
		}
		in.close();
	}
}
