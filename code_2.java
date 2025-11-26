class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st=new Stack<>();
        Map<Integer, Integer> map=new HashMap<>();
        for(int i=nums2.length-1;i>=0;i--){
            int num=nums2[i];
            map.put(num, -1);
            while(!st.isEmpty()){
                if(num<st.peek()){
                    map.put(num, st.peek());
                    break;
                }
                else st.pop();
            }
            st.push(num);
        }
        int[] ans=new int[nums1.length];
        
        for(int i=0;i<nums1.length;i++){
            ans[i]=map.get(nums1[i]);
        }
        return ans;
    }
}
