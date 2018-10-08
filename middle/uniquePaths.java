/*
 * 
 * 
 * 
 * 
 * 
 һ��������λ��һ�� m x n ��������Ͻ� ����ʼ������ͼ�б��Ϊ��Start�� ����

������ÿ��ֻ�����»��������ƶ�һ������������ͼ�ﵽ��������½ǣ�����ͼ�б��Ϊ��Finish������

���ܹ��ж�������ͬ��·����

 
 ˵����m �� n ��ֵ�������� 100��

ʾ�� 1:

����: m = 3, n = 2
���: 3
����:
�����Ͻǿ�ʼ���ܹ��� 3 ��·�����Ե������½ǡ�
1. ���� -> ���� -> ����
2. ���� -> ���� -> ����
3. ���� -> ���� -> ����
ʾ�� 2:

����: m = 7, n = 3
���: 28
 * 
 * 
 * 
 * 
 * 
 * 
 */
//package middle;

public class uniquePaths {
	public int uniquePaths(int m, int n) {
        int[][] solution = new int[m][n];
        solution[0][0] = 0;
        for(int i=0;i<m;i++) solution[i][0] = 1;
        for(int i=0;i<n;i++) solution[0][i] = 1;
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                solution[i][j] = solution[i-1][j] + solution[i][j-1];
            }
        }
        return solution[m-1][n-1];
    }
}
