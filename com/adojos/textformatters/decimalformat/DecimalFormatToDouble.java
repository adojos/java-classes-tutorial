package com.adojos.textformatters.decimalformat;

import java.text.DecimalFormat;

public class DecimalFormatToDouble {

    public static void main(String[] args) {

        double dbNum1 = 170180.24523D;
        double dbNum2 = 170180.24523D;

        // Get double to 3 decimal places using DecimalFormat Pattern (Double.valueOf(String))
        String strPattern = "######.###";
//        DecimalFormat decimalFormat = new DecimalFormat(strPattern);
        DecimalFormat decimalFormat = new DecimalFormat(strPattern);
        decimalFormat.setMaximumFractionDigits(3);

        String strFormattedNum1 = decimalFormat.format(dbNum1);
        String strFormattedNum2 = decimalFormat.format(dbNum2);

        double dbFormattedNum1 = Double.parseDouble(strFormattedNum1);
        double dbFormattedNum2 = Double.parseDouble(strFormattedNum2);

//        int iResult = Double.compare(Double.parseDouble(strFormattedNum1), Double.parseDouble(strFormattedNum2));
//        boolean bResult = (iResult == 0)? true : false;
//
//        if (bResult) {System.out.println("Both Decimal values are equal");}
//        else {System.out.println("Both Decimal values are not equal");}
    }

}
