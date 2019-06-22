package c;

import java.util.HashSet;

//犯行
public class Brad48 {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		
		while(set.size()<6) {
			int rand = (int)(Math.random()*49+1);
			set.add(rand);
		}
		
		for(Integer i :set) {
			System.out.println(i);
		}

	}

}
