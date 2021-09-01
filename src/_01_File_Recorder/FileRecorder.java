package _01_File_Recorder;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileRecorder {
	// Create a program that takes a message from the user and saves it to a file.
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Please input what you want to save.");
		try {
			FileWriter fw = new FileWriter("src/_01_File_Recorder/message.txt", false);
			fw.write(input + "");		

			fw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
//Copyright © 2021 Sean Yoo//Copyright © 2021 Sean Yoo//Copyright © 2021 Sean Yoo//Copyright © 2021 Sean Yoo