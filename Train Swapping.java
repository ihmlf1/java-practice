package myproject;
import java.util.Scanner;
public class myjava {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n>0) {
			int arraynumber=in.nextInt(),total=0;
			int[] array=new int[arraynumber];
			for(int i=0;i<arraynumber;i++) {
				array[i]=in.nextInt();
			}
			for(int i=0;i<arraynumber-1;i++) {
				for(int j=0;j<arraynumber-i-1;j++) {
					if(array[j]>array[j+1]) {
						int temp=array[j];
						array[j]=array[j+1];
						array[j+1]=temp;
						total++;
					}
				}
			}
			System.out.printf("Optimal train swapping takes %d swaps.\n", total);
			n--;
		}
		in.close();
	}
}
