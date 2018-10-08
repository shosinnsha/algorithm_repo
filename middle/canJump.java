/*
 * 
 * 
 ���ⲻ���� �����ϲ�Ĵ𰸡��������ύ������ʱ890ms�������󲿷�ͨ������������10ms���� -��-~~
 * 
 * 
 * 
 * 
����һ���Ǹ��������飬�����λ������ĵ�һ��λ�á�

�����е�ÿ��Ԫ�ش������ڸ�λ�ÿ�����Ծ����󳤶ȡ�

�ж����Ƿ��ܹ��������һ��λ�á�

ʾ�� 1:

����: [2,3,1,1,4]
���: true
����: ��λ�� 0 �� 1 �� 1 ��, Ȼ���� 3 ���������һ��λ�á�
ʾ�� 2:

����: [3,2,1,0,4]
���: false
����: �������������ܻᵽ������Ϊ 3 ��λ�á�����λ�õ������Ծ������ 0 �� ��������Զ�����ܵ������һ��λ�á� 
 * 
 * 
 */



/*
 *
 6ms��
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
