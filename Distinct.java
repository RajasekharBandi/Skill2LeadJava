import java.util.*;
/*
 * Write a function

class Solution { public int solution(int[] A); }

that, given an array A consisting of N integers, returns the number of distinct values in array A.

Assume that:

N is an integer within the range [0..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
For example, given array A consisting of six elements such that:

 A[0] = 2    A[1] = 1    A[2] = 1
 A[3] = 2    A[4] = 3    A[5] = 1
the function should return 3, because there are 3 distinct values appearing in array A, namely 1, 2 and 3.

Complexity:

expected worst-case time complexity is O(N*log(N));
expected worst-case space complexity is O(N) (not counting the storage required for input arguments).
 */
public class Distinct {
	public int solution(int[] A){
        Set<Integer> set = new HashSet<>();
        for(int a:A){
            set.add(a);
        }

        return set.size();
    }
	
	public int solution2(int[] A) {
        int length = A.length;
        if (length <= 1) return length;
        
        Arrays.sort(A);
        
        int count = 1;
        int previous = A[0];
        for (int i = 1; i < length; i++) {
            if (previous != A[i]) {
                count++;
                previous = A[i];
            }
        }
        
        return count;
    }

}
