package kmp;

public class nexttest {
	public int[] next(String s){
		int len = s.length();
		int a[]=new int[len];
		a[0]=a[1]=1;
		int j=0;
		for (int i=1;i<=len;i++){
			while(j>0&&s.charAt(i)!=s.charAt(j)) j=a[j];
			if (s.charAt(i)==s.charAt(j)) j++;
			a[i]=j;
		}
		return a;
	}
	
}
