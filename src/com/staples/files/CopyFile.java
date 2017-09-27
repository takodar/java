package com.staples.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class CopyFile {

	public static void main(String[] args) {
		try {
			File f1 = new File("gsc.txt");
			File f2 = new File("target.txt");

			FileUtils.copyFile(f1, f2);
			
//   RAW FILE COPY WITH INPUT STREAM			
//			InputStream in = new FileInputStream(f1);
//			OutputStream out = new FileOutputStream(f2);
//			
//			byte[] buf = new byte[1024];
//			int len;
//			while ((len = in.read(buf)) > 0) {
//				out.write(buf, 0, len);
//			}
//			in.close();
//			out.close();
			
			System.out.println("file copied!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
