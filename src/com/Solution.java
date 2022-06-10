package com;

import java.util.*;

public class Solution {

    public static int getResult(String gameField, String race) {
        int[][] matrix = new int[4][4];

        char[] str = gameField.toCharArray();
        ArrayList<Integer> gameIntField = new ArrayList<Integer>(16);
        gameIntField = getIntGameField(str, gameIntField, race);

        for (int i = 0, k = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = gameIntField.get(k++);
                ;
            }
        }
        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int i = 1; i < columns; i++) {
            matrix[0][i] += matrix[0][i - 1];
        }
        for (int i = 1; i < rows; i++) {
            matrix[i][0] += matrix[i - 1][0];
        }
        for (int r = 1; r < rows; r++) {
            for (int c = 1; c < columns; c++) {
                int from1 = matrix[r - 1][c];
                int from2 = matrix[r][c - 1];
                matrix[r][c] += Math.min(from1, from2);
            }
        }
        return (matrix[rows - 1][columns - 1] - matrix[0][0]);

    }

    private static ArrayList getIntGameField(char[] str, ArrayList gameField, String race) {
        for (int i = 0; i < str.length; i++) {
            switch (str[i]) {
                case ('S'):
                    switch (race) {
                        case ("Human"):
                            gameField.add(5);
                            break;
                        case ("Swamper"):
                            gameField.add(2);
                            break;
                        case ("Woodman"):
                            gameField.add(3);
                            break;
                        default:
                            gameField.add(0);
                            break;
                    }
                    break;

                case ('W'):
                    switch (race) {
                        case ("Human"):
                            gameField.add(2);
                            break;
                        case ("Swamper"):
                            gameField.add(2);
                            break;
                        case ("Woodman"):
                            gameField.add(3);
                            break;
                        default:
                            gameField.add(0);
                            break;
                    }
                    break;

                case ('T'):
                    switch (race) {
                        case ("Human"):
                            gameField.add(3);
                            break;
                        case ("Swamper"):
                            gameField.add(5);
                            break;
                        case ("Woodman"):
                            gameField.add(2);
                            break;
                        default:
                            gameField.add(0);
                            break;
                    }
                    break;

                case ('P'):
                    switch (race) {
                        case ("Human"):
                            gameField.add(1);
                            break;
                        case ("Swamper"):
                            gameField.add(2);
                            break;
                        case ("Woodman"):
                            gameField.add(2);
                            break;
                        default:
                            gameField.add(0);
                            break;
                    }
                    break;
            }
        }
        return gameField;
    }


}


