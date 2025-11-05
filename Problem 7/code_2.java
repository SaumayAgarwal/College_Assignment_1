class Solution {
    static void print(int i, int n){
        if(i>n)return;
        System.out.print(i + " ");
        print(i+1, n);
    }
    static void printTillN(int N) {
        // code here
        print(1, N);
    }
}
