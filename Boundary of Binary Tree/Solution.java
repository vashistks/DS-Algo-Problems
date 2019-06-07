

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> boundaryOfBinaryTree(TreeNode root) {
    
        List<Integer> result = new ArrayList<Integer>();
            
        if(root==null){
            return result;
        }
        
        if(!isLeaf(root)){
            result.add(root.val);
        }
        TreeNode t = root.left;
        
        while(t!=null){
            if(!isLeaf(t)){
                result.add(t.val);
            } 
            
            if(t.left!=null){
                t = t.left;
            } else {
                t = t.right;
            }

        }
        
        Stack<Integer> stack = new Stack<Integer>();
        addLeaves(result,root);
        t = root.right;
        while(t!=null){
            if(!isLeaf(t)){
                stack.push(t.val);
            }
            
            if(t.right!=null){
                t = t.right;
            } else {
                t = t.left;
            }
        }
        
        while(!stack.empty()){
            result.add(stack.pop());
        }
        
        return result;
    }
    
    public boolean isLeaf(TreeNode root){
        return root.left==null && root.right==null;
    }
    
    public void addLeaves(List<Integer> result,TreeNode root){
        if(isLeaf(root)){
            result.add(root.val);
        } else {
            if(root.left!=null){
                addLeaves(result,root.left);
            }
            
            if(root.right!=null){
                addLeaves(result,root.right);
            }
        }
        
        
    }
}