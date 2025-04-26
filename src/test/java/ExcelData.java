import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelData {

    @BeforeTest
    @DataProvider @Deprecated
    public Object[][] getData() throws IOException {
        DataFormatter formatter=new DataFormatter();
        FileInputStream fis=new FileInputStream("C:\\Users\\HP\\Documents\\AutomationPractice.xlsx");
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        Sheet s=wb.getSheet("Data");
        int rowCount= s.getPhysicalNumberOfRows();
        Row row=s.getRow(0);
        int colCount=row.getLastCellNum();
        Object[][] data=new Object[rowCount][colCount];
        for(int i=0;i<rowCount-2;i++)
        {
           row= s.getRow(i+1);
            for(int j=0;j<colCount;j++)
            {
               Cell Cell=row.getCell(j);
                data[i][j]=formatter.formatCellValue(Cell);
                System.out.println(data[i][j]);
                         }

        }
       return data;
    }
    @Test
    public void gmailSignIn(String userName,String pwd)
    {
        ChromeDriver driver=new ChromeDriver();
        driver.get("http://google.com");
        System.out.println(driver.getTitle());
        driver.get("http://gmail.com");
        System.out.println(driver.getTitle());
        driver.findElement(By.linkText("Sign in")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys(userName);
        driver.findElement(By.xpath("//span[text()='Next']")).click();

    }

}
