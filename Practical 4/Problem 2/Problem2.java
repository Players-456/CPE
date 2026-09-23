import java.util.Arrays;

class Problem2 {

    public static String sortVowels(String s) {

        char[] arr = s.toCharArray();

        String vowels = "";

        // Find vowels
        for (char c : arr) {
            if ("aeiouAEIOU".indexOf(c) != -1) {
                vowels += c;
            }
        }

        // Convert vowels to char array and sort
        char[] v = vowels.toCharArray();
        Arrays.sort(v);

        // Put sorted vowels back
        int j = 0;

        for (int i = 0; i < arr.length; i++) {

            if ("aeiouAEIOU".indexOf(arr[i]) != -1) {
                arr[i] = v[j];
                j++;
            }
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        System.out.println(sortVowels("lEetcOde"));
    }
}