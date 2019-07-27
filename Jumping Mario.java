package myproject;
import java.util.Scanner;
public class myjava {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int many=in.nextInt(),k=1;
		while(many>0) {
			int wall=in.nextInt(),high=0,low=0;
			int[] tall=new int[wall];
			for(int j=0;j<wall;j++) {
				tall[j]=in.nextInt();
			}
			for(int i=0;i<tall.length-1;i++) {
				if(tall[i]>tall[i+1]) {
					low++;
				}
				else if(tall[i]<tall[i+1]) {
					high++;
				}
			}
			System.out.printf("Case %d: %d %d\n",k,high,low);
			many--;
			k++;
		}
		in.close();
	}
}
