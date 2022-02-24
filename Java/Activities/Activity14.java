package activities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Activity14 {

	public static void main(String[] args) throws IOException {
     File file=new File("src/session4/input.txt");
     boolean fStatus = file.createNewFile();
     
     File fileUtil = FileUtils.getFile(file);
     System.out.println("Data in file: " + FileUtils.readFileToString(fileUtil, "UTF8"));
     
     File destDir = new File("resources");
     FileUtils.copyFileToDirectory(file, destDir);
     File newFile = FileUtils.getFile(destDir, "input.txt");
     String newFileData = FileUtils.readFileToString(newFile, "UTF8");
     System.out.println("Data in new file: " + newFileData);
    
	}

}
