package practices;

import java.io.File;

public class TestFile {

	public static void main(String[] args) {
		File f = new File("D:\\Others\\private\\JavaAll\\practice1\\src\\practices\\1.txt");
		System.out.println("Name of the file - "+f.getName());
		System.out.println("Path of the file - "+f.getPath());
		System.out.println("Length of the file - "+f.length());
		System.out.println("File exists - "+f.exists());
		System.out.println("Is file - "+f.isFile());
		System.out.println("Can be read file - "+f.canRead());
		System.out.println("Can be write file - "+f.canWrite());
		System.out.println("Is it a directory - "+f.isDirectory());
		System.out.println("Is it hidden - "+f.isHidden());
		System.out.println("Last modified - "+f.lastModified());
	}
}
