/*
 * 
 * 
 * 
 * 
 * 
 * 
 �ڶ�ά����grid�У�grid[i][j]����λ��ĳ���Ľ�����ĸ߶ȡ� ���Ǳ����������κ���������ͬ��������������ܲ�ͬ���Ľ�����ĸ߶ȡ� �߶� 0 Ҳ����Ϊ�ǽ����

��󣬴�������������ĸ����򣨼��������ײ��������Ҳࣩ�ۿ��ġ�����ߡ�������ԭʼ������������ͬ�� ���е�������Ǵ�Զ���ۿ�ʱ�������н������γɵľ��ε��ⲿ������ �뿴��������ӡ�

������߶ȿ������ӵ�����ܺ��Ƕ��٣�

���ӣ�
���룺 grid = [[3,0,8,4],[2,4,5,7],[9,2,6,3],[0,3,1,0]]
����� 35
���ͣ� 
The grid is:
[ [3, 0, 8, 4], 
  [2, 4, 5, 7],
  [9, 2, 6, 3],
  [0, 3, 1, 0] ]

��������ֱ���򣨼��������ײ�����������ߡ��ǣ�[9, 4, 8, 7]
��ˮƽˮƽ���򣨼���࣬�Ҳࣩ��������ߡ��ǣ�[8, 7, 9, 3]

�ڲ�Ӱ������ߵ�����¶Խ�����������ߺ����������£�

gridNew = [ [8, 4, 8, 7],
            [7, 4, 7, 7],
            [9, 4, 8, 7],
            [3, 3, 3, 3] ]
˵��:

1 < grid.length = grid[0].length <= 50��
 grid[i][j] �ĸ߶ȷ�Χ�ǣ� [0, 100]��
һ��������ռ��һ��grid[i][j]������֮�������� 1 x 1 x grid[i][j] �ĳ����塣 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

//package middle;

public class maxIncreaseKeepingSkyline {
	public static int maxIncreaseKeepingSkyline(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] row = new int[m];
        int[] col = new int[n];
        int sum = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(row[i] <= grid[i][j]){row[i] = grid[i][j];}
            }
        }
        for(int j=0;j<n;j++){
            for(int i=0;i<m;i++){
                if(col[j] <= grid[i][j]){col[j] = grid[i][j];}
            }
        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                sum += Math.min(row[i],col[j]) - grid[i][j];
            }
        }
        
        return sum;
    }
	
	public static void main(String[] agrs) {
		int[][] grid = {{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}};
		System.out.println(maxIncreaseKeepingSkyline(grid));
	}
}
