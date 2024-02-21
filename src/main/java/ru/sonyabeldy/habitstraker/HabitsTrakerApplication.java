package ru.sonyabeldy.habitstraker;

import org.bytedeco.javacpp.BytePointer;
import org.bytedeco.leptonica.PIX;
import org.bytedeco.tesseract.TessBaseAPI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static org.bytedeco.leptonica.global.leptonica.pixDestroy;
import static org.bytedeco.leptonica.global.leptonica.pixRead;

@SpringBootApplication
public class HabitsTrakerApplication {

	public static void main(String[] args) {
		TessBaseAPI api = new TessBaseAPI();
		if (api.Init(null, "rus") != 0) {
			System.err.println("Could not initialize tesseract.");
			System.exit(1);
		}

		PIX image = pixRead("C:\\Users\\Sonya\\Desktop\\Samsung Helth\\photo_2024-02-18_00-47-33 — копия.jpg");
		api.SetImage(image);

		BytePointer outText;
		outText = api.GetUTF8Text();
		System.out.println("OCR output:\n" + outText.getString());

		// Destroy used object and release memory
		api.End();
		outText.deallocate();
		pixDestroy(image);

//		SpringApplication.run(HabitsTrakerApplication.class, args);
	}

}
