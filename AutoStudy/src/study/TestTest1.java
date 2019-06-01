package study;

import java.io.File;
import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TestTest1 {
	private AndroidDriver<AndroidElement> driver;
	private Wait wait;
	
	@Before
	public void setUp() throws Exception{
		wait = new Wait(driver);
		wait.waitFor(1500);
		//set up appium
		File classpathRoot=new File(System.getProperty("user.dir"));
		File appDir=new File(classpathRoot,"/apps");
		File app=new File(appDir,"app-OPPO-release.apk");
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability("deviceName", "Android Emulator");//�����ƶ��豸
		capabilities.setCapability("platformVersion", "4.4");
		//��������Ϊ�������
		capabilities.setCapability("automationName", "huawei-kiw_ul00-XGC4C16520003965");//��Ϊ��ҫ		
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("app", app.getAbsoluteFile());//app��·������Ҫд����·��
		capabilities.setCapability("appPackage", "com.xiaorong.lightning");
		capabilities.setCapability("appActivity", "com.xiaorong.lightning.ui.activity.WelcomeActivity");
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        
        System.out.print("The Test is starts!~~");
		
		//��������ҳ��������������ҳ
		wait.waitFor(8000);
		driver.swipe(1000, 1442, 10, 1442, 1500); //���꣨1000,1442���󻬵���10,1442��������1500
		wait.waitFor(1500);
		driver.swipe(1000, 1442, 10, 1442, 1500);
		wait.waitFor(1500);
		WebElement start=driver.findElement(By.id("com.xiaorong.lightning:id/iv_start"));
		start.click();
		wait.waitFor(1500);
		
		WebElement permissionallow=driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button"));
		permissionallow.click();
		wait.waitFor(2000);
		permissionallow.click();
		wait.waitFor(2000);
		permissionallow.click();
		wait.waitFor(2000);
		permissionallow.click();
		wait.waitFor(2000);
		permissionallow.click();
		wait.waitFor(2000);
        System.out.print("��ʼ�� �ɹ�!~~");
        
		///��½
		WebElement jieqian =driver.findElement(By.id("com.xiaorong.lightning:id/ly_jieqian"));
		jieqian.click();
		wait.waitFor(1500);
		WebElement etname=driver.findElement(By.id("com.xiaorong.lightning:id/et_name"));
//		etname.sendKeys("15990027607");
		etname.click();
		driver.sendKeyEvent(8);//1
		driver.sendKeyEvent(12);//5
		driver.sendKeyEvent(16);//9
		driver.sendKeyEvent(16);//9
		driver.sendKeyEvent(7);//0
		driver.sendKeyEvent(7);//0
		driver.sendKeyEvent(9);//2
		driver.sendKeyEvent(14);//7
		driver.sendKeyEvent(13);//6
		driver.sendKeyEvent(7);//0
		driver.sendKeyEvent(14);//7
		wait.waitFor(1500);
		driver.sendKeyEvent(66);//�س���
		wait.waitFor(1500);
		WebElement etpsd=driver.findElement(By.id("com.xiaorong.lightning:id/et_psd"));
//		etpsd.sendKeys("123456");
		etpsd.click();
		driver.sendKeyEvent(8);//1
		driver.sendKeyEvent(9);//2
		driver.sendKeyEvent(10);//3
		driver.sendKeyEvent(11);//4
		driver.sendKeyEvent(12);//5
		driver.sendKeyEvent(13);//6
		wait.waitFor(1500);
		driver.sendKeyEvent(4);//���ؼ�
		wait.waitFor(1500);
		WebElement tvlogin=driver.findElement(By.id("com.xiaorong.lightning:id/tv_login"));
		tvlogin.click();
		wait.waitFor(1500);
		
		System.out.print("login ��½ ���Գɹ�");
	}
	
	@After
	public void tearDown() throws Exception{
        System.out.print("The Test is finish!~~");
		System.out.println("");
		driver.quit();
	}
	
	@Test
	public void leftMenu(){
		//���˵������������ģ��ҵĽ��ҵ��Ż݄���������ѣ�������
		WebElement btleft=driver.findElement(By.id("com.xiaorong.lightning:id/bt_left"));
		btleft.click();
		WebElement ivcenter=driver.findElement(By.id("com.xiaorong.lightning:id/iv_center"));
		ivcenter.click();
		wait.waitFor(2000);
		WebElement left=driver.findElement(By.id("com.xiaorong.lightning:id/left_image"));
		left.click();
		wait.waitFor(2000);
		WebElement myjiekuan=driver.findElement(By.name("�ҵĽ��"));
		myjiekuan.click();
		wait.waitFor(2000);
		left.click();
		wait.waitFor(2000);
		WebElement mydiscount=driver.findElement(By.name("�ҵ��Ż�ȯ"));
		mydiscount.click();
		wait.waitFor(2000);
		left.click();
		wait.waitFor(2000);
		WebElement Invitingfriends=driver.findElement(By.name("�������"));
		Invitingfriends.click();
		wait.waitFor(2000);
		left.click();
		wait.waitFor(2000);
		WebElement blacklist=driver.findElement(By.name("������"));
		blacklist.click();
		wait.waitFor(2000);
		left.click();
		wait.waitFor(2000);
		System.out.print("leftMenu ���˵� ���Գɹ�");
	}
	
	@Test
	public void left_helpFaceback(){
		//
		WebElement btleft=driver.findElement(By.id("com.xiaorong.lightning:id/bt_left"));
		btleft.click();
		wait.waitFor(1500);
		WebElement lyhelp=driver.findElement(By.id("com.xiaorong.lightning:id/ly_help"));
		lyhelp.click();
		wait.waitFor(1500);
		WebElement tabshenqing=driver.findElement(By.id("com.xiaorong.lightning:id/id_tab_shenqing_ll"));
		tabshenqing.click();
		wait.waitFor(1500);
		WebElement tabyuqi=driver.findElement(By.id("com.xiaorong.lightning:id/id_tab_yuqi_ll"));
		tabyuqi.click();
		wait.waitFor(1500);
		WebElement tabys=driver.findElement(By.id("com.xiaorong.lightning:id/id_tab_ys_ll"));
		tabys.click();
		wait.waitFor(1500);
		WebElement tabbase=driver.findElement(By.id("com.xiaorong.lightning:id/id_tab_base_ll"));
		tabbase.click();
		wait.waitFor(1500);
		//����ҳ�棬���뷴�����ݣ�ѡ��ͼƬ������ύ
		WebElement btnfk=driver.findElement(By.id("com.xiaorong.lightning:id/btn_fk"));
		btnfk.click();
		wait.waitFor(1500);
		WebElement tvfk=driver.findElement(By.id("com.xiaorong.lightning:id/tv_fk"));
		tvfk.click();
		wait.waitFor(1500);
		WebElement etfk=driver.findElement(By.id("com.xiaorong.lightning:id/et_fk"));
		etfk.sendKeys("Ҷ�ѿ��ύ��������");;
		wait.waitFor(1500);
//		WebElement iv1=driver.findElement(By.id("com.xiaorong.lightning:id/iv_1"));
//		iv1.click();
//		WebElement listitemcontent=driver.findElement(By.id("com.android.gallery3d:id/list_item_content"));
//		listitemcontent.click();
//		wait.waitFor(1500);
//		wait.waitFor(1500);
		WebElement tvfk1=driver.findElement(By.name("�ύ����"));
		tvfk1.click();
		wait.waitFor(1500);
		System.out.print("lefthelpFcaeback �������� ���Գɹ�");
	}
	
	@Test
	public void left_SetUp(){
		//���˵�������
		WebElement btleft=driver.findElement(By.id("com.xiaorong.lightning:id/bt_left"));
		btleft.click();
		wait.waitFor(1500);
		WebElement lysetting=driver.findElement(By.id("com.xiaorong.lightning:id/ly_setting"));
		lysetting.click();
		wait.waitFor(1500);
		WebElement left=driver.findElement(By.id("com.xiaorong.lightning:id/left_image"));
		left.click();
		System.out.print("leftSetUp ���� ���Գɹ�");
	}
	
	@Test
	public void news(){
		//֪ͨ
		WebElement btright=driver.findElement(By.id("com.xiaorong.lightning:id/bt_right"));
		btright.click();
		wait.waitFor(1500);
		WebElement newtextview2=driver.findElement(By.name("����"));
		newtextview2.click();
		wait.waitFor(1500);
		WebElement righttext=driver.findElement(By.id("com.xiaorong.lightning:id/right_text"));
		righttext.click();
		wait.waitFor(1500);
		WebElement newtextview3=driver.findElement(By.name("�"));
		newtextview3.click();
		wait.waitFor(1500);
		WebElement newtextview1=driver.findElement(By.name("֪ͨ"));
		newtextview1.click();
		wait.waitFor(1500);
		righttext.click();
		wait.waitFor(1500);
		WebElement left=driver.findElement(By.id("com.xiaorong.lightning:id/left_image"));
		left.click();
		System.out.print("news ͨ�� ���Գɹ�");
	}
	
	@Test
	public void advancedCertification(){
		//����ת��������֤
		WebElement mytie=driver.findElement(By.name("���"));
		mytie.click();
		wait.waitFor(2000);
		WebElement btleft=driver.findElement(By.id("com.xiaorong.lightning:id/bt_left"));
		btleft.click();
		System.out.print("advancedCertification�����Գɹ�");
	}
	
}

