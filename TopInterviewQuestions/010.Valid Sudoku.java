class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Use arrays of sets to keep track of seen numbers in rows, columns, and sub-boxes
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];
        
        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        // Iterate through each cell in the board
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char num = board[r][c];
                if (num != '.') {
                    // Check if the number is already seen in the current row
                    if (rows[r].contains(num)) {
                        return false;
                    }
                    rows[r].add(num);

                    // Check if the number is already seen in the current column
                    if (cols[c].contains(num)) {
                        return false;
                    }
                    cols[c].add(num);

                    // Check if the number is already seen in the current 3x3 sub-box
                    int boxIndex = (r / 3) * 3 + (c / 3);
                    if (boxes[boxIndex].contains(num)) {
                        return false;
                    }
                    boxes[boxIndex].add(num);
                }
            }
        }

        // If no conflicts are found, return true
        return true;
    }
}
