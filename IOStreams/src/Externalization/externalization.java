package Externalization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class externalization {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("externalization.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Student std1 = new Student("DSS-125", "Naji", "naji@gmail.com", "+48-517270912");
		std1.getStdDetails();
		oos.writeObject(std1);

		System.out.println();

		FileInputStream fis = new FileInputStream("externalization.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student std2 = (Student) ois.readObject();
		std2.getStdDetails();

	}

}
