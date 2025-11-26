class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        Queue<Integer> q=new LinkedList<>();
        ArrayList<Integer> list=new ArrayList<>();
        boolean[] visited=new boolean[adj.size()];
        q.offer(0);
        while(!q.isEmpty()){
            int curr=q.poll();
            if(visited[curr]==false){
                list.add(curr);
                visited[curr]=true;
                for(int i=0;i<adj.get(curr).size();i++){
                    q.offer(adj.get(curr).get(i));
                }
            }
        }
        return list;
    }
}
