package com.adojos.javaformatters;

import java.text.DecimalFormat;

public class DecimalFormatter {

    public static void main(String[] args) {

        double dbPi = 233233.45;
        String strPattern = "###,###.000";

        DecimalFormat decimalFormat = new DecimalFormat(strPattern);

        String strFormattedNum = decimalFormat.format(dbPi);

        System.out.println(strFormattedNum);
    }

}
