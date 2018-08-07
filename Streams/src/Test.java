import java.io.File;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws InterruptedException,

			IOException {

		File source = new File("D:/VSCodeSetup-x64-1.19.3.exe");

		File dest = new File("D:/newbckup.jpeg");

		long start = System.currentTimeMillis();

		UltimateFastFileCopyDemo.copyFileUsingFileChannels(source, dest);

		long end = System.currentTimeMillis();

		System.out.println("Time taken by FileChannels Copy = " + (end - start));

	}
}