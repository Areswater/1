package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode264 {
	public static  int nthUglyNumber(int n) {
        List<Integer> list =new ArrayList<>();
        list.add(1);
        int cur =2;
        int m1 = 0, m2 =0, m3=0;
        int min1,min2,min3;
        for (int i=1;i<n;i++){
            while (list.get(m1)*2<cur){
                m1++;
            }
            min1=list.get(m1)*2;
            while (list.get(m2)*3<cur){
                m2++;
            }
            min2=list.get(m2)*3;
            while (list.get(m3)*5<cur){
                m3++;
            }
            min3=list.get(m3)*5;
            int next = min1<min2?min1:min2;
            next = next<min3?next:min3;
            cur=next+1;
            list.add(next);
        }
        return list.get(n-1);
    }
	public static void main(String args[]){
		System.out.println(nthUglyNumber(10));
	}
}
