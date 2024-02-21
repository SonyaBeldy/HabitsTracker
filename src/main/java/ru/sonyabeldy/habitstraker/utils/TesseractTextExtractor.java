package ru.sonyabeldy.habitstraker.utils;

import org.bytedeco.javacpp.BytePointer;
import org.bytedeco.leptonica.PIX;
import org.bytedeco.tesseract.TessBaseAPI;
import org.springframework.security.core.parameters.P;

import java.awt.*;
import java.awt.image.BufferedImage;

import static org.bytedeco.leptonica.global.leptonica.*;

public class TesseractTextExtractor implements TextExtractor {
    private final TessBaseAPI api;
    public TesseractTextExtractor() {
        api = new TessBaseAPI();
        if (api.Init(null, "rus") != 0) {
            System.err.println("Could not initialize tesseract.");
            throw new RuntimeException("Tesseract sdoh");
        }
    }

    @Override
    public String extractText(byte[] imageBytes) {
        PIX img = pixReadMem(imageBytes, imageBytes.length);
        api.SetImage(img);

        BytePointer outText;
        outText = api.GetUTF8Text();
        return outText.getString();
    }
}
