package JavaPractice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.ss.format.CellFormatType;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		FileInputStream fis = new FileInputStream("C:\\Users\\innoppl\\Desktop\\Readexcel.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Sheet1");
		sh.createRow(0).createCell(0).setCellValue("vivek");
		
		/*int rc = sh.getLastRowNum();
		int col = sh.getRow(rc).getLastCellNum();
		
		for(int i =0 ;i<=rc;i++)
		{
			for(int j=0;j<col;j++)
			{
				CellType type = sh.getRow(i).getCell(j).getCellTypeEnum();
				
				if(type == CellType.NUMERIC)
				{
					System.out.println(sh.getRow(i).getCell(j).getNumericCellValue());
				}
				
				if(type == CellType.STRING)
				{
					System.out.println(sh.getRow(i).getCell(j).getStringCellValue());
				}
				
				
			}
		}*/
		
		FileOutputStream fout = new FileOutputStream("C:\\Users\\innoppl\\Desktop\\Readexcel.xlsx");
		
		wb.write(fout);
		
		fout.close();
		
	}

}
