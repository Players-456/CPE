class Solution {

    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        boolean[] visited = new boolean[n];
        int[] distance = new int[n];

        for (int i = 0; i < n; i++) {
            distance[i] = Integer.MAX_VALUE;
        }

        distance[0] = 0;
        int totalCost = 0;

        for (int count = 0; count < n; count++) {

            int u = -1;

            for (int i = 0; i < n; i++) {
                if (!visited[i] && (u == -1 || distance[i] < distance[u])) {
                    u = i;
                }
            }

            visited[u] = true;
            totalCost += distance[u];

            for (int v = 0; v < n; v++) {
                if (!visited[v]) {
                    int cost = Math.abs(points[u][0] - points[v][0])
                             + Math.abs(points[u][1] - points[v][1]);

                    if (cost < distance[v]) {
                        distance[v] = cost;
                    }
                }
            }
        }

        return totalCost;
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        int[][] points = {
            {0, 0},
            {2, 2},
            {3, 10},
            {5, 2},
            {7, 0}
        };

        int result = obj.minCostConnectPoints(points);

        System.out.println("Minimum Cost: " + result);
    }
}