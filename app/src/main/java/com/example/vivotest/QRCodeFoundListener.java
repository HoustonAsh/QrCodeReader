package com.example.vivotest;

public interface QRCodeFoundListener {
    void onQRCodeFound(String qrCode);

    void qrCodeNotFound();
}
