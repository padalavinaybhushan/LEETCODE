class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<int[]>[] graph = new LinkedList[n + 1];
        int[] minTime = new int[n+1];
        boolean[] visited = new boolean[n + 1];
		
        for(int i = 0; i <= n; i++)
        {
            graph[i] = new LinkedList(); 
            minTime[i] = Integer.MAX_VALUE;
        }
        
        for(int[] edge: times)
        {
            int src = edge[0], dest = edge[1];
            int time = edge[2];
            graph[src].add(new int[]{dest, time});
        } 
        
        minTime[k] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a, b) -> a[1] - b[1]);
        pq.offer(new int[]{k, 0});
        
        while(!pq.isEmpty())
        {
            int[] current = pq.poll();
            int vertex = current[0], distance = current[1];
            
            if(visited[vertex]) continue;
            visited[vertex] = true;
            
            for(int[] neighbour: graph[vertex])
            {
                int nextNode = neighbour[0], delay = neighbour[1]; 
				
                if(delay + distance < minTime[nextNode])
                {
                    minTime[nextNode] = delay + distance;
                    pq.offer(new int[]{nextNode, minTime[nextNode]});
                }
            }
        }
        
        int min = -1;
        for(int i = 1; i <= n; i++)
        {
            if(!visited[i]) return -1;
            if(minTime[i] < Integer.MAX_VALUE)
                min = Math.max(min, minTime[i]);
        }
        
        return min;
    }
}