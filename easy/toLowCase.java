/*
2018-9-12

ʵ�ֺ��� ToLowerCase()���ú�������һ���ַ������� str���������ַ����еĴ�д��ĸת����Сд��ĸ��֮�󷵻��µ��ַ�����

ʾ�� 1��

����: "Hello"
���: "hello"
ʾ�� 2��

����: "here"
���: "here"
ʾ�� 3��

����: "LOVELY"
���: "lovely"

*/
class toLowCase {
    public String toLowCase(String str) {
        String temp = "";
        for(int i=0 ; i<str.length() ;i++){
            int val = (int)str.charAt(i);
            if(65 <= val && val <= 90){ 
                val += 32; 
            }
            temp += (char)val;
        }
        return temp;
    }
}
