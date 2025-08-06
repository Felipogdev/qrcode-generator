package com.felipog.qrcode.generator.ports;

public interface StoragePort {
    String uploadFile(byte[] fileDData, String fileName, String contentType);
}
