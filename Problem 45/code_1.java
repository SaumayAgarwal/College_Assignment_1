class Solution {
    public int findContentChildren(int[] g, int[] s) {
        if(g.length==0||s.length==0)return 0;
        int countG=0, countS=0;
        Arrays.sort(g);
        Arrays.sort(s);
        int ans=0;
        while(countG<g.length && countS<s.length){
            if(g[countG]<=s[countS]){
                ans++;
                countG++;
                countS++;
            }
            else countS++;
        }
        return ans;
    }
}
