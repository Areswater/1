package leetcode;

public class leetcode214 {
	public static String solution(String s){
		if (s.length()<1){
            return s;
        }
        int i,len = s.length();
        int j=0,k=len-1;
        int flag=0;
        for (i=len;i>1;i--){
            char spre[] = s.substring(0,i).toCharArray();
            //判断出字符串中最长的回文串
            for (j=0,k=i-1;j<k;j++,k--){
                if (spre[j]!=spre[k]){
                   flag=1;
                   break;
                }else{
                	flag=0;
                }
            }
            if (flag==0){
            	 break;
            }
        }
        //将位置k以后的字符串倒序排布在s前
        char str[]=s.substring(i,len).toCharArray();
        
        reverse(str);
        return String.valueOf(str)+s;
	}
	public static void reverse(char s[]){
		for(int i=0,j=s.length;i<s.length/2;i++,j--){
			char b = s[j-1];
			s[j-1]=s[i];
			s[i]=b;
		}
	}
	public static String shortestPalindrome(String s) {
	       if (s.length()<1){
	            return s;
	        }
	        //根据kmp算法计算 求与倒序的最长回文子串
	        String re=reverse(s);
	        int[] next = next(s);
	        int mark =0;
	        int j=0;
	        for (int i=0;i<s.length();i++){
	            while (j>0&&re.charAt(i)!=s.charAt(j)){
	                j=next[j];
	            }
	            if (re.charAt(i)==s.charAt(j)){
	                j++;
	            }
	            if (i==s.length()-1){
	                mark=j;
	                break;
	            }
	        }
	        //根据mark的位置 拼接返回字符串
	        return re.substring(0,s.length()-mark)+s;
	        
		}
		public static  String reverse(String s){
			char str[]=s.toCharArray();
			for(int i=0,j=s.length();i<s.length()/2;i++,j--){
				char b = str[j-1];
				str[j-1]=str[i];
				str[i]=b;
			}
	        return String.valueOf(str);
		}
	    public static  int[] next(String s){
	        int next[]= new int[s.length()+1];
	        next[0]=next[1]=0;
	        int j=0;
	        for (int i=1;i<s.length();i++){
	            while (j>0&&s.charAt(i)!=s.charAt(j)) {
	            	j=next[j];
	            }
	            if (s.charAt(i)==s.charAt(j)){
	                j++;
	            }
	            next[i+1]=j;
	        }
	        return next;
		}
	
	public static void main(String args[]){
    	System.out.println(shortestPalindrome("aacecaaa"));
    }
}
