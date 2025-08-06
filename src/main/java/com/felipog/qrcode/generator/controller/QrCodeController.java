package com.felipog.qrcode.generator.controller;

import com.felipog.qrcode.generator.dto.QrCodeGenerateRequestDTO;
import com.felipog.qrcode.generator.dto.QrCodeGenerateResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/qr-code")
public class QrCodeController {

    @PostMapping
    public ResponseEntity<QrCodeGenerateResponse
            > generate(@RequestBody QrCodeGenerateRequestDTO request) {
        return null;
    }
}
