package com.core.java.day01;

public class Test01{
    public static void main(String[] args) {
        System.out.println(Math.PI);

        byte b = (byte)300; //超出范围后强制转换
        System.out.println(b);

        int i= 1;
        i += 2.1;
        System.out.println(i);

        bitTest();

        System.exit(0);
    }
    /**
     * 位运算操作
     * &：与操作
     * |:或操作
     * ^:非操作
     * ~:取反做操
     * >>:右移
     * <<:左移
     * >>>：用符号位填充高位
     */
    public static void bitTest(){
        int n = 9;
        System.out.println(Integer.toBinaryString(n));
        int n1 = n & 0b1111;
        System.out.println(Integer.toBinaryString(n1));
        int n2 = n1 / 0b1000;
        System.out.println(n2);
    }
    

}