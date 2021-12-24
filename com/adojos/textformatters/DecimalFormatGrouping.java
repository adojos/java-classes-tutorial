package com.adojos.textformatters;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class DecimalFormatGrouping {

    public static void main(String[] args) {

        double dbNum = 170180.24551D;

        DecimalFormat dFormat = new DecimalFormat();
        dFormat.setGroupingSize(4);

        String strFormattedNum = dFormat.format(dbNum);
        System.out.println(dbNum + " GroupSize(4) = " + strFormattedNum);

    }
}

/*  OUTPUT
170180.24551 GroupSize(4) = 17,0180.246 */
