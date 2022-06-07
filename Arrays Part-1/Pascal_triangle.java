class Solution {
    
     public static List<Integer> pascal_IthRow(int n){
        List<Integer> row =  new LinkedList<Integer>();
        int res=1;
        row.add(res);
        n= n-1;
       
        for(int i=0 ;i<n ;i++){
            res *=(n-i);
            res/= (i+1);
            row.add(res);
        }

        return row;
}
    
    public List<List<Integer>> generate(int n) {
        
        
          List<List<Integer>> pascal =  new ArrayList<List<Integer>>();
        List<Integer> row = new LinkedList<Integer>();

        for(int i= 1 ;i<=n ;i++){
            row= pascal_IthRow(i);
            pascal.add(row);
        }
        return pascal;
    }
}
