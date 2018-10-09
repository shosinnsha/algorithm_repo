/*
 *
 * 
 * 
 将 N 原先的左子树，连接为新节点 v 的左子树；将 N 原先的右子树，连接为新节点 v 的右子树。

如果 d 的值为 1，深度 d - 1 不存在，则创建一个新的根节点 v，原先的整棵树将作为 v 的左子树。

示例 1:

输入: 
二叉树如下所示:
       4
     /   \
    2     6
   / \   / 
  3   1 5   

v = 1

d = 2

输出: 
       4
      / \
     1   1
    /     \
   2       6
  / \     / 
 3   1   5   

示例 2:

输入: 
二叉树如下所示:
      4
     /   
    2    
   / \   
  3   1    

v = 1

d = 3

输出: 
      4
     /   
    2
   / \    
  1   1
 /     \  
3       1
注意:

输入的深度值 d 的范围是：[1，二叉树最大深度 + 1]。
输入的二叉树至少有一个节点。 
 * 
 * 
 * 
 * 
 * 
 */
public class addOneRow {
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		 }
	
	public TreeNode addOneRow(TreeNode root, int v, int d) {
        if(d == 1){
            TreeNode n = new TreeNode(v);
            n.left = root;
            return n;
        }
        
        DFS(root,v,d-1,1);
        return root;
    }
    
    private void DFS(TreeNode root,int v,int deep,int nowDeep){
        if(root == null) return;
        if(deep == nowDeep){
            TreeNode templi = root.left;
            TreeNode templo = root.right;
            root.left = new TreeNode(v);
            root.right = new TreeNode(v);
            root.left.left = templi;
            root.right.right = templo;
        }
        DFS(root.left,v,deep,nowDeep+1);
        DFS(root.right,v,deep,nowDeep+1);
    }
}
