import java.util.Stack;

class ValidParenthesis {
    public static void main(String[] args) {
        System.out.println(_validParenthesis("([{<>}]"));
    }
    static boolean _validParenthesis(String str){
        if(str == null){
            throw new IllegalArgumentException("Parameter is null");
        }
        if(str == "")
            return false;
        Stack<Character> stack = new Stack<>();
        for(char ch : str.toCharArray()){
            if(_checkLeftParenthesis(ch)){
                stack.push(ch);
            }
            if (_checkRightParenthesis(ch)){
                if(stack.isEmpty())
                    return false;
                stack.pop();
            }
            
        }
        if(stack.isEmpty())
            return true;
        return false;
    }
    private static boolean _checkLeftParenthesis(char ch){
        return ch == '[' || ch == '{' || ch == '(' || ch == '<';
    }
    private static boolean _checkRightParenthesis(char ch){
        return ch == ']' || ch == '}' || ch == ')' || ch == '>';
    }
}