class Solution {
    public int maxArea(int[] height) {
        int maxWater=0;
        int i=0,j=height.length-1;
        while(i<j){
            int h = Math.min(height[i],height[j]);
            maxWater=Math.max(maxWater, (j-i)*h);
            while(i < j && height[i] <= h) {
                i++;
            }
            while(i < j && height[j] <= h) {
                j--;
            }
        }
        return maxWater;
    }
}
