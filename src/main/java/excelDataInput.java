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

    public String getSquInput() {
        return squInput;
    }

    public void setSquInput(String squInput) {
        this.squInput = squInput;
    }



    private Properties properties = ApplicationUtils.readAppConfig();
    private String inputPath = properties.getProperty(INPUTPATH);

    private File inputPositions = new File(inputPath);

    private String readExcel(String column, String row ) throws IOException {
        //Read file
        FileInputStream inputStream = new FileInputStream(inputPositions);

        //Get the workbook for the file
        HSSFWorkbook workbook = new HSSFWorkbook(inputStream);

        //Get the first sheet from the workbook
        HSSFSheet sheet = workbook.getSheetAt(0);





        return squInput;
    }



}
