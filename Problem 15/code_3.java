class Solution {
    public int evaluatePostfix(String[] arr) {
        Stack<Integer> st = new Stack<>();

        for (String token : arr) {

            if (token.length() == 1 && "+-*/^".contains(token)) {
                int a = st.pop();
                int b = st.pop();

                switch (token) {
                    case "+":
                        st.push(b + a);
                        break;
                    case "-":
                        st.push(b - a);
                        break;
                    case "*":
                        st.push(b * a);
                        break;
                    case "/":
                        int res = b / a;
                        if ((b ^ a) < 0 && b % a != 0) {
                            res--; 
                        }
                        st.push(res);
                        break;
                    case "^":
                        st.push((int)Math.pow(b, a));
                        break;
                }
            } 
            else {

                st.push(Integer.parseInt(token));
            }
        }

        return st.pop();
    }
}
