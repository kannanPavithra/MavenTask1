package org.mavenproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HotelinConsol {

	public static void main(String[] args) throws IOException {
		File file= new File("C:\\Users\\Pavithra\\eclipse-workspace\\MavenTask\\excel\\MavenExcel.xlsx"); 
FileInputStream stream= new FileInputStream(file);
		Workbook workbook= new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("Sheet1");
		//Row row = sheet.getRow(1);
		//Cell cell = row.getCell(1);
		//System.out.println(cell);
		//int Count = sheet.getPhysicalNumberOfRows();
		//System.out.println(Count);
		//int Row = row.getPhysicalNumberOfCells();
		
		//System.out.println(Row);
//		for (int i = 0; i < row.getPhysicalNumberOfCells(); i++) {
//			Cell cell2 = row.getCell(i);
//			System.out.println(cell2);
//		}
		
		for (int i = 0; i <sheet.getPhysicalNumberOfRows(); i++) {
			Row row2 = sheet.getRow(i);
			System.out.println("*******************");
			for (int j = 0; j < row2.getPhysicalNumberOfCells(); j++) {
				Cell cell2 = row2.getCell(j);
				System.out.println(cell2);
				
			}
			
		}
		
		
		
		
	}

}
