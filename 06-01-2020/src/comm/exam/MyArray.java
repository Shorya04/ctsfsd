package comm.exam;

public class MyArray {
	private char[] s=new char[26];
	public char[] createArray()
	{
		for(int i=0;i<s.length;i++)
		{
			s[i]=(char)('A'+i);
		}
		return s;
	}
	public void displayArray()
	{
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
	}
	
	public void convertToArray()
	{
	
	}


}
