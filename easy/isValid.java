/*
 * 
 *
 *
 *
 *
给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。

有效字符串需满足：

左括号必须用相同类型的右括号闭合。
左括号必须以正确的顺序闭合。
注意空字符串可被认为是有效字符串。

示例 1:

输入: "()"
输出: true
示例 2:

输入: "()[]{}"
输出: true
示例 3:

输入: "(]"
输出: false
示例 4:

输入: "([)]"
输出: false
示例 5:

输入: "{[]}"
输出: true
 *
 *
 *
 *
 *
 */

package easy;

public class isValid {
	 public boolean isValid(String s) {
        Stack<Character> temp = new Stack<Character>();
        for(int i=s.length()-1;i>=0;i--){
            char now = s.charAt(i);
            if(now == '}' || now == ')' || now == ']'){temp.push(now);}
            else{
                if(temp.empty()){return false;}
                else
                {switch(now){
                    case '{':
                        if('}' != temp.pop()){return false;};
                        break;
                    case '(':
                        if(')' != temp.pop()){return false;};
                        break;
                    case '[':
                        if(']' != temp.pop()){return false;};
                        break;
                    case ' ':
                        break;
                }}
            }
        }
        if(temp.empty()){return true;}
        else{return false;}
    }
}
