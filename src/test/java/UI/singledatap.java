package UI;

import org.testng.annotations.Test;

public class singledatap {
	
	@Test(dataProviderClass = verifydatap.class, dataProvider="details")
	public void show(String name, String place) {
		System.out.println("My name is : " + name  + " and I'm from " + place );
		
	}
	
	@Test(dataProviderClass=masterdata.class, dataProvider="quick")
	public void test1(String place) {
		System.out.println(place);
	}
	
	
	@Test(dataProviderClass=masterdata.class, dataProvider="quick")
	public void test2(String color, String car) {
		System.out.println(color + "  " +  car);
	}
	
	@Test(dataProviderClass=masterdata.class, dataProvider="quick")
	public void test3(int a, int b, int c) {
		System.out.println(a + " " + b + " " + c);
	}
}
