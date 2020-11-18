package com.weirdo.convert;

import com.spire.pdf.FileFormat;
import com.spire.pdf.PdfDocument;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class PdfConvertWordApplicationTests {

    @Test
    void pdf2Word() {
        PdfDocument pdf = new PdfDocument("/Users/weirdo/Desktop/Java面试手册.pdf");
        pdf.saveToFile("/Users/weirdo/Desktop/Java面试手册.docx", FileFormat.DOCX);
        System.out.println("转换成功");
    }

}
