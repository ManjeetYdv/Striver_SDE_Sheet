package com.company;

import java.util.ArrayList;
import java.util.List;

public class allPalindromes {

    static void ExpandFromCenter(String str , int i , int j,  List<String> res){

        while(i>=0 &&  j<str.length()){

            if(str.charAt(i)== str.charAt(j)){
                res.add(str.substring(i , j+1));
                i--;
                j++;
            }
            else{
                break;
            }
        }

    }
    static List<String>  allP(String str){              //Use set for non repeating palindromes
       
        List<String> res = new ArrayList<>();
        for(int i=0 ;i<str.length() ;i++){
            ExpandFromCenter(str , i , i , res);
            ExpandFromCenter(str , i , i+1 , res);
        }
        return res;
    }
    public static void main(String[] args) {

        String str = "abba";

        List<String> res = allP(str);

        System.out.println("All palindromes: ");
        for(String s : res){
            System.out.println(s);
        }


    }
}
