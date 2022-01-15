package com.first.project;

import com.myproject.MenuOptions;

public class LockedMeMain {
public static void main(String[] args) {
		
		// Create "main" folder if not present in current folder structure
		FileOperations.createMainFolderIfNotPresent("main");
		MenuOptions.printWelcomeScreen("Locker", "A.SASANK REDDY");
		
		HandleOption.handleWelcomeScreenInput();
	}
}
