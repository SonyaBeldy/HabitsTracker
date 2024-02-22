package ru.sonyabeldy.habitstraker;

import org.bytedeco.javacpp.BytePointer;
import org.bytedeco.leptonica.PIX;
import org.bytedeco.tesseract.TessBaseAPI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.sonyabeldy.habitstraker.utils.SleepTextParser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.bytedeco.leptonica.global.leptonica.pixDestroy;
import static org.bytedeco.leptonica.global.leptonica.pixRead;

@SpringBootApplication
public class HabitsTrakerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HabitsTrakerApplication.class, args);
	}

}
