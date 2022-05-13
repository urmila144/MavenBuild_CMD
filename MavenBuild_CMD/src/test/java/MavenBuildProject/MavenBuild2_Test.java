package MavenBuildProject;

import org.testng.annotations.Test;

public class MavenBuild2_Test {
	
	@Test(groups="smoke")
	
	public void MavenBuild2_Test() {
		
		String URL=System.getProperty("url");
		String UN=System.getProperty("username");
		
		System.out.println("===>"+URL);
		System.out.println("===>"+UN);
		
	}
	
@Test(groups="regression")
public void MavenBuild2_Test1() {
	String URL=System.getProperty("pswd");
	String PWD=System.getProperty("password");
	
	System.out.println("===>"+URL);
	System.out.println("===>"+PWD);
	
	
}
 
}


