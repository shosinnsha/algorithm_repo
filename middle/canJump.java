/*
 * 
 * 
 这题不会做 ，网上查的答案。。但是提交测试用时890ms。。。大部分通过的用例都是10ms以内 -。-~~
 * 
 * 
 * 
 * 
给定一个非负整数数组，你最初位于数组的第一个位置。

数组中的每个元素代表你在该位置可以跳跃的最大长度。

判断你是否能够到达最后一个位置。

示例 1:

输入: [2,3,1,1,4]
输出: true
解释: 从位置 0 到 1 跳 1 步, 然后跳 3 步到达最后一个位置。
示例 2:

输入: [3,2,1,0,4]
输出: false
解释: 无论怎样，你总会到达索引为 3 的位置。但该位置的最大跳跃长度是 0 ， 所以你永远不可能到达最后一个位置。 
 * 
 * 
 */



/*
 *
 6ms答案
 *
 class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        if(n == 0) return false;
        if(n == 1) return true;
        int s = 0;
        int e = n - 1;
        int res = 0;
        for(int i = 0;i < e;i++,res--){
            if(res < 0) break;
            if(nums[i] <= res){
                continue;
            }else{
                res = nums[i];
                if(i + res >= e) return true;
            }
        }
        return false;
    }
}
 *
 *
 *
 */


package middle;

public class canJump {
	public boolean canJump(int[] nums) {
        int N = nums.length;
        boolean[] flag = new boolean[N];
        flag[N-1] = true;
        for(int i=N-2;i>=0;i--){
            if(nums[i] >= N-1 - i){
                flag[i] = true;
                continue;
            }
            for(int j=i;j<N-1;j++){
                if(nums[i]>=j-i && flag[j]){
                    flag[i] = true;
                    continue;
                }
            }
        }
        return flag[0];
    }
}
