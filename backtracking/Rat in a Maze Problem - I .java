class Solution {
    
  public static void solve(int i, int j, int a[][], int n, ArrayList < String > ans, String move) {
    if (i == n - 1 && j == n - 1) {
      ans.add(move);
      return;
    }


     a[i][j] = 0;    //marked 0 so that the cell cant be repeated
     //downward
    if (i + 1 < n && a[i + 1][j] == 1) { 
        solve(i + 1, j, a, n, ans, move + 'D');
      }

    // left
    if (j - 1 >= 0 && a[i][j - 1] == 1) {
        solve(i, j - 1, a, n, ans, move + 'L');
     }

    // right 
    if (j + 1 < n && a[i][j + 1] == 1) {
       solve(i, j + 1, a, n, ans, move + 'R');
     }

    // upward
    if (i - 1 >= 0  && a[i - 1][j] == 1) {
      solve(i - 1, j, a, n, ans, move + 'U');
     }
    
     a[i][j] = 1;       //all 4 direction searched  ,  so backtracked and marked it 1 to be visited by others
  }
  
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        
        
        ArrayList<String> res = new ArrayList<>();
          
       if(m[0][0]==0 || m[n-1][n-1]==0) return res;
       
        solve(0, 0, m, n,res, "");
        return res;
    }
}
