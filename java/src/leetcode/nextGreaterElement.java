package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class nextGreaterElement {
	public int[] solution(int[] nums1, int[] nums2) {
        int re[]=new int[nums1.length];
        for (int i=0;i<nums1.length;i++){
            int k=0;
            for (k=0;k<nums2.length;k++){
                if (nums1[i]==nums2[k]){
                    break;
                }
            }
            for(;k<nums2.length;k++){
               if (nums1[i]<nums2[k]){
                    re[i]=nums2[k];
                   break;
                }
            }
            if (k==nums2.length){
                re[i]=-1;
            }
        }
        return re;
    }
	 public int[] solution2(int[] nums1, int[] nums2) {
	        Map<Integer, Integer> map = new HashMap<>(); // map from x to next greater element of x  
	       Stack<Integer> stack = new Stack<>();  
	       //遍历自身，寻找自身中 右方元素比当前元素大的
	       for (int num : nums2) {  
	           while (!stack.isEmpty() && stack.peek() < num)  
	               map.put(stack.pop(), num);  
	           stack.push(num);  
	       }     
	       for (int i = 0; i < nums1.length; i++)  
	           nums1[i] = map.getOrDefault(nums1[i], -1);  
	       return nums1; 
	    }
	
}
