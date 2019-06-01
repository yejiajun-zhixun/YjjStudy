package study;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.chrome.*;
import java.io.File;
import java.io.IOException;

public class Browsers {

	public WebDriver driver = null;
	private FirefoxProfile firefoxprofile = null;
	private String projectpath = System.getProperty("user.dir");
	private static DesiredCapabilities caps = null;
	
	@SuppressWarnings("deprecation")
	public Browsers(BrowsersType browserstype) {
		// TODO Auto-generated method stub
		switch(browserstype){
			case firefox:
//				System.setProperty("webdriver.firefox.bin", "C:/Program Files (x86)/Mozilla Firefox/firefox.exe");//firefox��ַ
				System.setProperty("webdriver.gecko.driver",projectpath+"/tools/geckodriver.exe");
				File firebug = new File(projectpath+"/tool/firebug@software.joehewitt.com.xpi");
				File firepath = new File(projectpath+"/tool/FireXPath@pierre.tholence.com.xpi");
				firefoxprofile = new FirefoxProfile();
				firefoxprofile.addExtension(firebug);
				firefoxprofile.addExtension(firepath);
				firefoxprofile.setPreference("webdriver.accept.untrusted.certs", "true");//��֤ͨ���������֤��
				firefoxprofile.setPreference("extensions.firebug.currentVersion","2.0.16");//����firebug�汾��
//					firefoxprofile.setPreference("network.proxy.type",0);//�ɺ���
//					firefoxprofile.setPreference("network.proxy.http","10.1.1.0");//�ɺ���
//					firefoxprofile.setPreference("network.proxy.http_port",3128);//�ɺ���
			//
//				}catch(IOException e){
//					e.printStackTrace();
//				}
//				driver = new FirefoxDriver(firefoxprofile);
				driver = new FirefoxDriver(DesiredCapabilities.firefox());
				driver.manage().window().maximize();
				break;
			case ie:
				System.setProperty("webdriver.ie.driver", projectpath+"/tools/IEDriverServer.exe");
				caps = DesiredCapabilities.internetExplorer();
				caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
				caps.setCapability(InternetExplorerDriver.IE_SWITCHES,"-private");
				caps.setCapability("ignoreZoomSetting", true);
				driver = new InternetExplorerDriver(caps);
				driver.manage().window().maximize();
				break;
			case chrome:
				// ������ chrome û�а�װ��Ĭ��Ŀ¼����ô�����ڳ���������
				System.setProperty("webdriver.chrome.driver", projectpath+"/tools/chromedriver_x64.exe");
//				System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");//����䲻�ɹ� failed
				caps = DesiredCapabilities.chrome();
//				caps.setCapability("chrome.switches",Arrays.asList("--start---maximized"));//��������
//				caps.setCapability("chrome.switches",Arrays.asList("--proxy-server=http://your-proxy-admin:4443"));//����
				driver = new ChromeDriver(caps);
				driver.manage().window().maximize();
				break;
			default :
				System.out.println("��ѡ��google��ie��chrome");
		}
	}

}