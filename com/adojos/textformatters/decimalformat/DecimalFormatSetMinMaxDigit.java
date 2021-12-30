package com.adojos.textformatters.decimalformat;

import java.text.DecimalFormat;

public class DecimalFormatSetMinMaxDigit {

    public static void main(String[] args) {

        double dbNum = 170180.24551D;

        DecimalFormat deciFormat = new DecimalFormat();
        System.out.println("Original Num: " + dbNum);

        String strFormattedNum = deciFormat.format(dbNum);
        System.out.println("JVM Locale Formatted Num: " + strFormattedNum);

        String strPattern = "#,####.####";
        deciFormat.applyPattern(strPattern);
        strFormattedNum = deciFormat.format(dbNum);
        System.out.println("Pattern Formatted Num: " + strFormattedNum);

        deciFormat.setMinimumFractionDigits(1);
        deciFormat.setMaximumFractionDigits(4);
        strFormattedNum = deciFormat.format(dbNum);

        System.out.println("With Min/Max Fraction Digits: " + strFormattedNum);

        deciFormat.setMinimumIntegerDigits(1);
        deciFormat.setMaximumIntegerDigits(3);
        strFormattedNum = deciFormat.format(dbNum);

        System.out.println("With Min/Max Integer & Fraction Digits: " + strFormattedNum);

    }
}
