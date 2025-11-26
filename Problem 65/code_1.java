class Solution {
    int[][] t = new int[21][21]; rue

    public boolean check(String s, String p, int i, int j) {
        if (j == p.length()) return i == s.length();
        if (t[i][j] != -1) return t[i][j] == 1;

        boolean ans = false;

        boolean currMatch = (i < s.length() && 
                            (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.'));

 
        if (j + 1 < p.length() && p.charAt(j + 1) == '*') {
            ans = check(s, p, i, j + 2);
                  || (currMatch && check(s, p, i + 1, j)); 
        } else {
            ans = currMatch && check(s, p, i + 1, j + 1);
        }

        t[i][j] = ans ? 1 : 0;
        return ans;
    }

    public boolean isMatch(String s, String p) {
        for (int[] row : t) Arrays.fill(row, -1);
        return check(s, p, 0, 0);
    }
}
