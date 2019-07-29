package myproject;
import java.util.Scanner;
public class myjava {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(in.hasNext()) {
			int cin=in.nextInt(),change=in.nextInt(),total=cin;
			while(cin>=change) {
				total+=cin/change;
				cin=cin/change+cin%change;
			}
			System.out.println(total);
		}
		in.close();
	}
}
