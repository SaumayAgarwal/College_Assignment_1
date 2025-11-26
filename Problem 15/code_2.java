class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map=new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
        int[] stack=new int[s.length()];
        int top=-1;
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                top++;
                stack[top]=map.get(s.charAt(i));
            }
            else if(top==-1)return false;
            else{
                if(stack[top]!=s.charAt(i))return false;
                else top--;
            }
        }
        return top==-1;
    }
}
