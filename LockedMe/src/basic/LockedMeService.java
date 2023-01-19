package basic;

import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LockedMeService {
//static File root_dir = new File("C:\\Users\\ChoudharyP7\\workspace\\FileDir\\");
static File root_dir = new File("/home/preetichoudhary/Desktop/Core_Java/Files/");

protected static final String path= root_dir.getAbsolutePath();
String fileName;
	

public LockedMeService(
) {
	
}
	
	public LockedMeService(String fileName) {
	this.fileName = fileName;
}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	void addFile(){
	
    try {
    	
      File myObj = new File(path+"/" +fileName);
      if (myObj.createNewFile()) {
    	 
        System.out.println("File created: " + myObj.getName());
      	} else {
        System.out.println("File already exists.");
      	}
    	} catch (IOException e) {
    		e.printStackTrace();
    }
	}
	
	void deleteFile(){
		
	    File file = new File(path+"/" +fileName);
	    if(file.exists() ){
	      if (file.delete()) { 
	    	  System.out.println("Deleted the file: " + file.getName());
	      	} else {
	    	  System.out.println("Failed to delete the file.");
	      	}
	   	}else {
	   		System.out.println("File doesn't exist");
	}
	}
	void displayFile(){
		 String[] fileLists;
		 File f = new File(path+"/");
		 fileLists = f.list();
		 List<String> fileArrayLists = new ArrayList<String>(Arrays.asList(fileLists));
		 
	      for (String fileList : fileArrayLists) {
	            // Print the names of files and directories
	            System.out.println(fileList);
	        }
	    }
	
}