import java.io.File;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
class RegExpDemo10 
{
	public static void main(String[] args) 
	{
		int count = 0;

		File f = new File("C:\\Users\\Vikash\\Desktop\\Java programs\\Regular Expression");
		Pattern p = Pattern.compile("[a-zA-z0-9][a-zA-Z0-9_$.]*[.]java");

		String[] s = f.list();
		
		for(String s1:s)
		{
			Matcher m =p.matcher(s1);
			if(m.find() && m.group().equals(s1))//I t might be possible that there is '.bak' file is generated, so we are  checking that only .java is matched not ".java.bak"
			{
				++count;
			  System.out.println(s1);
			}
		
		}

		System.out.println("total java files present in folder = "+count );
	}
}
