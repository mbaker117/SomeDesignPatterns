package com.erabia.design_pattern.behavioral.command.command.impl;

import com.erabia.design_pattern.behavioral.command.command.FileCommand;
import com.erabia.design_pattern.behavioral.command.reciver.FileReciver;

public class CloseFileCommandImpl implements FileCommand {
	private FileReciver fileReciver;
	
	public CloseFileCommandImpl(FileReciver fileReciver) {
		this.fileReciver = fileReciver;
	}

	@Override
	public void execute() {
		fileReciver.closeFile();

	}

}
