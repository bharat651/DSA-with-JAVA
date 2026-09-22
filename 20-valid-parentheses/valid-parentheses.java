class Solution {
    ArrayList<Character> stack = new ArrayList<>();
    public boolean isValid(String s) {
        // char[] c = s.toCharArray();
        
        for(char c : s.toCharArray()){
            if(isOpeningBracket(c)){
                stack.add(c);
            }
            else{
                if(stack.size() == 0){
                    return false;
                }
                else if(isCloseMatchBracket(stack.get(stack.size()-1),c)){
                    stack.remove(stack.size()-1);
                }
                else{
                    return false;
                }
                
            }

        }
        if(stack.size()==0){
            return true;
        }
        else{
            return false;
        }
        
    }
    public boolean isOpeningBracket(char c){
        switch(c){
            case '{':
            case '[':
            case '(':
            return true;
            default:
            return false;
        }

    }
    public boolean isCloseMatchBracket(char c,char d){
        System.out.println(c);
        System.out.println(d);
        if (c == '(' && d == ')') {
            return true;
        } else if (c == '[' && d == ']') {
            return true;
        } else if (c == '{' && d == '}') {
            return true;
        } else {
            return false;
        }
    }
}