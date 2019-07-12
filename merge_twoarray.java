import java.io.*;
import java.util.*;

class Merge_two_array {
	public static void main (String[] args) {
		
		int arr1[]={2,4,5,6,7,9,10,13};
		int arr2[]={2,3,4,5,6,7,8,9,11,15};
		 ArrayList<Integer> arrlist = new ArrayList<Integer>(arr1.length);
		 for(int ind:arr1)
		 {
		     arrlist.add(Integer.valueOf(ind));
		 }
		for(int ind=0;ind<arr2.length;ind++)
		{
		    if(arrlist.contains(arr2[ind]))
		    {
		        
		    }
		    else{
		         arrlist.add(arr2[ind]);
		    }
		}
		Collections.sort(arrlist);
		for(int ind=0;ind<arrlist.size();ind++)
		    System.out.print(arrlist.get(ind)+" ");
	}
}
