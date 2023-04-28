package UI;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class datapr {

	@Test(dataProvider = "wishes")
	public void ftn(String wish, String greet) {
		System.out.println(wish + " " + greet);
	}
	
	@Test(dataProvider = "animals")
	public void show(String wild, String pet) {
		System.out.println(wild + " " + pet);
	}
	
	@DataProvider(name ="wishes")
	public Object[][]file(){
		Object[][] sample = new Object[2][2];
	sample [0][0] = "hai";
	sample [0][1] = "haii";
	sample [1][0] = "haiii";
	sample [1][1] = "haiiii";
	
	return sample;
	}

	
	@DataProvider(name = "animals")
	public Object[][] lion(){
		return new Object[][] {
			{"lion", "tiger"},
			{"elephant", "dog"},
		};
	}
}