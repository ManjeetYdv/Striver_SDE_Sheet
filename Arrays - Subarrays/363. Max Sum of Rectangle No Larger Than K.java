Brute Force (gives TLE) - >
    
 public static int maxSumSubmatrix(int[][] matrix, int k) {
        int col = matrix[0].length;
        int max = Integer.MIN_VALUE;


        for(int i=0 ; i<matrix.length ;i++){
            for(int j=1 ; j<matrix[0].length ;j++){
                matrix[i][j] += matrix[i][j-1];
            }
        }

        for(int col1 =0 ; col1<col ;col1++){

            for(int col2 = col1 ; col2 < col ; col2++){

                List<Integer> list = new ArrayList<>();

                for(int i=0 ;i<matrix.length ;i++){

                    int currSum = matrix[i][col2] - (col1-1>=0 ? matrix[i][col1-1] : 0);

                    if(currSum<=k) max =  Integer.max(currSum , max);

                    for(int x =0 ;x<list.size() ;x++){
                        int temp = currSum;

                        for(int y=x ;y<list.size() ;y++){
                            temp+=list.get(y);
                        }

                        if(temp<=k) max = Integer.max(temp , max);


                    }
                    list.add(currSum);
                }
                list.clear();


            }
        }

        return max;
    }

  

//Optimzed using treeset and ceiling value
class Solution {
    public int maxSumSubmatrix(int[][] matrix, int k) {
        
        int col = matrix[0].length;
        int max = Integer.MIN_VALUE;


        for(int i=0 ; i<matrix.length ;i++){
            for(int j=1 ; j<matrix[0].length ;j++){
                matrix[i][j] += matrix[i][j-1];
            }
        }

        for(int col1 =0 ; col1<col ;col1++){

            for(int col2 = col1 ; col2 < col ; col2++){

                TreeSet<Integer> treeSet = new TreeSet<>();
                treeSet.add(0);
                int prefixSum=0;
                
                for(int i=0 ;i<matrix.length ;i++){

                    int currSum = matrix[i][col2] - (col1-1>=0 ? matrix[i][col1-1] : 0);
                    prefixSum+=currSum;

                    Integer target =  treeSet.ceiling(prefixSum-k);
                    if(target!=null){
                        max = Integer.max(max , prefixSum-target);        //Now the prefixSum - target <=k
                    }
                    treeSet.add(prefixSum);

                }
               


            }
        }

        return max;
        
    }
 
}

