package myproject;
import java.util.Scanner;
public class myjava {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(in.hasNext()) {
			long team=in.nextLong(),member=in.nextLong(),total=0;
			while(total<member) {
				total+=team;
				team++;
			}
			System.out.println(team-1);
		}
		in.close();
	}
}
