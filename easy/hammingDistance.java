/*
��������֮��ĺ�������ָ�������������ֶ�Ӧ������λ��ͬ��λ�õ���Ŀ��

������������ x �� y����������֮��ĺ������롣

ע�⣺
0 �� x, y < 231.

ʾ��:

����: x = 1, y = 4

���: 2

����:
1   (0 0 0 1)
4   (0 1 0 0)
       ��   ��

����ļ�ͷָ���˶�Ӧ������λ��ͬ��λ�á�

*/
public class hammingDistance {
	public int hammingDistance(int x, int y) {
        int temp = x^y;
        int sum = 0;
        while(temp != 0){
            if(temp%2 != 0) {sum++;}
            temp /= 2;
        }
        
        return sum;
    }
}
