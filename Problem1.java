import java.io.*;
import java.util.*;

public class Problem1{

public static void main(String args[]){

	// running sumtotal
	int total = 0;

	for(int i=0; i<100; i++){
		if(i % 3 == 0){
			total += i;
		}
		if(i % 5 == 0){
			total += i;
		}
	}
	// 2633
	System.out.println(total);
	}
}