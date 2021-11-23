import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class gameRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4 ;
        int m = 6;
        int[] liste = new int [n];
        int[] arr = new int [n];
        Set<Integer> hasar = new HashSet<Integer>();
        for (int j=hasar.size() ; j<n ;j++) {
			//liste[j]= hasard(m);
			hasar.add(hasard(m));
		}
        while (hasar.size()<4) {
        	hasar.add(hasard(m));
        }
      //Creating an empty integer array
        Integer[] list = new Integer[hasar.size()];
        //Converting Set object to integer array
        int j = 0;
        for (Integer i: hasar) {
           list[j++] = i;
        }
        System.out.print(hasar);
        System.out.println("");
        List<String> win = new ArrayList<String>();
        win.add("#");
        win.add("#");
        win.add("#");
        win.add("#");
        
       
    	   for (int b=0 ; b<10;b++) {
           	
           	System.out.println("Entre  4 CHIFRE différent entre 1 et 6 :");
           	Scanner input =new Scanner(System.in);
       		for (int i=0; i <4 ; i++) {
       			arr[i] = input.nextInt(); 
       		}
       		List<String> solution = new ArrayList<String>(); 
       		for (int x=0 ;x<list.length ; x++) {
       			for(int y=0 ; y<list.length; y++) {
       				
       				if( list[x] == arr[y] && x==y) {
       					solution.add("#");
       					
       					//System.out.print("#");
       				}else if (list[x] == arr[y] && x!=y) {
       					solution.add("O");
       					//System.out.print("O");
       				}
       			}
       		}    		
       		Collections.sort( solution); 
       		System.out.print(solution);
       		if(solution.equals(win)) {
					
		    	   System.out.println("you are the winner");
		    	   break;
		       }
       		System.out.println("");
                if(b == 9) {
       			System.out.println("you lost sorry !!!!");
       		}
           }
       
        
	}
	static int hasard(int max) {
        return (1 + (int)(Math.random() * max));
        }
}
