package com.erabia.design_pattern.behavioral.command.reciver.impl;

import com.erabia.design_pattern.behavioral.command.reciver.FileReciver;

public class WindowsFileRecvierImpl implements FileReciver {

	@Override
	public void openFile() {
		System.out.println("Windows File Opened");

	}

	@Override
	public void closeFile() {
		System.out.println("Windows File Closed");

	}

}
