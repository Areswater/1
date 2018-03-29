package kmp;

public class test {
	public static int[] getNext(String s){
		int len = s.length();
		int a[]=new int[len];
		a[0]=a[1]=1;
		int j=0;
		for (int i=1;i<len;i++){
			while(j>0&&s.charAt(i)!=s.charAt(j)) j=a[j];
			if (s.charAt(i)==s.charAt(j)) j++;
			a[i]=j;
		}
		return a;
	}
	public static void search(String original,String find,int next[]){
		int j=0;//j为find字符串的下标 i 为original字符串的下标
		int count=0;
		for (int i=0;i<original.length();i++){
			while (j>0&&original.charAt(i)!=find.charAt(j)) j=next[j];
			if (original.charAt(i)==find.charAt(j)) j++;
			if (j==find.length()){
				count++;
				System.out.println("已寻找出一处，起始位置为original.charAt("+(i-j+1)+")");
				System.out.println(original.substring(i-j+1, i+1));
				j=0;
			}
		}
	}
	public static void main(String args[]){
    	//System.out.println(getNext("ababacb"));
		String A="abababaababacbababacb";
    	String B="ababacb";
    	search(A,B,getNext(B));
    }
}
