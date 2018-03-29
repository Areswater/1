package leetcode;
/**最长回文串
 * 
 * @author wangzhi
 *Given a string s, find the longest palindromic subsequence's length in s. You may assume that the maximum length of s is 1000.

Example 1:
Input:

"bbbab"
Output:
4
One possible longest palindromic subsequence is "bbbb".
Example 2:
Input:

"cbbd"
Output:
2
One possible longest palindromic subsequence is "bb".
 */
public class leetcode516 {
	public static int solution(String s){
		
	
	int len = s.length();
    int p[][]=new int[len][len];
    int max = 1;
    for (int i=len-1;i>=0;i--){
        p[i][i]=1;
        for (int j=i+1;j<len;j++){
            if(s.charAt(i)==s.charAt(j)){
                p[i][j]=p[i+1][j-1]+2;
            }else{
                p[i][j]=Math.max(p[i+1][j],p[i][j-1]);
            }
        }
    }
    return p[0][len-1];
	}
	public static int test(String s){
    	int length=s.length();
    	int a[][]=new int[length][length];
    	int max=1;
    	for (int j=length-1;j>=0;j--){
    		a[j][j]=1;
    		for(int i=j+1;i<length;i++){
    			if(s.charAt(i)==s.charAt(j)){
    				a[j][i]=a[j+1][i-1]+2;
    			}else{
    				a[j][i]=Math.max(a[j+1][i], a[j][i-1]);
    			}
    		}
    	}
    	
    	return a[0][length-1];
    }
	public static void main(String args[]){
		String s="bbbab";
		System.out.println(test(s));
	}
}
