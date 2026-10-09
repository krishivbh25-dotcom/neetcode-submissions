class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> c = new Stack<>();
        for(int i = 0; i < tokens.length; i++){
            if(tokens[i].equals("*")){
                int n = c.pop();
                int m = c.pop();
                c.push(n*m);
            }
            else if(tokens[i].equals("+")){
              int n = c.pop();
                int m = c.pop();
                c.push(n+m);
            }else if(tokens[i].equals("-")){
                int n = c.pop();
                int m = c.pop();
                c.push(m -n);
            }else if(tokens[i].equals("/")){
             int n = c.pop();
                int m = c.pop();
                c.push(m/n);
            }else{         
            c.push(Integer.parseInt(tokens[i]));
            }
        }
        return c.pop();
    }
}
