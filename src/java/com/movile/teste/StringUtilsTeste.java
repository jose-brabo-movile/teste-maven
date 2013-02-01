package com.movile.teste;

import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DateUtils;

public class StringUtilsTeste {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String teste = " a";
        String teste2 = null;

        if (StringUtils.isNotBlank(teste)) {
            System.out.println("isNotBlank");
        } else {
            System.out.println("isBlank");
        }
        
        if (StringUtils.equals(teste, teste2)) {
            System.out.println("equal");
        } else {
            System.out.println("notEqual");
        }
        
        System.out.println(DateUtils.addHours(new Date(), 1));
        
        System.out.println(DateUtils.truncate(new Date(), Calendar.YEAR));

    }

}
