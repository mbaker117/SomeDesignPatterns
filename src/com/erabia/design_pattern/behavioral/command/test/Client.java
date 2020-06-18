package com.erabia.design_pattern.behavioral.command.test;

import com.erabia.design_pattern.behavioral.command.command.impl.OpenFileCommandImpl;
import com.erabia.design_pattern.behavioral.command.invoker.FileInvoker;
import com.erabia.design_pattern.behavioral.command.invoker.impl.FileInvokerImpl;
import com.erabia.design_pattern.behavioral.command.reciver.FileReciver;
import com.erabia.design_pattern.behavioral.command.util.FileReciverUtil;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReciver fs = FileReciverUtil.getFileReciver();
		OpenFileCommandImpl op = new OpenFileCommandImpl(fs);
		FileInvoker inv = new FileInvokerImpl(op);
		inv.execute();
	}

}
