package com.adojos.textformatters;

import java.text.DecimalFormat;


public class DecimalFormatter {

    public static void main(String[] args) {

        double dbNum = 170180.24523D;    // number to be formatted

        /* Basic Formatting Process */

        String strPattern = "######.#####";  // desired formatting pattern
        DecimalFormat decimalFormat = new DecimalFormat(strPattern);    // create DecimalFormat with Pattern
        String strFormattedNum = decimalFormat.format(dbNum);   // now format the number
        System.out.println(dbNum + " -> " + strFormattedNum);    // output = 170180.24523

        /* More Formatting Examples */

        strPattern = "######.###";  // To print full integer but only 3 decimal places
        decimalFormat = new DecimalFormat(strPattern);
        strFormattedNum = decimalFormat.format(dbNum);
        System.out.println(dbNum + " -> " + strFormattedNum);    // output = 170180.245


        strPattern = "######.000000";  // To print extra 0 in decimal value
        decimalFormat = new DecimalFormat(strPattern);
        strFormattedNum = decimalFormat.format(dbNum);
        System.out.println(dbNum + " -> " + strFormattedNum);    // output = 170180.245230


        strPattern = "#";  // To print only integer value part
        decimalFormat = new DecimalFormat(strPattern);
        strFormattedNum = decimalFormat.format(dbNum);
        System.out.println(dbNum + " -> " + strFormattedNum);    // output = 170180


        strPattern = "0000000.###";  // To print extra zero in integer part and 3 decimal places
        decimalFormat = new DecimalFormat(strPattern);
        strFormattedNum = decimalFormat.format(dbNum);
        System.out.println(dbNum + " -> " + strFormattedNum);    // output = 0170180.245


        strPattern = "#.##%";  // To print multiply by 100 and display as % with 3 decimal places
        decimalFormat = new DecimalFormat(strPattern);
        strFormattedNum = decimalFormat.format(dbNum);
        System.out.println(dbNum + " -> " + strFormattedNum);    // output = 17018024.52%

    }

}

    /* OUTPUT
    170180.24523 -> 170180.24523
    170180.24523 -> 170180.245
    170180.24523 -> 170180.245230
    170180.24523 -> 170180
    170180.24523 -> 0170180.245
    170180.24523 -> 17018024.52% */
