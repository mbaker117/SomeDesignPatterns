package com.erabia.design_pattern.behavioral.command.reciver.impl;

import com.erabia.design_pattern.behavioral.command.reciver.FileReciver;

public class UnixFileReciverImpl implements FileReciver {

	@Override
	public void openFile() {
		System.out.println("Unix File Opened");

	}

	@Override
	public void closeFile() {
		System.out.println("Unix File Opened");

	}

}
