package myproject;
import java.util.Scanner;
import java.util.*;
public class myjava {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(in.hasNext()) {
			Map<Character, Integer> map = new HashMap<Character, Integer>();
			String n=in.next();
			for(int i=0;i<n.length();i++) {
				if(!map.containsKey(n.charAt(i))) {
					map.put(n.charAt(i), 1);
				}
				else {
					Integer temp = (Integer)map.get(n.charAt(i));
					temp++;
					
					map.replace(n.charAt(i), map.get(n.charAt(i)), temp);
				}
			}
			for(char key:map.keySet()) {
				System.out.println((int)key+" "+map.get(key));
			}
		}
		in.close();
	}
}
