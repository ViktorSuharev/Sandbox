package com.visu.sandbox.yandex;

public class DigestHeir extends Digest {
    @Override
    public byte[] digest(byte[] input) {
        return super.digest(input);
    }

    @Override
    protected byte[] doDigest(byte[] input) {
        return new byte[0];
    }
}
