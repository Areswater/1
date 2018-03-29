package leetcode;

import java.util.Arrays;

public class nextGreaterElement3 {
	public static int solution(int n) {
        //如果是1位整数，直接返回-1，同时加上了10和11
        if(n <= 11){
            return -1;
        }
        //转化为char数组，方便处理数字
        char[] nums = (n+"").toCharArray();
        int i = nums.length - 2;
        //从后往前找到第一个升序的位数
        for (; i >= 0; i--) {
            if (nums[i] < nums[i+1]) {
                break;
            }
        }
        //如果没有即不存在，返回-1
        if(i < 0){
            return -1;
        }
        int j = nums.length -1;
        //从后往前查找第一个比i大的数字，这样找出来的是所有大于i数字中的最小值
        for (; j > i; j--) {
            if(nums[i] < nums[j]){
                break;
            }
        }
        //交换i，j位置的数字
        char tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
        //i之后的数字排序，让结果最小
        Arrays.sort(nums, i+1, nums.length);
        //有可能交换后越界，使用long类型判断一下
        long ans = Long.parseLong(new String(nums));
        return (ans>Integer.MAX_VALUE)?-1:((int)ans);
    }
	public static void main(String args[]){
    	System.out.println(solution(122222234));
    }
}
