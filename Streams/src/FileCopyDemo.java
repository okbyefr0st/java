import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream istream = new FileInputStream("D:/VSCodeSetup-x64-1.19.3");
		FileOutputStream ostream = new FileOutputStream("D:/Bckup");
		long startTime = System.currentTimeMillis();
		int ch = 0;
		while (true) {
			ch = istream.read();
			if (ch == -1)
				break;
			ostream.write(ch);

		}
		System.out.println((System.currentTimeMillis() - startTime));
		ostream.close();
		istream.close();
	}
}
