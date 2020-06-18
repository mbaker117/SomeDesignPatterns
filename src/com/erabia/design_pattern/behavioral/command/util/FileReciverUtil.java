package com.erabia.design_pattern.behavioral.command.util;

import com.erabia.design_pattern.behavioral.command.reciver.FileReciver;
import com.erabia.design_pattern.behavioral.command.reciver.impl.UnixFileReciverImpl;
import com.erabia.design_pattern.behavioral.command.reciver.impl.WindowsFileRecvierImpl;

public class FileReciverUtil {
	public static FileReciver getFileReciver() {
		String os = System.getProperty("os.name");
		System.out.println("Your os is :"+os);
		if(os.equalsIgnoreCase("windows 10"))
			return new WindowsFileRecvierImpl();
		else
			return new UnixFileReciverImpl();
	}

}
