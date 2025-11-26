class Solution {
    public boolean dfs(List<Integer>[] adj, int src, int dest, boolean[] vis){
        if(src==dest)return true;
        vis[src]=true;
        for(int i:adj[src]){
            if(!vis[i]){
                if(dfs(adj, i, dest, vis))return true;
            }
        }
        return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source == destination || edges.length == 0){
            return true;
        }
        List<Integer>[] adj=new ArrayList[n];
        
        for(int i=0;i<n;i++){
            adj[i]=new ArrayList<>();
        }

        for(int[] edge:edges){
            adj[edge[0]].add(edge[1]);
            adj[edge[1]].add(edge[0]);
        }

        return dfs(adj, source, destination, new boolean[n]);
    }
}
