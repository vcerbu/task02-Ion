package com.endava.entity.field;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by lex on 21.03.2017.
 */
public class RandomField {

    public void createFillPrintField(int row, int column, int maxNumber) {
        int randomNumber;
        Random rand = new Random();
        int[][] field = new int[row][column];
        ArrayList numbers = new ArrayList();
        for (int i = 0; i < row; i++)
            for (int j = 0; j < column; j++) {
                randomNumber = rand.nextInt((maxNumber - 1) + 1) + 1;
                if ((i == 0) && (j == 0)) {
                    field[0][0] = randomNumber;
                    numbers.add(field[0][0]);
                } else {
                    while (numbers.contains(new Integer(randomNumber))) {
                        randomNumber = rand.nextInt((maxNumber - 1) + 1) + 1;
                    }
                    field[i][j] = randomNumber;
                    numbers.add(field[i][j]);
                }
            }

        System.out.println("Generated field is: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }

    }
}
