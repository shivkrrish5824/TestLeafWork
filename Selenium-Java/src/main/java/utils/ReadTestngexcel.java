package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;




public class ReadTestngexcel {

	public Object[][] main(String excelFileName) throws IOException{
		XSSFWorkbook wbook = new XSSFWorkbook(excelFileName);
		XSSFSheet sheets = wbook.getSheetAt(0);
		int lastRowNum = sheets.getLastRowNum();
		System.out.println(lastRowNum);
		int physicalNumberOfRows = sheets.getPhysicalNumberOfRows();
		System.out.println(physicalNumberOfRows);
		int lastCellNum = sheets.getRow(0).getLastCellNum();
		System.out.println(lastCellNum);
		Object[][] data = new Object[lastRowNum][lastCellNum];
		for (int i = 1; i <=lastRowNum; i++) {
			XSSFRow row = sheets.getRow(i);
			for (int j = 0; j <lastCellNum; j++) {
				
				XSSFCell cell = row.getCell(j);
				data[i-1][j]= cell.getStringCellValue();
				System.out.println(data[i-1][j]);
				
				
			}
			
		}
		wbook.close();
		return data;
	}
		
	}


