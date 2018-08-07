import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeStudent {

	public static void main(String[] args) throws Exception {
		Student polo = new Student(37, 39, 41);
		polo.result();
		
		String file="D:/student.txt";
		
		FileOutputStream fstream=new FileOutputStream(file);
		ObjectOutputStream ostream = new ObjectOutputStream(fstream);
		ostream.writeObject(polo);
		ostream.close();
		fstream.close();
		
		
		ObjectInputStream istream = new ObjectInputStream(new FileInputStream(file));
		Object obj = istream.readObject();
		Student student = (Student) obj;
		student.result();
	}

	
}
