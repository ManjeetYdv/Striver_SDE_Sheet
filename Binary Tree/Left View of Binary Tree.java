class Tree
{
    ArrayList<Integer> res;
    //Function to return list containing elements of left view of binary tree.
    
    void func(Node root , int level){
        
        if(root==null){
            return;
        }
        
        if(level==res.size()){
            res.add(root.data);
        }
        
        func(root.left , level+1);
        func(root.right , level+1);
        
    }
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      res = new ArrayList<>();
      func(root , 0);
      return res;
      
    }
}
