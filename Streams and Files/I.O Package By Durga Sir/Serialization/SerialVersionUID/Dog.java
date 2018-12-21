
import java.io.*;

class Dog implements Serializable
{
	private static final long serialVersionUID = 1L; //We are providing our own SerialVersionUID instead of JVM default UID which will be used if any object is added or removed after serialization to avoid InvalidClassException  

	int i=10;
	int j=20;
	int k=36;
	int l=50;
    
}