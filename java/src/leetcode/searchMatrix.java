package leetcode;
/*
 * 编写一个高效的算法来搜索 m x n 矩阵中的一个目标值。该矩阵具有以下特性：

每行中的整数从左到右排序。
每行的第一个整数大于前一行的最后一个整数。
例如，

以下矩阵：

[
  [1,   3,  5,  7],
  [10, 11, 16, 20],
  [23, 30, 34, 50]
]
给定 目标值= 3，返回 true。
 */
public class searchMatrix {
	public boolean solution(int[][] matrix, int target) {
        //行数与列数
        int row=0;
        //判断数组是否为空
        if(matrix==null||matrix.length==0||(matrix.length==1&&matrix[0].length==0)){
             return false;
        }
        int col=matrix[0].length-1;
        System.out.println(row);
        System.out.println(col);
        //任何一条件不满足均中止循环
        while (row<matrix.length&&col>=0){
            if(target>matrix[row][col]){
                row++;
            }else if(target<matrix[row][col]){
                col--;
            }else{
                return true;
            }
        }
         return false;
        
    }
	
}
