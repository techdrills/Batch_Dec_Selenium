package Test_Cases;

import Utilities.excelUtility;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		excelUtility reader = new excelUtility("F:\\selenium_files\\testData.xlsx");
		int rowCount = reader.getRowCount("login_test_data");
		System.out.println(rowCount);
		
		// to read all the data from excel
		for(int i = 1; i<= rowCount; i++) {
			String uname = reader.getCellData("login_test_data", "userid", i);
			System.out.println(uname);
			
			String pas = reader.getCellData("login_test_data", "password", i);
			System.out.println(pas);
		}
		
	}

}
