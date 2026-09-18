class Solution {

    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int provinces = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                provinces++;
                dfs(isConnected, visited, i);
            }
        }

        return provinces;
    }

    private void dfs(int[][] isConnected, boolean[] visited, int city) {
        visited[city] = true;

        for (int i = 0; i < isConnected.length; i++) {
            if (isConnected[city][i] == 1 && !visited[i]) {
                dfs(isConnected, visited, i);
            }
        }
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        int[][] isConnected = {
            {1, 1, 0},
            {1, 1, 0},
            {0, 0, 1}
        };

        int result = obj.findCircleNum(isConnected);

        System.out.println("Number of Provinces: " + result);
    }
}