class Solution {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        boolean[] visited = new boolean[numCourses];
        boolean[] path = new boolean[numCourses];

        for (int i = 0; i < numCourses; i++) {
            if (!visited[i]) {
                if (dfs(i, prerequisites, visited, path)) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean dfs(int course, int[][] prerequisites,
                         boolean[] visited, boolean[] path) {

        visited[course] = true;
        path[course] = true;

        for (int[] p : prerequisites) {
            if (p[0] == course) {
                int next = p[1];

                if (!visited[next]) {
                    if (dfs(next, prerequisites, visited, path)) {
                        return true;
                    }
                } else if (path[next]) {
                    return true;
                }
            }
        }

        path[course] = false;
        return false;
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        int numCourses = 2;

        int[][] prerequisites = {
            {1, 0}
        };

        boolean result = obj.canFinish(numCourses, prerequisites);

        System.out.println("Can finish all courses: " + result);
    }
}