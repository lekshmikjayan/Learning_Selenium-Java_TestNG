package UI;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class masterdata {


	@DataProvider(name = "quick")
	public Object[][]setup(Method m) {
		Object [][] docs = null;

		if(m.getName().equals("test1")) {

			docs = 	new Object[][] {
				{"India"},
				{"Sri Lanka"},
				{"USA"}	
			};
		}

		else if(m.getName().equals("test2")) {
			docs = new Object[][] {
				{"Blue", "Baleno"},
				{"Black", "Scorpio"}
			};
		}
	
		
		else if (m.getName().equals("test3")) {
			docs = new Object[][] {
				{3,4,6},
				{1,7,9},
				{5,6,7}
				};
		}
		
		return docs;

	}
}


