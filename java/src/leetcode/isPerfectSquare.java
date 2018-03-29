package leetcode;
/*
 * 给定一个正整数 num，编写一个函数，如果 num 是一个完全平方数，则返回 True，否则返回 False。

注意：不要使用任何内置的库函数，如  sqrt。

示例 1：

输入： 16

输出： True
示例 2：

输入： 14

输出： False
 */
/*通过列举所有的完全平方数，1，4，9，16，25，36，49，64，81，100…等等，发现完全平方数的差都为奇数，
 * 即1，3，5，7，9，11，13，15…等等~所以可以判断完全平方数应该是N个奇数的和。
 * 
 */
public class isPerfectSquare {
	public boolean solution(int num) {
        for(int i = 1; num > 0; i += 2){
           num -= i;
       }
       return num == 0;
   }
}
