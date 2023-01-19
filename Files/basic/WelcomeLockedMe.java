package basic;



import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class WelcomeLockedMe {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to LockedMe.com");
		System.out.println("Developer Name:-Preeti Choudhary");
		System.out.println("Please select options given below");
		System.out.println("1- Add");
		System.out.println("2- Delete");
		System.out.println("3- Display");
		System.out.println("4- Exit");
		int option = sc.nextInt();
		
		   
		
		switch (option) {
		  case 1:
			System.out.println("Please Enter the filename");
			new LockedMeService(sc.next()).addFile();
		    break;
		    
		  case 2:
			  System.out.println("Please Enter the filename");
			  new LockedMeService(sc.next()).deleteFile();
			 break;
		    
		  case 3:
			  new LockedMeService().displayFile();
			 break;
			
		  case 4:
		    System.out.println("Exit");
		    break;
		}
	}
		
		    
		    private static List<File> addFile(File fileName,ArrayList<File> fileList) {
		    	fileList.add(fileName);
		    	System.out.println("Existing files are below");
		    	System.out.println(fileName);
		    	return fileList;
			
		    }	
		    private static List<File> deleteFile(File fileName,ArrayList<File> fileList) {
			   	fileList.remove(fileName);
				System.out.println(fileName + " has been deleted");
				return fileList;
				
			    }	
		    private static void displayFile(ArrayList<File> fileList) {
		    	System.out.println("Reading Files");

		    	
		     }	
			
}
 