package com.study.io_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO_Try_Test1 {
	
		public static void main(String[] args) throws IOException {
			demo1();
			demo2();
	
		}
		//流的标准处理异常代码1.7版本
		//在try()中创建的流对象必须实现了AutoCloseable这个接口,如果实现了,
		//在try后面的{}(读写代码)执行后就会自动调用,流对象的close方法将流关掉 
		private static void demo2() throws IOException, FileNotFoundException {
			try( FileInputStream fis = new FileInputStream("111.jpg");
				 FileOutputStream fos = new FileOutputStream("copy.jpg");	
				){
				int i;
				while ((i = fis.read()) != -1) {
					fos.write(i);
				}
			}
		}
		//流的标准处理异常代码1.6版本及其以前
		private static void demo1() throws FileNotFoundException, IOException {
			FileInputStream fis = null;
			FileOutputStream fos = null;
			
			try {
				fis = new FileInputStream("111.jpg");
				fos = new FileOutputStream("copy.jpg");
				byte[] arr = new byte[1024];
				int len;
				while ((len = fis.read()) != -1) {
					fos.write(arr,0,len);
				}
			} finally {
				try {
					if (fis != null) {
						fis.close();
					}
				} finally {
					if (fos != null) {
						fos.close();
					}
				}
				
			}
		}

}
