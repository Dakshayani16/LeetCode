class Solution {
    public boolean isValid(String r) {
       
        Stack<Character> s=new Stack<>();
        for(int i=0;i<r.length();i++){
              char current = r.charAt(i);
            if(r.charAt(i)=='(' || r.charAt(i)=='{' ||r.charAt(i)=='['){
                s.push(r.charAt(i));
            } else if (current == ')' || current == '}' || current == ']') {
                // If stack is empty or top of stack doesn't match the closing bracket
                if (s.isEmpty() || 
                   (current == ')' && s.peek() != '(') || 
                   (current == '}' && s.peek() != '{') || 
                   (current == ']' && s.peek() != '[')) {
                    return false;
                }
                // If it matches, pop the stack
                s.pop();
            }
            
        }

        System.out.println(""+s.size());
    //   if(s.size()==0){
    //         return true;
    //     }
    return s.isEmpty();
    }
}