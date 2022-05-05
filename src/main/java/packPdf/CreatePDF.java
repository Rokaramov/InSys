package packPdf;

import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class CreatePDF {
	
	
	public CreatePDF(Double x1, Double x2, Double x3, Double x4, Double x5) {
		 
		try {
			String fontpath = "/fonts/times.ttf";
			BaseFont times = null;
			try {
					times = BaseFont.createFont(fontpath, "UTF-8", BaseFont.EMBEDDED);
				} catch (DocumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
			}
 
			String filepath = new File("").getCanonicalPath();
			String[] parsfilepath = filepath.split("/");
			
			int lengthpath = parsfilepath.length;
			String abspath=""; 
			for(int i=0;i<(lengthpath-1);i++) {
				abspath=abspath+parsfilepath[i]+"/";
			}
			filepath=abspath+"webapps/Kursovaya/Team10.pdf";
			
		Document document = new Document();
 
		PdfWriter.getInstance(document, new FileOutputStream(filepath));
 
		document.open();
 
		DecimalFormat df2 = new DecimalFormat("###.##");
 
		Paragraph mainPara = new Paragraph("Результаты:",  new Font(times,14));
		mainPara.setAlignment(Paragraph.ALIGN_CENTER);
		Paragraph para1 = new Paragraph("Стоимость недвижимости " + x1 + " рублей",  new Font(times,14));
		para1.setAlignment(Paragraph.ALIGN_CENTER);
		Paragraph para2 = new Paragraph("Процентная ставка " + df2.format(x2 * 100) + " процентов",  new Font(times,14));
		para2.setAlignment(Paragraph.ALIGN_CENTER);
		Paragraph para3 = new Paragraph("На " + df2.format(x3 / 12) + " полных лет",  new Font(times,14));
		para3.setAlignment(Paragraph.ALIGN_CENTER);
		Paragraph para4 = new Paragraph("С первым взносом " + df2.format(x4) + " рублей",  new Font(times,14));
		para4.setAlignment(Paragraph.ALIGN_CENTER);
		Paragraph para5 = new Paragraph("Ежемесячный платёж составит: " + df2.format(x5) + " рублей",  new Font(times,14));
		para5.setAlignment(Paragraph.ALIGN_CENTER);
		Paragraph para6 = new Paragraph(" ");
		para6.setAlignment(Paragraph.ALIGN_CENTER);
 
		document.add(mainPara);
		document.add(para1);
		document.add(para2);
		document.add(para3);
		document.add(para4);
		document.add(para5);
		document.add(para6);
 
		PdfPTable table = new PdfPTable(3);
		PdfPCell c1 = new PdfPCell(new Phrase("Стоимость недвижимости:",  new Font(times,14)));
		table.addCell(c1); 
 
		c1 = new PdfPCell(new Phrase(df2.format(x1),  new Font(times,14)));
		table.addCell(c1);
 
		c1 = new PdfPCell(new Phrase("рублей",  new Font(times,14)));
		table.addCell(c1);
 
		c1 = new PdfPCell(new Phrase("Процентная ставка:",  new Font(times,14)));
		table.addCell(c1);
		table.addCell(df2.format(x2 * 100));
		c1 = new PdfPCell(new Phrase("процентов",  new Font(times,14)));
		table.addCell(c1);
 
		c1 = new PdfPCell(new Phrase("Срок кредитования:",  new Font(times,14)));
		table.addCell(c1);
		table.addCell(df2.format(x3 / 12));
		c1 = new PdfPCell(new Phrase("полных лет",  new Font(times,14)));
		table.addCell(c1);
 
		c1 = new PdfPCell(new Phrase("Первый взнос:",  new Font(times,14)));
		table.addCell(c1);
		table.addCell(df2.format(x4));
		c1 = new PdfPCell(new Phrase("рублей",  new Font(times,14)));
		table.addCell(c1);
 
		c1 = new PdfPCell(new Phrase("Ежемесячный платёж:",  new Font(times,14)));
		table.addCell(c1);
		table.addCell(df2.format(x5));
		c1 = new PdfPCell(new Phrase("рублей",  new Font(times,14)));
		table.addCell(c1);
 
		document.add(table);

		document.close();
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}
