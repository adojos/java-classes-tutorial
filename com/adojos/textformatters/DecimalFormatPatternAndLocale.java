package com.adojos.textformatters;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;


public class DecimalFormatPatternAndLocale {

    public static void main(String[] args) {

        double dbNum = 170180.24523D;
        String strPattern = "#.#####";

        NumberFormat nFormat = NumberFormat.getNumberInstance(Locale.ENGLISH);
        DecimalFormat dFormat = (DecimalFormat) nFormat;

        String strFormattedNum = dFormat.format(dbNum);
        System.out.print("With Locale = " + strFormattedNum + "\n");

        dFormat.applyPattern(strPattern);
        strFormattedNum = dFormat.format(dbNum);
        System.out.println("With Locale & Pattern = " + strFormattedNum);


        nFormat = NumberFormat.getNumberInstance(Locale.FRANCE);
        dFormat = (DecimalFormat) nFormat;
        strFormattedNum = dFormat.format(dbNum);
        System.out.print("With Locale = " + strFormattedNum + "\n");

        dFormat.applyPattern(strPattern);
        strFormattedNum = dFormat.format(dbNum);
        System.out.println("With Locale & Pattern = " + strFormattedNum);


        nFormat = NumberFormat.getNumberInstance(Locale.GERMANY);
        dFormat = (DecimalFormat) nFormat;
        strFormattedNum = dFormat.format(dbNum);
        System.out.print("With Locale = " + strFormattedNum + "\n");

        dFormat.applyPattern(strPattern);
        strFormattedNum = dFormat.format(dbNum);
        System.out.println("With Locale & Pattern = " + strFormattedNum);

    }
}
