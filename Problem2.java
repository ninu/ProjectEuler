import java.io.*;
import java.util.*;

public class Problem2{

	public static void main(String args[]){

		int total = 0;
	
		int prev = 1;
		int next = 2;
	
		while(next < 4000000){
			if(next % 2 == 0){
				total += next;
			}
			int tmp = 0;
			tmp = next;
			next += prev;
			prev = tmp;

		}
		// 4613732
		System.out.println(total);
	}
}