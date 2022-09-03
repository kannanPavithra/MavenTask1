package org.mavenproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.WorkbookDocument;

public class HotelAdactin {
	public static void main(String[] args) throws IOException {
	File file=new File("C:\\Users\\Pavithra\\eclipse-workspace\\MavenTask\\excel\\test.xlsx");
	//FileInputStream stream= new FileInputStream(file);
	Workbook workbook=new XSSFWorkbook();
	//Sheet sheet = workbook.getSheet("Datas");
//	int count = sheet.getPhysicalNumberOfRows();
//	System.out.println(count);
	
//	Row row = sheet.getRow(2);
//	int physicalNumberOfCells = row.getPhysicalNumberOfCells();
//	System.out.println(physicalNumberOfCells);
//	Cell cell = row.getCell(0);
//	System.out.println(cell);
//	for (int i = 0; i < row.getPhysicalNumberOfCells(); i++) {
//		Cell cell2 = row.getCell(i);
//		System.out.println(cell2);
//		
//	}
	

//	for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
//		Row row = sheet.getRow(i);
//	System.out.println("****************************");
//		for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
//			Cell cell = row.getCell(j);
//			//System.out.println(cell);
//			CellType type = cell.getCellType();	
//			
//			
//			
//				 switch (type) {
//				case STRING:
//					 String text = cell.getStringCellValue();
//					 System.out.println(text);
//					
//					break;
//				case NUMERIC:z
//					if(DateUtil.isCellDateFormatted(cell)) {
//						Date dateCellValue = cell.getDateCellValue();
//						SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
//						String format = dateFormat.format(dateCellValue);
//						System.out.println(format);
//					} else {
//						double d = cell.getNumericCellValue();
//					long b =( long)d;
//					String num = String.valueOf(b);
//					System.out.println(num);
//						long check = Math.round(d);
//						if(check==d) {
//							String s = String.valueOf(check);
//							System.out.println(s);
//						}else {
//							String s2 = String.valueOf(d);
//							System.out.println(s2);
//							
//							
//							
//							}
//					}
//					break;
//		default:
//					break;
//				 }	
//		}
//	}
//	}
	
	
	
	
//}
	
	
	
	// need to insert value in cell
//	Row row = sheet.getRow(1);
//	Cell cell = row.getCell(0);
//	String value = cell.getStringCellValue();
//	if (value.equals("ishu")) {
//		cell.setCellValue("esther");
//		}
//	FileOutputStream out=new FileOutputStream(file);
//	workbook.write(out);
//	
	
	// need to create cell and insert the value
	
//	Row row = sheet.getRow(1);
//	Cell cell = row.createCell(18);
//	cell.setCellValue("JOSHNA");
//	FileOutputStream out=new FileOutputStream(file);
//	workbook.write(out);
 
	
	//create row and cell and insert value
	
//	Row row = sheet.createRow(12);
//	Cell cell = row.createCell(2);
//	cell.setCellValue("grace");
//	FileOutputStream out=new FileOutputStream(file);
//    workbook.write(out);
	
	
	//create new workbook and insert value
	
	Workbook workbook2 = new XSSFWorkbook();
	Sheet sheet = workbook2.createSheet("testsheet");
	Row row = sheet.createRow(9);
   Cell cell = row.createCell(0);
	cell.setCellValue("joshna");
	FileOutputStream out= new FileOutputStream(file);
	workbook2.write(out);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}}
			

