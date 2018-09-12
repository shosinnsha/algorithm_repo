/*
2018-9-12

实现函数 ToLowerCase()，该函数接收一个字符串参数 str，并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。

示例 1：

输入: "Hello"
输出: "hello"
示例 2：

输入: "here"
输出: "here"
示例 3：

输入: "LOVELY"
输出: "lovely"

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
