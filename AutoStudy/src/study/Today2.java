package study;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Today2 {

		private static AndroidDriver<MobileElement> driver;
		public static void main(String[] args) throws InterruptedException, MalformedURLException{
			File classpathRoot =new File(System.getProperty("user.dir"));
			//·��System.getProperty("user.dir")=E:\eclipse2017\shandaixia\��
			File appDir = new File(classpathRoot,"apps/ContactManager");
			File app = new File(appDir,"app-PP-release.apk");
			//�ж�apk
			if (!app.exists()){
				System.out.println("������Ҫ��װ��APK�������ڣ�");
			}
			//������������
			DesiredCapabilities capabilities =new DesiredCapabilities();
			//������������ͣ����Ϊ�գ���ȡ��Appium���趨�������
			capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
			//����Ӳ��ʹ��֧����������
			capabilities.setCapability("unicodeKeyboard", "True");
			capabilities.setCapability("resetKeyboard", "true");
			//���ò���ƽ̨
			capabilities.setCapability("platformName", "Android");
			//�����豸����
			capabilities.setCapability("deviceName", "Android Emulator");
			//����Android �汾
			capabilities.setCapability("platformVersion", "7.0.0");
			//����Android �汾
//			capabilities.setCapability("udid", "10.60.20.50:8080");
			//��ȡ����·��
			capabilities.setCapability("app", app.getAbsolutePath());
			//������������
			capabilities.setCapability("app-package", "com.xiaorong.lightning");
			//����������Activity
			capabilities.setCapability("app-activity", "com.xiaorong.lightning.ui.activity.WelcomeActivity");
			//��ʼ��
			driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);  
			//������ʽ�ȴ���ʱʱ��
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			System.out.println("22222");
			
			int width= driver.manage().window().getSize().width;
			int height=driver.manage().window().getSize().height;
			driver.swipe(width*4/5, height/2, width/5, height/2, 1000);
			Thread.sleep(10000);
			driver.swipe(width*4/5, height/2, width/5, height/2, 1000);
			Thread.sleep(10000);
			driver.swipe(width*4/5, height/2, width/5, height/2, 1000);
			Thread.sleep(10000);
			driver.swipe(width*4/5, height/2, width/5, height/2, 1000);
			driver.findElement(By.name("��������")).click();
			Thread.sleep(10000);
			
			driver.quit();
		}
		

}
