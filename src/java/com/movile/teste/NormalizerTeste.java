package com.movile.teste;

import java.text.Normalizer;

public class NormalizerTeste {

    public static String value = "À Á Â Ã Ä Å Æ Ç È É Ê Ë Ì Í Î Ï Ð Ñ Ò Ó Ô Õ Ö Ø Ù Ú Û Ü Ý Þ ß à á â ã ä å æ ç è é ê ë ì í î ï ð ñ ò ó ô õ ö ø ù ú û ü ý þ ÿ ";

    public static void main(String args[]) throws Exception {
        System.out.println("Code Review");
        
    	//Teste
    	//Teste2
        System.out.println("Original: " + value);

        System.out.println("ASCII   : " + Normalizer.normalize(value, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", ""));
    }
}
