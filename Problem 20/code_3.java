class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        for(int i=0;i<piles.length;i++){
            if(max<piles[i])max=piles[i];
        }
        int start=1;
        while(start<max){
            int mid=start+(max-start)/2;
            int time=0;
            for(int n:piles){
                time += (n + mid - 1) / mid;
            }
            if(time<=h)max=mid;
            else start=mid+1;
        }
        return start;
    }
}
