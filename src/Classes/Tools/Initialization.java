package Classes.Tools;

import Classes.Actors.Lecturer;
import Classes.Actors.Staff;
import Classes.Actors.Student;
import Classes.Class.Class;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Initialization {

    public static ObservableList<Class> classList(String path) {

        ObservableList<Class> classList = FXCollections.observableArrayList();
        File file = new File(path);
        try
        {
            FileInputStream fis = new FileInputStream(file);
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            for(int i = 0; i < workbook.getNumberOfSheets(); i++) {
                ObservableList<Student> studentList = FXCollections.observableArrayList();
                XSSFSheet sheet = workbook.getSheetAt(i);
                boolean firstLine = true;

                for (Row row : sheet) {
                    if (firstLine) {
                        firstLine = false;
                    }
                    else {
                        studentList.add(new Student(
                                row.getCell(0).toString().substring(0, row.getCell(0).toString().length() -2),
                                row.getCell(1).getStringCellValue(),
                                row.getCell(2).getStringCellValue(),
                                row.getCell(3).getStringCellValue(),
                                row.getCell(4).getStringCellValue().equals("F"),
                                row.getCell(5).getDateCellValue()
                        ));
                    }
                }
                classList.add(new Class(sheet.getSheetName(), studentList));
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return classList;
    }

    public static ObservableList<Lecturer> lecturerList (String path) {
        ObservableList<Lecturer> lecturerList = FXCollections.observableArrayList();
        File file = new File(path);
        try
        {
            FileInputStream fis = new FileInputStream(file);
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            XSSFSheet sheet = workbook.getSheetAt(1);
            boolean firstLine = true;
            for(Row row : sheet)
            {
                if(firstLine)
                    firstLine = false;
                else
                {
                    lecturerList.add(new Lecturer(
                            row.getCell(0).getStringCellValue(),
                            row.getCell(1).getStringCellValue(),
                            row.getCell(2).getStringCellValue(),
                            row.getCell(3).getStringCellValue(),
                            row.getCell(4).getStringCellValue().equals("F"),
                            row.getCell(5).getDateCellValue(),
                            row.getCell(6).getStringCellValue()
                    ));
                }
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return lecturerList;
    }

    public static ObservableList<Staff> staffList (String path) {
        ObservableList<Staff> staffList = FXCollections.observableArrayList();
        File file = new File(path);
        try
        {
            FileInputStream fis = new FileInputStream(file);
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            XSSFSheet sheet = workbook.getSheetAt(0);
            boolean firstLine = true;
            for(Row row : sheet)
            {
                if(firstLine)
                    firstLine = false;
                else
                {
                    staffList.add(new Staff(
                            row.getCell(0).getStringCellValue(),
                            row.getCell(1).getStringCellValue(),
                            row.getCell(2).getStringCellValue(),
                            row.getCell(3).getStringCellValue(),
                            row.getCell(4).getStringCellValue().equals("F"),
                            row.getCell(5).getDateCellValue()
                    ));
                }
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return staffList;
    }
}
