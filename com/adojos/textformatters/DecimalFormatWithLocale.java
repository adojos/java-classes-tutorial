package com.adojos.textformatters;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class DecimalFormatWithLocale {

    public static void main(String[] args) {

        double dbNum = 170180.24523D;

        /* Formatting Numbers Using Locale only (No Pattern Specified) */

        NumberFormat nFormat = NumberFormat.getNumberInstance(Locale.ENGLISH);
        String strOptionalInfo = Locale.ENGLISH.getDisplayName() + " ("+Locale.ENGLISH.toLanguageTag()+")";
//        nFormat.setMinimumFractionDigits(5);
//        nFormat.setMinimumIntegerDigits(7);
        DecimalFormat dFormat = (DecimalFormat) nFormat;    // cast NumberFormat into DecimalFormat
        String strFormattedNum = dFormat.format(dbNum);
        System.out.println(strFormattedNum + " - " + strOptionalInfo);

        nFormat = NumberFormat.getNumberInstance(Locale.FRANCE);
        strOptionalInfo = Locale.FRANCE.getDisplayName() + " ("+Locale.FRANCE.toLanguageTag()+")";
        dFormat = (DecimalFormat) nFormat;    // cast NumberFormat into DecimalFormat
        strFormattedNum = dFormat.format(dbNum);
        System.out.println(strFormattedNum + " - " + strOptionalInfo);

        nFormat = NumberFormat.getNumberInstance(Locale.GERMAN);
        strOptionalInfo = Locale.GERMAN.getDisplayName() + " ("+Locale.GERMANY.toLanguageTag()+")";
        dFormat = (DecimalFormat) nFormat;    // cast NumberFormat into DecimalFormat
        strFormattedNum = dFormat.format(dbNum);
        System.out.println(strFormattedNum + " - " + strOptionalInfo);

    }

}
/*  OUTPUT
    170,180.245 - English (en)
    170 180,245 - French (France) (fr-FR)
    170.180,245 - German (de) */
