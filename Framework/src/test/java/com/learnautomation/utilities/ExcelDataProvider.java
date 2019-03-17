package com.learnautomation.utilities;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	XSSFWorkbook wb;

	public ExcelDataProvider() {
		File src = new File("./TestData/testdat.xlsx");
		try {
			FileInputStream fls = new FileInputStream(src);

			wb = new XSSFWorkbook(fls);
		} catch (Exception e) {

			System.out.println("Unable to read the file" + e.getMessage());
		}
	}

	public String getStringData(int sheetIndex, int row, int column) {
		return wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();
	}

	public String getStringData(String sheetName, int row, int column) {
		return wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
	}

	public double getNumericData(String sheetName, int row, int column) {
		return wb.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();
	}

}
