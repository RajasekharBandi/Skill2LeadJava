import java.util.*;
/*
 * A positive integer D is a factor of a positive integer N if there exists an integer M such that N = D * M.

For example, 6 is a factor of 24, because M = 4 satisfies the above condition (24 = 6 * 4).

Write a function:

class Solution { public int solution(int N); }

that, given a positive integer N, returns the number of its factors.

For example, given N = 24, the function should return 8, because 24 has 8 factors, namely 1, 2, 3, 4, 6, 8, 12, 24. There are no other factors of 24.

Assume that:

N is an integer within the range [1..2,147,483,647].
Complexity:

expected worst-case time complexity is O(sqrt(N));
expected worst-case space complexity is O(1).
 */
public class CountFactors {

	 public int solution(int N){
	        int i=1;
	        int res=0;
	        while (i*i<N){
	            if(N%i==0){
	                res +=2;
	            }
	            i+=1;
	        }
	        if(i*i==N){
	            res++;
	        }
	        return res;
	    }
	 public int solution2(int N) {
	        int count = 0;
	        double sqrt = Math.sqrt(N);
	        int i = 1;
	        
	        while (i < sqrt) {
	            if (N % i == 0) {
	                count += 2;
	            }
	            i++;
	        }
	        
	        return (sqrt == (int)sqrt) ? (count + 1) : count;
	    }
	 public int solution5(int N) {//CodilityJavaSolutions
	        // write your code in Java SE 8
	        int result = 0;
	        for(int i = 1; i * i <= N; i++) {
	            if(N % i == 0) result += 2;
	        }

	        int sqrtN = (int)Math.sqrt(N);
	        if( sqrtN * sqrtN == N) result--;

	        return result;
	    }
}
