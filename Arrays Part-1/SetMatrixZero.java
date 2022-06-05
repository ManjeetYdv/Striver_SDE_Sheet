package com.company;


public class setMatrixZero {

    public static void SetZero(int [][] matrix){

        int rows= matrix.length;
        int cols = matrix[0].length;

        for(int i=0 ;i<rows ; i++){
            for(int j=0 ;j<cols ;j++){
                if(matrix[i][j]==0){

                    int idx= i-1;                  //Setting row zero
                    while(idx>=0){
                        matrix[idx][j]=-1;
                        idx--;
                    }
                    idx =i+1;
                    while(idx<rows){
                        matrix[idx][j]=-1;
                        idx++;
                    }

                    idx = j-1;               //Setting col zero
                    while(idx>=0){
                        matrix[i][idx]=-1;
                        idx--;
                    }
                    idx =j+1;
                    while(idx<cols){
                        matrix[i][idx]=-1;
                        idx++;
                    }
                }
            }
        }

        for(int i=0 ;i<rows ;i++){
            for(int j=0 ;j<cols;j++){

                if(matrix[i][j]==-1){
                    matrix[i][j]=0;
                }
            }
        }

    }

    public static void main(String[] args) {

        int[][] arr= {{0 , 1 ,2 } , {4 ,0 , 5} , {6 ,7 ,8 } ,{7 ,8 ,9}};

        for(int i=0 ;i<arr.length ;i++){
            for(int j=0 ;j<arr[0].length ;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("After method");
        
        SetZero(arr);
        for(int i=0 ;i<arr.length ;i++){
            for(int j=0 ;j<arr[0].length ;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

}
