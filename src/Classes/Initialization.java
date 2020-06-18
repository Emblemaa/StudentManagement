package Classes;

import Classes.Actors.Student;
import Classes.Class.Class;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Initialization {
    public static ObservableList<Class> classList(URL url) throws Exception
    {
        ObservableList<Class> list = FXCollections.observableArrayList();
        File path = new File(Tools.IDtoURI(url));
        FileInputStream fis = new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        boolean firstLine;
        XSSFSheet sheet;
        ObservableList<Student> studentList = FXCollections.observableArrayList();
        for(int i = 0; i < workbook.getNumberOfSheets(); i++)
        {
            sheet = workbook.getSheetAt(i);
            firstLine = true;
            for (Row row : sheet) {
                if (firstLine)
                {
                    firstLine = false;
                }
                else {

                    studentList.add(new Student(
                            row.getCell(0).toString().substring(0,row.getCell(0).toString().length() - 2),
                            row.getCell(1).getStringCellValue(),
                            row.getCell(2).getStringCellValue(),
                            row.getCell(3).getStringCellValue(),
                            Date.stringToDate(row.getCell(4).toString())
                    ));
                }
            }

            list.add(new Class(sheet.getSheetName(), studentList));
            System.out.println(sheet.getSheetName());
            studentList = FXCollections.observableArrayList();
            System.out.println();
        }
        return list;
    }
}
