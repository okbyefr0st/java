import java.io.File;
import java.sql.Date;

public class FileDemo {
	public static void main(String[] args) {
		String path = "d:/song.txt";
		File f = new File(path);

		if (f.exists()) {
			System.out.println(f.getPath());
			System.out.println(f.getName());
			System.out.println(f.getParent());

			if (f.isFile()) {
				System.out.println(f.canRead());
				System.out.println(f.canWrite());
				System.out.println(new Date(f.lastModified()));
				System.out.println(f.length());
			} else {
				String[] content = f.list();
				System.out.println("Content of directory");
				for (String file : content)

					System.out.println(file);

			}
		} else {
			System.out.println("Output file does not exist");
		}
	}
}
