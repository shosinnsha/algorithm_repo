/*
 * 
 * 
 * 
 给定一个由 0 和 1 组成的矩阵，找出每个元素到最近的 0 的距离。

两个相邻元素间的距离为 1 。

示例 1: 
输入:

0 0 0
0 1 0
0 0 0
输出:

0 0 0
0 1 0
0 0 0
示例 2: 
输入:

0 0 0
0 1 0
1 1 1
输出:

0 0 0
0 1 0
1 2 1
注意:

给定矩阵的元素个数不超过 10000。
给定矩阵中至少有一个元素是 0。
矩阵中的元素只在四个方向上相邻: 上、下、左、右。 
 * 
 * 
 *
 */



package ceshi;

public class updateMatrix {
	public int[][] updateMatrix(int[][] matrix) {
        int val = 1;
        int height = matrix.length;
        int width = matrix[0].length;
        int[][] res = new int[height+2][width+2];
        int num = height * width;
        
        for(int i=0;i<height+2;i++){
            for(int j=0;j<width+2;j++){
                res[i][j] = Integer.MAX_VALUE;
            }
        }
        
        //先定位所有为0的点
        for(int i=1;i<height+1;i++){
            for(int j=1;j<width+1;j++){
                if(matrix[i-1][j-1] == 0) res[i][j] = 0;
            }
        }
        
        int cal = 0;
        while(cal != num){
            cal = 0;
            for(int i=1;i<height+1;i++){
                for(int j=1;j<width+1;j++){
                    if(res[i][j] < val){cal++;continue;}
                    if(res[i+1][j] == val-1 || res[i-1][j] == val-1 || res[i][j+1] == val-1 || res[i][j-1] ==val-1) res[i][j] = val;
                }
            }
            val++;
        }
        
        int[][] res1 = new int[height][width];
        for(int i=1;i<height+1;i++){
            for(int j=1;j<width+1;j++){
                res1[i-1][j-1] = res[i][j];
            }
        }
        return res1;
    }
}
