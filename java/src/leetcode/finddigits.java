package leetcode;
//
public class finddigits {
	public static int find(int n){
		//确定位数
		long base=1,digit=9;
		while (n-base*digit>0)
		{
			n-=base*digit;
			base++;
			digit*=10;
		}
		//确定是哪个数 根据n/base确定是从10^n开始的第几个数 余数确定是第几位
		//余数为0时则表示多算了一位 
		long index=n%base;
		long k=n/base;
		int num=1;
		for (int i=1;i<base;i++)
		{
			num*=10;
		}
		if(index==0){
			num+=k-1;
		}else{
			num+=k;
		}
		System.out.println(num);
		//根据位数循环取出需要的数
		for(int i=0;i<base-index;i++)
		{
			num/=10;
		}
		return num%10;
	}
	public static void main(String args[]){
		int result = find(1000000000);
		System.out.println(result);
		int re[]=new int[5];
		
		
		
	}
}
