public class MultiplyStrings {

    public static String multiply(String num1, String num2) {

        // If any number is 0
        if (num1.equals("0") || num2.equals("0"))
            return "0";

        int n = num1.length();
        int m = num2.length();

        int[] result = new int[n + m];

        // Multiply digits from right to left
        for (int i = n - 1; i >= 0; i--) {

            for (int j = m - 1; j >= 0; j--) {

                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');

                int sum = mul + result[i + j + 1];

                result[i + j + 1] = sum % 10;
                result[i + j] += sum / 10;
            }
        }

        // Convert array into string
        StringBuilder ans = new StringBuilder();

        for (int num : result) {

            if (!(ans.length() == 0 && num == 0))
                ans.append(num);
        }

        return ans.toString();
    }

    public static void main(String[] args) {

        String num1 = "123";
        String num2 = "456";

        System.out.println("Product = " + multiply(num1, num2));
    }
}