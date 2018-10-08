/*
 * 
 * 
 * 
 * 
 * 
�������ְ������������ַ��� I�� V�� X�� L��C��D �� M��

�ַ�          ��ֵ
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
���磬 �������� 2 д�� II ����Ϊ�������е� 1��12 д�� XII ����Ϊ X + II �� 27 д��  XXVII, ��Ϊ XX + V + II ��

ͨ������£�����������С�������ڴ�����ֵ��ұߡ���Ҳ�������������� 4 ��д�� IIII������ IV������ 1 ������ 5 ����ߣ�����ʾ�������ڴ��� 5 ��С�� 1 �õ�����ֵ 4 ��ͬ���أ����� 9 ��ʾΪ IX���������Ĺ���ֻ�������������������

I ���Է��� V (5) �� X (10) ����ߣ�����ʾ 4 �� 9��
X ���Է��� L (50) �� C (100) ����ߣ�����ʾ 40 �� 90�� 
C ���Է��� D (500) �� M (1000) ����ߣ�����ʾ 400 �� 900��
����һ������������תΪ�������֡�����ȷ���� 1 �� 3999 �ķ�Χ�ڡ�

ʾ�� 1:

����: 3
���: "III"
ʾ�� 2:

����: 4
���: "IV"
ʾ�� 3:

����: 9
���: "IX"
ʾ�� 4:

����: 58
���: "LVIII"
����: C = 100, L = 50, XXX = 30, III = 3.
ʾ�� 5:

����: 1994
���: "MCMXCIV"
����: M = 1000, CM = 900, XC = 90, IV = 4. 
 * 
 * 
 * 
 * 
 */

//package middle;

public class intToRoman {
	public String intToRoman(int num) {
        int index = 0, n = 0;
        String temp ="";
        while(num >0){
            index++; 
            n = num % 10;
            temp = separated_change(n,index) + temp;
            num /= 10;
        }
        return temp;
    }
    
    private String separated_change(int n,int index){
        String a1="",a2="",a3="",sum="";
        switch(index){
            case 1:
                a1 = "I";
                a2 = "V";
                a3 = "X";
                break;
            case 2:
                a1 = "X";
                a2 = "L";
                a3 = "C";
                break;
            case 3:
                a1 = "C";
                a2 = "D";
                a3 = "M";
                break;
            case 4:
                a1 = "M";
                a2 = "";
                a3 = "";
        }
        switch(n){
            case 0:
                break;
            case 1:
                sum = a1;
                break;
            case 2:
                sum = a1+a1;
                break;
            case 3:
                sum = a1+a1+a1;
                break;
            case 4:
                sum = a1 + a2;
                break;
            case 5:
                sum = a2;
                break;
            case 6:
                sum = a2 + a1;
                break;
            case 7:
                sum = a2 + a1 +a1;
                break;
            case 8:
                sum = a2 + a1 +a1 +a1;
                break;
            case 9:
                sum = a1 + a3;
                break;
        }
        return sum;
        
    }
}
