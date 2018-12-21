import java.io.* ;

class BufferedWriterDemo
{
	public static void main(String[] args) throws IOException
	{
		FileWriter fw = new FileWriter("abc.txt");
		
		BufferedWriter bw  = new BufferedWriter(fw);//always accepts Writer object

		bw.write(100);

		bw.newLine();//will create a new line

        char[] c = {'a','b','c','d'};

		bw.write(c);

		bw.newLine();

		bw.write("Durgasoft solution");

		bw.flush();

		bw.close();//Will automatically close FileWriter also


	}
}
