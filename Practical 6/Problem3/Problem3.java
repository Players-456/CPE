public class Problem3 {

    static boolean search(char[][] board, String word, int i, int j, int index) {

        if (index == word.length()) {
            return true;
        }

        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length) {
            return false;
        }

        if (board[i][j] != word.charAt(index)) {
            return false;
        }

        char temp = board[i][j];
        board[i][j] = '#';

        boolean result =
                search(board, word, i + 1, j, index + 1) ||
                search(board, word, i - 1, j, index + 1) ||
                search(board, word, i, j + 1, index + 1) ||
                search(board, word, i, j - 1, index + 1);

        board[i][j] = temp;

        return result;
    }

    public static void main(String[] args) {

        char[][] board = {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'}
        };

        String word = "ABCCED";

        boolean found = false;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                if (search(board, word, i, j, 0)) {
                    found = true;
                }
            }
        }

        System.out.println(found);
    }
}