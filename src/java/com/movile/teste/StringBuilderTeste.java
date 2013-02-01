package com.movile.teste;

public class StringBuilderTeste {
    private static final int ITERATIONS = 1000000;
    private static final int BUFFSIZE = 16;

    private void concatStrAdd() {
        System.out.print("concatStrAdd   -> ");
        long startTime = System.currentTimeMillis();
        String concat = "";
        for (int i = 0; i < ITERATIONS; i++) {
            concat += i % 10;
        }
        long endTime = System.currentTimeMillis();
        System.out.print("length: " + concat.length());
        System.out.println(" time: " + (endTime - startTime) + " ms");
    }

    private void concatStrBuff() {
        System.out.print("concatStrBuff  -> ");
        long startTime = System.currentTimeMillis();
        StringBuffer concat = new StringBuffer(BUFFSIZE);
        for (int i = 0; i < ITERATIONS; i++) {
            concat.append(i % 10);
        }
        long endTime = System.currentTimeMillis();
        System.out.print("length: " + concat.length());
        System.out.println(" time: " + (endTime - startTime) + " ms");
    }

    private void concatStrBuild() {
        System.out.print("concatStrBuild -> ");
        long startTime = System.currentTimeMillis();
        StringBuilder concat = new StringBuilder(BUFFSIZE);
        for (int i = 0; i < ITERATIONS; i++) {
            concat.append(i % 10);
        }
        long endTime = System.currentTimeMillis();
        System.out.print("length: " + concat.length());
        System.out.println(" time: " + (endTime - startTime) + " ms");
    }

    public static void main(String[] args) {
        StringBuilderTeste st = new StringBuilderTeste();
        System.out.println("Iterations: " + ITERATIONS);
        System.out.println("Buffer    : " + BUFFSIZE);

        st.concatStrBuff();
        st.concatStrBuild();
        st.concatStrAdd();
    }
}
