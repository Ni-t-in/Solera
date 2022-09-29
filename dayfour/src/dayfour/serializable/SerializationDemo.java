package dayfour.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setStudentId(1);
		student.setStudentName("Raja");
		
		System.out.println(student);
		
		File file = new File("C:\\Users\\Nitin.Mankar\\Serialization.txt");
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		FileInputStream fis;
		FileOutputStream fos;
		
		try {
			fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(student);
			oos.close();
			fos.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		Student student1;
		try {
			fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			student1 = (Student) ois.readObject();
			System.out.println("Deserialized -- " + student1);
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
