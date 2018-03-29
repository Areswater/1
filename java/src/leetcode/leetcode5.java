package leetcode;
/**最长回文子串
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 长度最长为1000。

示例:

输入: "babad"

输出: "bab"

注意: "aba"也是有效答案
 

示例:

输入: "cbbd"

输出: "bb"
 * @author wangzhi
 *
 */
public class leetcode5 {
	    public static String longestPalindrome(String s) {
	            int len = s.length();
	            int start = 0;
	            int maxlength = 1;
	            boolean p[][] = new boolean[s.length()][s.length()];
	            // 子串长度为1和为2的初始化
	            for(int i = 0; i < len; i++){
	                p[i][i] = true;
	                if(i < len - 1 && s.charAt(i) == s.charAt(i + 1)){
	                    p[i][i + 1] = true;
	                    start = i;
	                    maxlength = 2;
	                }
	            }
	            // 使用上述结果可以dp出子串长度为3~len -1的子串
	            // 只需要向后检索下一个字符加入后是否为回文串
	            //若p[i][j]为回文串 则p[i+1][j-1]必为回文串
//	            for(int strlen = 3; strlen <=len; strlen ++){
//	                for(int i = 0; i <=len - strlen; i++){
//	                    int j = i + strlen - 1; // 子串结束的位置
//	                    if(p[i + 1][j - 1] && s.charAt(i) == s.charAt(j)){
//	                        p[i][j] = true;
//	                        maxlength = strlen;
//	                        start = i;
//	                    }
//	                }
//	            }
	            for (int strlen=3;strlen<=len;strlen++){
                    for(int i=0;i<=len-strlen;i++){
                        int j= i+strlen-1;
                        if (p[i+1][j-1] && s.charAt(i)==s.charAt(j)){
                            p[i][j]=true;
                            start=i;
                            maxlength=strlen;
                        }
                    }
                }
	            
	            if(maxlength > 0)
	                return s.substring(start, start + maxlength);
	            return null;
	        }
	    public static void main(String args[]){
	    	System.out.println(longestPalindrome("cccaba"));
	    	String s="aaaaa";
	    	System.out.println(s.charAt(s.length()));

	    }
}
