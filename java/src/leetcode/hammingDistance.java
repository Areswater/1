package leetcode;
/*
 * 	两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。

	给出两个整数 x 和 y，计算它们之间的汉明距离。

	注意：
	0 ≤ x, y < 231.
 	*/
public class hammingDistance {
	 public int solution(int x, int y) {
	        // 按位^后 求1个个数
	        int k = x^y;
	        System.out.println(k);
	        int count=0;
	        while (k>0){
	            if(k%2==1){
	                count++;
	            }
	            k/=2;
	        }
	        return count;
	    }
}
