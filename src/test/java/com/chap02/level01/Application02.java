package com.chap02.level01;

public class Application02 {

    public static void main(String[] args) {

        int numOfApples = 92;
        int sizeOfBucket = 10;
        int numOfBucket = numOfApples / sizeOfBucket + (numOfApples % sizeOfBucket > 0 ? 1 : 0 );

        System.out.println("필요한 바구니의 수 : " + numOfBucket);
    }

}
