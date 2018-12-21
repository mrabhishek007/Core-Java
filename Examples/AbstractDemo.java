abstract class MobileParent 
{
   abstract void getSpecs();

   public void getMsg(){                                    //method defination also possible in abstract unlike interface
	System.out.println("@ Copyright reserved 2018");
   }
}

class IphoneMobile extends MobileParent
{
	void getSpecs()
	{
	  System.out.println("Licenced, Apple Store");	
	}
}

class AndroidMobile extends MobileParent
{
	void getSpecs()
	{
	  System.out.println("Open Source, Google play Store");
	}
}

class Shop
{
	void getMobSpecs(MobileParent mob){
		
		mob.getSpecs();
		mob.getMsg();
	}
}

class AbstractDemo 
{
	public static void main(String[] args) 
	{
		AndroidMobile mob = new AndroidMobile();
		IphoneMobile mob1 = new IphoneMobile();
		Shop shop = new Shop();
		shop.getMobSpecs(mob);
		shop.getMobSpecs(mob1);

	}
}
