package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class serialization {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("serialization.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Employee emp1 = new Employee(111, "Naji", 10000, "Strajku");
		System.out.println("Before Serialization");
		emp1.getEmpDetails();
		oos.writeObject(emp1);

		System.out.println();

		FileInputStream fis = new FileInputStream("serialization.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee emp2 = (Employee) ois.readObject();
		System.out.println("After Serialization");
		emp2.getEmpDetails();

		FileOutputStream fos2 = new FileOutputStream("transient.txt");
		ObjectOutputStream oos2 = new ObjectOutputStream(fos2);
		User u = new User();
		oos2.writeObject(u);

		oos.close();
		ois.close();
		oos2.close();

	}

}
