package com.adojos.textformatters.decimalformat;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class DecimalFormatWithLocale2 {

    public static void main(String[] args) {

        double dbNum = 170180.24523D;

        NumberFormat nFormat = NumberFormat.getNumberInstance(Locale.GERMANY);

        DecimalFormat dFormat = (DecimalFormat) nFormat;

        String strFormattedNum = dFormat.format(dbNum);

        System.out.println(strFormattedNum + " - " + Locale.GERMANY.getDisplayName());

    }

}
/*  OUTPUT
    170,180.245 - English (en)
    170 180,245 - French (France) (fr-FR)
    170.180,245 - German (de) */
