import java.io.Serializable;

public class Student implements Serializable {
	private int mat, sci, eng, total;

	public Student() {
	}


	public Student(int mat, int sci, int eng) {
		this.mat = mat;
		this.sci = sci;
		this.eng = eng;
		total = mat + sci + eng;
	
	}

	public void result()
	{
System.out.println("Maths <3 \t"+mat);
System.out.println("Science  \t"+sci);
System.out.println("English  \t"+eng);
System.out.println("Total    \t"+total);
	}
}
