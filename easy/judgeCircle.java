/* 
 * 
 * 
 * 
 * 
 * 
 �ڶ�άƽ���ϣ���һ�������˴�ԭ�� (0, 0) ��ʼ�����������ƶ�˳���ж����������������ƶ����Ƿ��� (0, 0) ��������

�ƶ�˳�����ַ�����ʾ���ַ� move[i] ��ʾ��� i ���ƶ��������˵���Ч������ R���ң���L���󣩣�U���ϣ��� D���£��������������������ж����󷵻�ԭ�㣬�򷵻� true�����򣬷��� false��

ע�⣺�����ˡ��泯���ķ����޹ؽ�Ҫ�� ��R�� ��ʼ��ʹ�����������ƶ�һ�Σ���L�� ��ʼ�������ƶ��ȡ����⣬����ÿ���ƶ������˵��ƶ�������ͬ��

 

ʾ�� 1:

����: "UD"
���: true
���ͣ������������ƶ�һ�Σ�Ȼ�������ƶ�һ�Ρ����ж�����������ͬ�ķ��ȣ���������ջص�����ʼ��ԭ�㡣��ˣ����Ƿ��� true��
ʾ�� 2:

����: "LL"
���: false
���ͣ������������ƶ����Ρ�������λ��ԭ�����࣬��ԭ�������� ���ƶ��� �ľ��롣���Ƿ��� false����Ϊ�����ƶ�����ʱû�з���ԭ�㡣 
 * 
 * 
 * 
 * 
 * 
 * 
 */


public class judgeCircle {
	public static boolean judgeCircle(String moves) {
        int row = 0;
        int col = 0;
        for(int i=0;i<moves.length();i++){
            switch(moves.charAt(i)){
                case 'U':
                    col += 1;
                    break;
                case 'D':
                    col -= 1;
                    break;
                case 'L':
                    row -= 1;
                    break;
                case 'R':
                    row += 1;
                    break;
                
            }
        }

        if(row == 0 && col == 0){return true;}
        else{return false;}
    }
	
	public static void main(String[] args) {
		boolean s =judgeCircle("UD");
		System.out.println(s);
	}
}
