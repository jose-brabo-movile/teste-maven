package com.movile.teste;

class I { 
    private String name; 
    public String name() {return name;} 
    public I(String s) {name = s;} 
    class J {  
    }
 
    public static void m1(I i) {i = null;} 
    public static void main (String[] args) {  
        I i = new I("X"); // 1
        m1(i); // 2 
        System.out.print(i.name()); // 3 
    }
}