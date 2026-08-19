class Solution {
    public int evalRPN(String[] tokens) {
        Stack <Integer> stack = new Stack<>();
        for(String ch:tokens){
            if(ch.equals("+")){
                stack.push(stack.pop()+stack.pop());
            }
            else if(ch.equals("-")){
                int second = stack.pop();
                int first = stack.pop();
                stack.push(first-second);
            }
            else if(ch.equals("*")){
                stack.push(stack.pop()*stack.pop());
            }
            else if(ch.equals("/")){
                int second = stack.pop();
                int first = stack.pop();
                stack.push(first/second);
            }
            else{
                stack.push(Integer.parseInt(ch));
            }
        }
        return stack.pop();
    }
}