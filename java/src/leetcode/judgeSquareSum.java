package leetcode;

public class judgeSquareSum {
	 public boolean solution(int c) {
	       int a=(int)java.lang.Math.sqrt(c) ;
	        for (int i=0;i<=a;i++){
	            int b=c-i*i;
	            int d =(int)java.lang.Math.sqrt(b);
	            if(d*d==b)
	                return true;
	        }
	        return false;
	    }
	 public boolean solution2(int c) {
		 int a=(int)java.lang.Math.sqrt(c) ;
	        int b=0;
	        while(b<=a){
	            if (b*b+a*a==c) {
	                return true;
	                }
	                else if (b*b+a*a>c) {
	                    a--;
	                    }
	                    else {
	                        b++;
	                     }
	            }
	        return false;
	    }
}
