package com.study.io_stream.digui;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Digui_Case3 {
//	需求:3,从键盘接收两个文件夹路径,把其中一个文件夹中(包含内容)拷贝到另一个文件夹中
	/*分析：
	 *    1 调用文件遍历方法getFile
	 *      判断两次输入路劲是否一致
	 *    2 创建copy方法去执行拷贝
	 *      将两个路劲封装成file对象，创建新文件夹
	 *      遍历数组拿到所以源文件和文件夹
	 *      判断是否是文件，并进行读写或递归
	 *      */
	public static void main(String[] args) throws IOException {
		File src = Digui_Case1.getFile();
		File aaa = Digui_Case1.getFile();
		if (src.equals(aaa)) {
			System.out.println("文件夹路劲相同，请重写输入");
		}else {
			copy(src,aaa);
		}

	}

	private static void copy(File src, File aaa) throws IOException {
//		1,在目标文件夹中创建原文件夹
		File file = new File(aaa,src.getName());
		file.mkdir();//相当于在copy文件夹下创建了一个src文件夹
//		2,获取原文件夹中所有的文件和文件夹,存储在File数组中
		File[] arr = src.listFiles();
//		3,遍历数组
		for (File file2 : arr) {
//			4,如果是文件就用io流读写
			if (file2.isFile()) {
				//file2是获取了arr数组中所有的文件和文件夹，所有io读写要从file2中读，写到file中
				BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file2));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File(file,file2.getName())));
				int i;
				byte[] b = new byte[1024*1];
				while ((i = bis.read(b)) != -1) {
					bos.write(i);
				}
				bis.close();
				bos.close();
//				5,如果是文件夹就递归调用
			} else {
               copy(file2,file);
			}
		}
	}

}
