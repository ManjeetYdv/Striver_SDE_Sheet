package com.company;

import java.util.Vector;

public class PrintAllSubsequences {

    static Vector<String> vector;

    static void allSeq(String str,  int index  , String sub ){

        if(index==str.length()){
            vector.add(sub);
            return;
        }

        allSeq(str , index+1 , sub+str.charAt(index));
        allSeq(str , index+1 , sub);


    }


    public static void main(String[] args) {

        String s ="abc";
        vector = new Vector<>();
        allSeq(s , 0 ,"");

        for(String str : vector){
            System.out.print(str+" ");
        }


    }
}

