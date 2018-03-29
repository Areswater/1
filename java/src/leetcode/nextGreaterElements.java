package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class nextGreaterElements {
	
	public static int[] solution(int[] nums) {
        //用栈
        int length=nums.length;
        int re[]=new int[length];
        for (int n=0;n<length;n++){
            re[n]=-1;
        }
        Stack<Integer> stack = new Stack<>();
        for (int i=0;i<length;i++){
            while(!stack.isEmpty()&&nums[stack.peek()]<nums[i]){
                re[stack.pop()]=nums[i];
            }
            stack.push(i);
            }
        for (int i=0;i<length;i++){
            while(!stack.isEmpty()&&nums[stack.peek()]<nums[i]){
                re[stack.pop()]=nums[i];
            }
            }
        return re;
            
    }
	    public static int[] solution2(int[] nums) {
	    	int n = nums.length;
	        int re[]=new int[n];
	        int j=0;
	        for (int i=0;i<n;i++){
	            for (j=i+1;j<n;j++){
	            if(nums[i]<nums[j]){
	                re[i]=nums[j];
	                break;
	                }
	            }
	            if (j<n&&re[i]==nums[j]){
	                continue;
	            }
	            for (j=0;j<i;j++){
	            if(nums[i]<nums[j]){
	                re[i]=nums[j];
	                break;
	                }
	            
	            }
	            if (j<n&&re[i]==nums[j]&&i!=j){
	                continue;
	            }else{
                re[i]=-1;
            }
	        }
	        
	        return re;
	    }
	    public static void main(String args[]){
	    	int nums[] = {0};
	    	System.out.println(solution(nums));
	    }
}
