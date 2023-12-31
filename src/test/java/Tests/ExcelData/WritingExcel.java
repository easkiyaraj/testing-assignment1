package Tests.ExcelData;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingExcel {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Emp info");

        Object empdata[][] = { {"empid","Name","Job"},
                               {101,"Easki","IT"},
                               {102,"vicky","IT"},
                               {103,"deepan","IT"}
        };
        int rows = empdata.length;
        int cols = empdata[0].length;

        System.out.println(rows);
        System.out.println(cols);

        for (int r=0;r<rows;r++){
            XSSFRow row = sheet.createRow(r);
            for (int c=0;c<cols;c++)
            {
                XSSFCell cell = row.createCell(c);
                Object value = empdata[r][c];

                if(value instanceof String)
                    cell.setCellValue((String)value);
                if(value instanceof Integer)
                    cell.setCellValue((Integer)value);
                if(value instanceof Boolean)
                    cell.setCellValue((Boolean)value);
            }
        }
        String filePath = ".\\data\\employee.xlsx";
        FileOutputStream outstream = new FileOutputStream(filePath);
        workbook.write(outstream);
        outstream.close();
    }
}
