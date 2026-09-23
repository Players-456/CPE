public class Problem1 {
    public static void main(String[] args) {

        int poured = 2;
        int query_row = 1;
        int query_glass = 1;

        double[][] glasses = new double[100][100];

        glasses[0][0] = poured;

        for (int i = 0; i < 99; i++) {
            for (int j = 0; j <= i; j++) {

                if (glasses[i][j] > 1) {

                    double extra = glasses[i][j] - 1;

                    glasses[i + 1][j] += extra / 2;
                    glasses[i + 1][j + 1] += extra / 2;
                }
            }
        }

        double answer = Math.min(1, glasses[query_row][query_glass]);

        System.out.printf("%.5f", answer);
    }
}