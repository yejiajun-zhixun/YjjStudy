package study;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

public class BaiDuSelect {
	private WebDriver driver=null;
	private Browsers browser=null;

	@BeforeTest
	public void beforetest(){
		 //ֱ�ӵ���browsersType ���������
		browser=new Browsers(BrowsersType.ie);
		driver=browser.driver;
		System.out.println("���Կ�ʼ");
	}
	
	@Test
	public void baiduyesy() throws InterruptedException{
		String url = "http://www.baidu.com";
		driver.get(url);
		//driver.navigate().to(url); // ��ָ������վ
		String title=driver.getTitle();
		System.out.println(title);
		
        try {
            /**
             * WebDriver�Դ���һ�����ܵȴ��ķ����� dr.manage().timeouts().implicitlyWait(arg0, arg1����
             * Arg0���ȴ���ʱ�䳤�ȣ�int ���� �� Arg1���ȴ�ʱ��ĵ�λ TimeUnit.SECONDS һ��������Ϊ��λ��
             */
            driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        String win = driver.getWindowHandle();  
        WebElement login = driver.findElement(By.id("kw"));
        String logintext=login.getText();
        if(logintext!= null){
        	System.out.println(logintext);
        }
        driver.findElement(By.id("kw")).sendKeys(new String[] { "hello" });
        
        driver.findElement(By.id("su"));
		String title2=driver.getCurrentUrl();
		System.out.println(title2);
		WebElement contents=driver.findElement(By.xpath("//div[@id='content_left']"));
		if(contents!=null){
			System.out.println("�����ɹ�");
		}
		driver.findElement(By.xpath("//div[@id='page']/a[2]")).click();
		String title3=driver.getCurrentUrl();
		System.out.println(title3);
		
		//��������е������
		WebElement setting=driver.findElement(By.xpath("//div[@id='u1']/a[@name='tj_settingicon']"));
		setting.click();
		
	}

	@AfterTest
	public void afteretest(){
		driver.quit();
		System.out.println("���Թر�");
	}

}
