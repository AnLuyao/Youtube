package com.util;

/**
 * @author AnLuyao
 * @date 2018-05-21 11:50
 */
public class ETLUtil {
    public static String ETLString(String line) {
        StringBuilder etlString = new StringBuilder();
        String[] splits = line.split("\t");
        if (splits.length < 9) {
            return null;
        }
        splits[3] = splits[3].replace(" ", "");
        for (int i = 0; i < splits.length; i++) {
            if (i < 9) {
                if (i == splits.length - 1) {
                    etlString.append(splits[i]);
                } else {
                    etlString.append(splits[i] + "\t");
                }
            } else {
                if (i == splits.length - 1) {
                    etlString.append(splits[i]);
                } else {
                    etlString.append(splits[i] + "&");
                }
            }
        }
        return etlString.toString();
    }

}
