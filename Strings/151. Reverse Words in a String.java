class Solution {
    public String reverseWords(String str) {
        

           str.trim();
           Stack<String> stack = new Stack<>();
        
        for(int i=0 ;i<str.length();i++){
            String temp="";

            while( i< str.length() && str.charAt(i)!=' '){
                temp+=str.charAt(i);
                i++;

            }
           if(temp.equals("")) continue;
            stack.push(temp);
        }

        String result = stack.peek();
        stack.pop();
        while(!stack.isEmpty()){
           result+=" "+stack.peek();
            stack.pop();
        }
        
        return result;
    }
}
