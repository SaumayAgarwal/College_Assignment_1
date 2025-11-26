class Solution {
    public void changeColour(int[][] image, int sr, int sc, int newColor, int color, boolean[][] check){
        if(sr<0 || sc<0 || sr==image.length || sc==image[0].length || image[sr][sc]!=color || check[sr][sc]==true)return;
        List<Integer> temp=new ArrayList<>();
        image[sr][sc]=newColor;
        check[sr][sc]=true;
        changeColour(image, sr+1, sc, newColor, color, check);
        changeColour(image, sr-1, sc, newColor, color, check);
        changeColour(image, sr, sc+1, newColor, color, check);
        changeColour(image, sr, sc-1, newColor, color, check);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color)return image;
        boolean[][] check=new boolean[image.length][image[0].length];
        List<List<Integer>> list=new ArrayList<>();
        changeColour(image, sr, sc, color, image[sr][sc], check);
        return image;
    }
}
