package com.visu.sandbox.bytebuffer;

import java.nio.ByteBuffer;

public class Main {

    public static final int DEFAULT_CAPACITY = 16;

    public static void main(String[] args) {

        ByteBuffer buffer = ByteBuffer.allocate(DEFAULT_CAPACITY);
        System.out.println("capacity " + buffer.capacity() + " position " + buffer.position());

        buffer.clear();
        System.out.println("capacity " + buffer.capacity() + " position " + buffer.position());

        buffer.putInt(1)
                .put((byte) -1)
                .putInt(2);
        System.out.println("capacity " + buffer.capacity() + " position " + buffer.position());

        for (byte b : buffer.array()) {
            System.out.print(b);
        }
        System.out.println();
        System.out.println("capacity " + buffer.capacity() + " position " + buffer.position());

        buffer.clear();
        System.out.println("capacity " + buffer.capacity() + " position " + buffer.position());
        System.out.println();



        byte[] array = new byte[] { 0x00, 0x01, 0x02, 0x03 };
        printByteArray(array);

        ByteBuffer byteBuffer = ByteBuffer.wrap(array);
        printBuffer(byteBuffer);

        array[0] = 0x03;
        array[3] = 0x00;

        printBuffer(byteBuffer);
    }

    private static void printBuffer(ByteBuffer byteBuffer) {
        for (byte b : byteBuffer.array()) {
            System.out.print(b);
        }
        System.out.println();
    }

    private static void printByteArray(byte[] array) {
        for (byte b : array) {
            System.out.print(b);
        }
        System.out.println();
    }
}
