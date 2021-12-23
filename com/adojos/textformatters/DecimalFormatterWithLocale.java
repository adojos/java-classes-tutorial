package com.adojos.textformatters;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class DecimalFormatterWithLocale {

    public static void main(String[] args) {

        String pattern = "###.##";

        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getNumberInstance(Locale.ENGLISH);
//        decimalFormat.applyPattern(pattern);

        String format = decimalFormat.format(123456789.123);
        System.out.println(format);
    }
}
