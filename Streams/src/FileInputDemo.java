import java.io.FileInputStream;

public class FileInputDemo {
	public static void main(String[] args) throws Exception {
		int ch = 0;
		String file = "D:/song.txt";
		FileInputStream istream = new FileInputStream(file);
		// array of the size of available byte in stream
		byte[] bar = new byte[istream.available()];
		istream.read(bar); // reading stream data into file array
		String content = new String(bar); //converting byte array to string
		System.out.println(content);
		// while (true)
		//
		// {
		// ch = istream.read(); //reading a byte from a string
		// if (ch == -1)
		// break;//EOF break the loop
		// System.out.print((char)ch); // printing character
		// }
		istream.close();
	}
}
