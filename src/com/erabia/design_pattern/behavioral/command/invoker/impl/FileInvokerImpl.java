package com.erabia.design_pattern.behavioral.command.invoker.impl;

import com.erabia.design_pattern.behavioral.command.command.FileCommand;
import com.erabia.design_pattern.behavioral.command.invoker.FileInvoker;

public class FileInvokerImpl implements FileInvoker {
	private FileCommand command;
	
	public FileInvokerImpl(FileCommand command) {
		this.command = command;
	}

	@Override
	public void execute() {
		command.execute();
	}

}
