class Solution {
  
    public String countAndSay(int n) {
      
         if(n==1) return "1";

        String a ="1 ";
        String b="";


        for(int i=2; i<=n ;i++){
            int k=0;

            for(int j=0 ; j<a.length()-1 ;j++){

                if(a.charAt(j)==a.charAt(j+1)) k++;

                else{
                    k++;
                    b+= String.valueOf(k)  +a.charAt(j);
                    k=0;
                }
            }
            a=b+" ";
            b="";


        }

       return a.substring(0, a.length() - 1);  

    }
}
