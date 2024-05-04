/*Given an array Arr of N positive integers.
 Your task is to find the elements whose value is 
 equal to that of its index value ( Consider 1-based indexing ). */
/*Input:
N = 5
Arr[] = {15, 2, 45, 12, 7}
Output: 2
Explanation: Only Arr[2] = 2 exists here. */
import java.util.ArrayList;

public class Value_equal_to_index_value {
      ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        ArrayList<Integer>list = new ArrayList<>();
        for(int i=0;i<n;i++)
            if(arr[i]==(i+1)) 
                 list.add(i+1);
                 
        return list;
    }
}

/* Learn about ArrayList and I got error at testcase no.269(remaining 1) exceed time because I am not using small bracket
 * if(arr[i]==i+1) in this line (i+1) small bracket mark
 * also learn without using curely bracket how to write program
  */
