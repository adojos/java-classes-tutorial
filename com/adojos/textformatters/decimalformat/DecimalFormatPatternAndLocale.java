package com.adojos.textformatters.decimalformat;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;


public class DecimalFormatPatternAndLocale {

    public static void main(String[] args) {

        double dbNum = 170180.24523D;
        String strPattern = "#.#####";

        NumberFormat nFormat = NumberFormat.getNumberInstance(Locale.ENGLISH);
        DecimalFormat dFormat = (DecimalFormat) nFormat;    // cast NumberFormat into DecimalFormat

        String strFormattedNum = dFormat.format(dbNum);
        System.out.print("With ENGLISH Locale = " + strFormattedNum + "\n");

        dFormat.applyPattern(strPattern);
        strFormattedNum = dFormat.format(dbNum);
        System.out.println("With Locale & Pattern = " + strFormattedNum);


        nFormat = NumberFormat.getNumberInstance(Locale.FRANCE);
        dFormat = (DecimalFormat) nFormat;
        strFormattedNum = dFormat.format(dbNum);
        System.out.print("With FRANCE Locale = " + strFormattedNum + "\n");

        dFormat.applyPattern(strPattern);
        strFormattedNum = dFormat.format(dbNum);
        System.out.println("With Locale & Pattern = " + strFormattedNum);


        nFormat = NumberFormat.getNumberInstance(Locale.GERMANY);
        dFormat = (DecimalFormat) nFormat;
        strFormattedNum = dFormat.format(dbNum);
        System.out.print("With GERMANY Locale = " + strFormattedNum + "\n");

        dFormat.applyPattern(strPattern);
        strFormattedNum = dFormat.format(dbNum);
        System.out.println("With Locale & Pattern = " + strFormattedNum);

    }
}

/*  OUTPUT
With ENGLISH Locale = 170,180.245
With Locale & Pattern = 170180.24523
With FRANCE Locale = 170 180,245
With Locale & Pattern = 170180,24523
With GERMANY Locale = 170.180,245
With Locale & Pattern = 170180,24523 */
