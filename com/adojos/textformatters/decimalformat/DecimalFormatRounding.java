package com.adojos.textformatters.decimalformat;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class DecimalFormatRounding {

    public static void main(String[] args) {

        double dbNum = 170180.24551D;

        DecimalFormat dFormat = new DecimalFormat();
        dFormat.setRoundingMode(RoundingMode.HALF_UP);
        String strFormattedNum = dFormat.format(dbNum);
        System.out.println(dbNum + " Rounded-UP " + strFormattedNum);

        dFormat.setRoundingMode(RoundingMode.DOWN);
        strFormattedNum = dFormat.format(dbNum);
        System.out.println(dbNum + " Rounded-DOWN " + strFormattedNum);

    }
}
