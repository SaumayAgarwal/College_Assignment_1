class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i=0;i<k;i++){
           while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i]){
                dq.pollLast();
            }
            dq.offer(i); 
        }
        int ans[]=new int[nums.length-k+1];
        ans[0]=nums[dq.peek()];
        for(int i=k;i<nums.length;i++){
            while(!dq.isEmpty() && i-dq.peek()>=k)dq.poll();
            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i]){
                dq.pollLast();
            }
            dq.offer(i);
            ans[i-k+1]=nums[dq.peek()];
        }
        return ans;
    }
}
