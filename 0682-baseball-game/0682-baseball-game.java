class Solution {
    public int calPoints(String[] operations) {
        Stack <Integer> stack = new Stack<>();
        for(String s : operations){
            if(s.equals("+")){
                int a= stack.pop();
                int b= stack.pop();
                stack.push(b);
                stack.push(a);
                stack.push(a+b);
            }
            else if(s.equals("C")){
                stack.pop();
            }
            else if(s.equals("D")){
                int a=stack.pop();
                stack.push(a);
                stack.push(2*a);
            }
            else{
                stack.push(Integer.parseInt(s));
            }
        }
        int sum = 0;
        for(int stk : stack){
            sum+=stk;
        }
        return sum;
    }
}