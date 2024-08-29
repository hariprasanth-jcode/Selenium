package ddtproperties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class A {
public static void main(String[] args) throws IOException {
	String path="D:\\run\\sheela.txt";
//	FileOutputStream fos = new FileOutputStream(path);
//	//fos.wri
//	String s="Hello";
//	byte[] b=s.getBytes();
//	fos.write(b);
//	fos.close();
	
	FileInputStream fis = new FileInputStream(path);
	int res =fis.read();
	while(res!=-1) {
	System.out.println((char)res);
	res=fis.read();
	}

	
}
}


