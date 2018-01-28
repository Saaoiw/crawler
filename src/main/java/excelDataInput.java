import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import util.ApplicationUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static util.ApplicationConstants.INPUTPATH;


/**
 * Created by KrevSaa on 24.01.2018.
 */
public class excelDataInput {

    public excelDataInput() {
    }

    private String squInput;

    public String getSquInput(int column, int row ) throws IOException {
        return readExcel(column,row );
    }

    public void setSquInput(String squInput) {
        this.squInput = squInput;
    }



    Properties properties = ApplicationUtils.readAppConfig();
    String inputPath = properties.getProperty(INPUTPATH);


    private File inputPositions = new File(inputPath);

    private String readExcel(int column, int row ) throws IOException {
        //Read file
        FileInputStream inputStream = new FileInputStream(inputPositions);

        //Get the workbook for the file
        HSSFWorkbook workbook = new HSSFWorkbook(inputStream);

        //Get the first sheet from the workbook
        HSSFSheet sheet = workbook.getSheetAt(0);

        HSSFCell cell = sheet.getRow(row).getCell(column);

        inputStream.close();

        return this.squInput = cell.getStringCellValue();
    }


}
