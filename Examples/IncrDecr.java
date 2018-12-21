/*class X
{
    int m = 1111;
 
    {
        m = m++;//output-----1111
		//m=++m;//output---------1112
 
        System.out.println(m);
    }
}*/

class Y //extends X
{
	int m=1111;
	{
        System.out.println(methodOfY());
    }
 
    int methodOfY()
    {
        
		return m-- + --m ;//--m decrements and then uses the variable & m-- uses its current value and then decrement the variable.
    }
}


 class IncrDecr
 {
    public static void main(String[] args)
    {
        Y y = new Y();
    }
}