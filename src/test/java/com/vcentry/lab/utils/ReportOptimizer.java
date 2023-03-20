package com.vcentry.lab.utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;

public class ReportOptimizer {

	public static void optimizeReport() throws IOException{
		
		File src = new File ("D:/Program Files/workspace/workspace/H2_DDDTest/screenshot");
		Date date = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
		String name = sf.format(date);
		File dst = new File("D:/Program Files/workspace/workspace/H2_DDDTest/oldFiles/"+name);
		
		FileUtils.copyDirectory(src, dst);
		FileUtils.cleanDirectory(src);
	}
}
