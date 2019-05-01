package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV {
	
	//this function will read data from a .csv file and return as a list
	public static List<String[]> read(String file) {
		List<String[]> data = new LinkedList<String[]>();
		String dataRow;
		// try catch function to handle if a file is not found when this is run.
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			// while there is still data to be read do the following
			while ((dataRow = br.readLine()) != null) {
			// splits the record using the commas
			String[] dataRecords = dataRow.split(",");
			data.add(dataRecords);
			}
			// catch handles the exceptions including file not found.
		} catch(FileNotFoundException e) {
			System.out.println("File not found error");
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return data;
	}

}
