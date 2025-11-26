class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        boolean equal;
        for(int i: asteroids){
            if(i<0){
                equal=false;
                while(!st.isEmpty() && st.peek()>=0){
                    int j=st.pop();
                    if(-i==j){
                        equal=true;
                        break;
                    }
                    if(-i>j)continue;
                    else {
                        i=j;
                        break;
                    }
                }
                if(!equal)st.push(i);
            }
            else st.push(i); 
        }
        int[] ans=new int[st.size()];
        for(int i=ans.length-1;i>=0;i--){
            ans[i]=st.pop();
        }
        return ans;
    }
}
