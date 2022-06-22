class Solution {
    
    static String pushorpop(Character c){

        if(c=='(' || c=='{' || c=='['){
            return "push";
        }
        else{
            return "pop";
        }
    }

    static Character opposite(Character c){
        if(c==')'){
            return '(';
        }
        else if(c =='}'){
            return '{';
        }
        else if(c ==']'){
            return '[';
        }
        return null;
    }
    
    
    public boolean isValid(String s) {
        
         Stack<Character> stack = new Stack<>();

        for(int i=0 ;i<s.length() ;i++){

            if(pushorpop(s.charAt(i))=="push"){
                stack.push(s.charAt(i));
            }
            else if(pushorpop(s.charAt(i))=="pop"){


                    if(stack.isEmpty()) {
                        return false;
                    }
                    else if(stack.peek()==opposite(s.charAt(i))){

                        stack.pop();
                    }
                    else{
                        return false;
                    }
            }
        }


        if(!stack.isEmpty()){
            return false;
        }
       return true;
        
    }
}
