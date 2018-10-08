/*
 * 
 * 
 给定一个整数数组  nums 和一个正整数 k，找出是否有可能把这个数组分成 k 个非空子集，其总和都相等。

示例 1：

输入： nums = [4, 3, 2, 3, 5, 2, 1], k = 4
输出： True
说明： 有可能将其分成 4 个子集（5），（1,4），（2,3），（2,3）等于总和。
 

注意:

1 <= k <= len(nums) <= 16
0 < nums[i] < 10000
 * 
 * 
 * 
 */



public class canPartitionKSubsets {
	public static boolean canPartitionKSubsets(int[] nums, int k) {
        int len = nums.length;
        int sum = 0;
        for(int i=0;i<len;i++){
            sum += nums[i];
        }
        
        if(sum%k!=0) return false;
        
        int avg = sum/k;
        
        boolean[] visited = new boolean[len];
        return recursion(nums,visited,avg,k,avg,0);
    }
    
    private static boolean recursion(int[] nums,boolean[] visited,int avg,int count,int temp,int index){
        if(count == 0) return true;
        if(temp == 0){ return recursion(nums,visited,avg,count-1,avg,0);}
        else if(temp > 0){
            for(int i=index;i<nums.length;i++){
                if(nums[i] > avg) return false;
                if(visited[i]) continue;
                visited[i] = true;
                if(temp-nums[i] >= 0 && recursion(nums,visited,avg,count,temp-nums[i],index+1)){
                    return true;
                }
                visited[i] = false;
            }
        }
        
        return false;
    }
    
    public static void main(String[] args) {
    	int[] nums = {4,15,1,1,1,1,3,11,1,10};
    	int k = 3;
    	System.out.println(canPartitionKSubsets(nums,k));
    }
}
