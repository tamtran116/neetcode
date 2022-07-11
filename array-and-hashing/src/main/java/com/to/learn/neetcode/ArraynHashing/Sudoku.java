package com.to.learn.neetcode.ArraynHashing;

import java.util.HashSet;
import java.util.Set;

/**
 * Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be
 * validated according to the following rules:
 * 
 * Each row must contain the digits 1-9 without repetition.
 * Each column must contain the digits 1-9 without repetition.
 * Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9
 * without repetition.
 * Note:
 * 
 * A Sudoku board (partially filled) could be valid but is not necessarily
 * solvable.
 * Only the filled cells need to be validated according to the mentioned rules.
 * 
 * 
 * Input: board =
 * [["5","3",".",".","7",".",".",".","."]
 * ,["6",".",".","1","9","5",".",".","."]
 * ,[".","9","8",".",".",".",".","6","."]
 * ,["8",".",".",".","6",".",".",".","3"]
 * ,["4",".",".","8",".","3",".",".","1"]
 * ,["7",".",".",".","2",".",".",".","6"]
 * ,[".","6",".",".",".",".","2","8","."]
 * ,[".",".",".","4","1","9",".",".","5"]
 * ,[".",".",".",".","8",".",".","7","9"]]
 * Output: true
 * 
 * Input: board =
 * [["8","3",".",".","7",".",".",".","."]
 * ,["6",".",".","1","9","5",".",".","."]
 * ,[".","9","8",".",".",".",".","6","."]
 * ,["8",".",".",".","6",".",".",".","3"]
 * ,["4",".",".","8",".","3",".",".","1"]
 * ,["7",".",".",".","2",".",".",".","6"]
 * ,[".","6",".",".",".",".","2","8","."]
 * ,[".",".",".","4","1","9",".",".","5"]
 * ,[".",".",".",".","8",".",".","7","9"]]
 * Output: false
 * Explanation: Same as Example 1, except with the 5 in the top left corner
 * being modified to 8. Since there are two 8's in the top left 3x3 sub-box, it
 * is invalid.
 * 
 * Constraints:
 * 
 * board.length == 9
 * board[i].length == 9
 * board[i][j] is a digit 1-9 or '.'.
 */
public class Sudoku {
    // 2 dimensionals array
    public static boolean isValidSudoku(char[][] board) {
        /**
         * hashmap solution
         */
        Set<String> keySet = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if('.' != board[i][j]) {
                    if(keySet.contains("row" + i + board[i][j]) || keySet.contains("col" + j + board[i][j])) {
                        System.out.println("found duplicate when checking row or column");
                        return false;
                    }
                    keySet.add("row" + i + board[i][j]);
                    keySet.add("col" + j + board[i][j]);

                    if(keySet.contains("cube" + i/3 + j/3 + board[i][j])) {
                        System.out.println("found irregular in cube");
                        return false;
                    }
                    keySet.add("cube" + i/3 + j/3 + board[i][j]) ;
                }
                
            }
        }
        return true;
        
        
        
        
        /**
         * brute force
         * - check individual row
         * - check individual column
         * - check each square of 3 cells
         */

        /* List<List<Character>> listBigRow = new ArrayList<>();
        listBigRow.add(new ArrayList<>());
        listBigRow.add(new ArrayList<>());
        listBigRow.add(new ArrayList<>());

        int columnGroup = 0;

        for (int x = 0; x < 9; x++) {
            char[] row  = new char[9];
            char[] column = new char[9];
            List<Character> listRow = new ArrayList<>();
            for (int y = 0; y < 9; y++) {
                // loop thru column
                row[y] = board[x][y];
                column[y] = board[y][x];
                listRow.add(row[y]);
                // listCol.add(row[y]);
                if((y + 1)%3==0) {
                    // listBigRow.add(listRow);
                    listBigRow.get(columnGroup).addAll(listRow);
                    listRow = new ArrayList<>();
                    columnGroup++;
                }
            }
            columnGroup = 0;
            if(x<8 && (x+1)%3==0) {
                listBigRow.add(0, new ArrayList<>());
                listBigRow.add(0, new ArrayList<>());
                listBigRow.add(0, new ArrayList<>());

            }
            if (containDuplicate(column)) {
                return false;
            }
            if (containDuplicate(row)) {
                return false;
            }

        }

        for(List<Character> cell : listBigRow) {
            char[] chars = new char[cell.size()] ;
            for(int i = 0; i<chars.length ; i++) {
                chars[i] = cell.get(i);
            }
            if(containDuplicate(chars)) {
                return false;
            };
        }
        return true; */
    }

    /* // check duplicate
    private static boolean containDuplicate(char[] chars) {
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < chars.length; i++) {
            if ('.' != chars[i] && !set.add(chars[i])) {
                return true;
            }
        }
        return false;
    } */
}
