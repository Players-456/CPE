class Problem3 {

    public static int canCompleteCircuit(int[] gas, int[] cost) {

        int total = 0;
        int fuel = 0;
        int start = 0;

        for (int i = 0; i < gas.length; i++) {

            total += gas[i] - cost[i];

            fuel += gas[i] - cost[i];

            if (fuel < 0) {
                start = i + 1;
                fuel = 0;
            }
        }

        if (total < 0)
            return -1;

        return start;
    }

    public static void main(String[] args) {

        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};

        System.out.println(canCompleteCircuit(gas, cost));
    }
}