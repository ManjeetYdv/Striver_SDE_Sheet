class Solution {
    

    public String getPermutation(int n, int k) {
        
       
        List<Integer> list = new ArrayList<>();

        int fac=1;
        for(int i=1; i<n ;i++){
            list.add(i);
            fac*=i;
        }
        list.add(n);

        String result ="";
        k= k-1;

        while(true){

            result+= list.get(k/fac);
            list.remove(k/fac);

            if(list.size()==0){
                break;
            }
            k = k%fac;
            fac =fac/list.size();

        }

        return result;

        
    }
    
}
//                  FUCKING TLE!!

 //    int factorial(int n){
//
//         int res =1;

//         for(int i=2 ;i<=n ;i++){
//             res*=i;
//         }
//         return res;
//     }
    
//      String swap(String str, int i, int j)
//         {
//             StringBuilder sb = new StringBuilder(str);
//             sb.setCharAt(i, str.charAt(j));
//             sb.setCharAt(j, str.charAt(i));
//             return sb.toString();
//          }
    
//     String nextP(String s) {

//         int idx = -1;
//         for (int i = s.length() - 1; i >= 1; i--) {
//             if (s.charAt(i - 1) < s.charAt(i)) {
//                 idx = i;
//                 break;
//             }
//         }
//             if (idx == -1) {
//                 StringBuilder st = new StringBuilder(s);
//                 st.reverse();
//                 s = st.toString();
//                 return s;
//             }

//             int prev = idx;

//             for (int j = idx; j < s.length(); j++) {

//                 if (s.charAt(j) > s.charAt(idx - 1) && s.charAt(j) <= s.charAt(prev)) {
//                     prev = j;
//                 }
//             }
//             s= swap(s , idx-1 ,prev);

//             String subS = s.substring(idx);
//             StringBuilder ss = new StringBuilder(subS);
//              ss.reverse();


//           s =  s.replaceAll(subS, ss.toString());

//             return s;


//         }

//     public String getPermutation(int n, int k) {
        
//         if(n==1) return "1";
        
//         int num=1;
//         for(int i=2 ;i<=n ;i++){
//             num= num*10 + i;
//         }
//         if(n==2 && k==2) return "21";
        
//         String str=  String.valueOf(num);
//         int fac = factorial(n);
//         if(k%fac==1)  return str;
      
//         int permutes;
        
//          if(k%fac==0){
//             permutes= fac-1;
//         }else{
//             permutes = k%fac-1;
//         }

//         for(int i=1; i<=permutes ;i++){
//             str = nextP(str);
//         }

//         return str;
        
//     }

    
    
    
