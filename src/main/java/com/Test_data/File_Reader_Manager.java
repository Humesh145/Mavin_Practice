package com.Test_data;

public class File_Reader_Manager {
	
	private File_Reader_Manager() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public static File_Reader_Manager getInstance_frm() {
		
		File_Reader_Manager frm = new File_Reader_Manager();
		
		return frm;
		

	}
	
	
	
public Configuration_Reader getInstance_CR() throws Throwable {


	Configuration_Reader cr = new Configuration_Reader();
	
	return cr;

}

}
