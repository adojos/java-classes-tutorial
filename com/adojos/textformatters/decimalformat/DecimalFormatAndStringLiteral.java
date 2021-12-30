package com.adojos.textformatters.decimalformat;

import java.text.DecimalFormat;

public class DecimalFormatAndStringLiteral {

    public static void main(String[] args) {

        double dbNum = 170180.24551D;
        String strPattern = "My formatted number is #,###.###";

        DecimalFormat deciFormat = new DecimalFormat(strPattern);
        String strFormattedNum = deciFormat.format(dbNum);

        System.out.println(strFormattedNum);

    }
}
