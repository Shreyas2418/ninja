package com.crm.base;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	public static ArrayList getTestData(String filePath) {
		ArrayList data = new ArrayList();
		try {
			FileInputStream fis = new FileInputStream(filePath);
			XSSFWorkbook worbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = worbook.getSheetAt(0);
			Iterator<Row> itr = sheet.iterator();
			while (itr.hasNext()) {
				Row row = itr.next();
				Iterator<Cell> cellItr = row.cellIterator();
				while (cellItr.hasNext()) {
					Cell cell = cellItr.next();
					data.add(cell.getStringCellValue());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}
}
