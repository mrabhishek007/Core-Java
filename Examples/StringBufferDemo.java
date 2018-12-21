class  StringBufferDemo
{
	public static void main(String[] args) 
	{
		//StringBuffer sb = new StringBuffer("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		StringBuffer sb = new StringBuffer();
		int l =sb.length();
		int cap =sb.capacity();

		System.out.println("Length = "+l);
		System.out.println("Capicity = "+cap);

        sb.ensureCapacity(20);
		System.out.println(sb.capacity());




	}
}
