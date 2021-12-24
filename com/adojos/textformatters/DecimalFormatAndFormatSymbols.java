package com.adojos.textformatters;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class DecimalFormatAndFormatSymbols {

    public static void main(String[] args) {

        double dbNum = 170180.24551D;
        String strPattern = "\u00A4#,###.###";
//        String strPattern = "#,###.###";

        DecimalFormatSymbols dFSymbols = new DecimalFormatSymbols();
        dFSymbols.setDecimalSeparator('-');
        dFSymbols.setMonetaryDecimalSeparator('-');
        dFSymbols.setGroupingSeparator(':');
        dFSymbols.setCurrencySymbol("$");

        DecimalFormat dFormat = new DecimalFormat(strPattern, dFSymbols);
        String strFormattedNum = dFormat.format(dbNum);

        System.out.println(strFormattedNum);
    }
}
