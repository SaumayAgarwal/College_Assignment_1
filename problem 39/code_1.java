class Solution {
    public int countPrimes(int n) {
        int[] count=new int[n];
        count[0]=count[1]=0;
        Arrays.fill(count, 1);
        for(int i=2;i*i<n;i++){
            if(count[i]==1){
            for(int j=i*i;j<n;j=j+i){
                count[j]=0;
            }
            }
        }
        int ans=0;
        for(int i=2;i<n;i++){
            if(count[i]==1)ans++;
        }
        return ans;
    }
}
