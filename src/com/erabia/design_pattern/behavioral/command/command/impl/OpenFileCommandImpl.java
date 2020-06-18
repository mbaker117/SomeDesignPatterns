package com.erabia.design_pattern.behavioral.command.command.impl;

import com.erabia.design_pattern.behavioral.command.command.FileCommand;
import com.erabia.design_pattern.behavioral.command.reciver.FileReciver;

public class OpenFileCommandImpl implements FileCommand {
	private FileReciver fileReciver;
	
	
	
	public OpenFileCommandImpl(FileReciver fileReciver) {
		this.fileReciver = fileReciver;
	}



	@Override
	public void execute() {
		fileReciver.openFile();

	}

}
