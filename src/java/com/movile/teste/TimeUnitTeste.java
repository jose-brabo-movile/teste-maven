package com.movile.teste;

import java.util.concurrent.TimeUnit;

public class TimeUnitTeste {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        //TODO teste de task
        
        //FIXME teste de fixme
        
        //XXX que putaria
        
        System.out.println(TimeUnit.DAYS.toHours(2));
        
        System.out.println(TimeUnit.MINUTES.toDays(14400));
        
        System.out.println(TimeUnit.MINUTES.convert(10, TimeUnit.DAYS));

    }

}
