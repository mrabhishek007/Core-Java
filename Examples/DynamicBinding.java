class Animal
{
    public String type = "mammal";
     
    public void show()
    {
        System.out.println("The animal is a: " + type);
    }
}
  
class Dog extends Animal
{
    public String type;  //same member variable name as in base class
     
    public Dog(String type)
    {
        this.type = type;
    }
  
    public void show()  //same method signature as in base class
    {
        System.out.println("The dog is a: " + type);
    }
}
  
 class DynamicBinding 
{
    public static void main(String[] args) 
    {
        Animal doggie = new Dog("daschund");
        doggie.show(); // "The dog is a: daschund"  (dynamic binding)
        System.out.println("The type is: " + doggie.type); //"The type is: mammal" (static binding)
	}
}