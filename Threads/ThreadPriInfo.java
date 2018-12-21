/**Java Program to display preliminary info. about the thread such as threads which are by default running,whose execution status,execution state name,ThreadGroup info,Default name
of the programmer defined Thread,whose execution status,state name,ThreadGroup Information and value of Thread Priority Modifiers   */
import static java.lang.System.out;
class ThreadPriInfo 
{
	public static void main(String[] args) 
	{
		out.println("----------------------------");
		out.println("Default Thread Info");
		out.println("----------------------------");

		Thread td =Thread.currentThread();
		out.println("Default Thread = "+td);//[main,5,main]

		td.setName("Sathya");
		out.println("Default thread new name = "+td);//[Sathya,5,main]

		boolean b = td.isAlive();
		out.println("Excecution status of td thread = "+b);//true

		Thread.State ts = td.getState();
		out.println("Execution State of the Thread = "+ts);//RUNNABLE

		ThreadGroup tg =td.getThreadGroup();
		out.println("ThreadGroup of td = "+tg);//java.lang.ThreadGroup[name=main,maxpri=10]
		
		ThreadGroup ptg = tg.getParent();
		out.println("Parent of ThreadGroup of td = "+ptg);//java.lang.ThreadGroup[name=system,maxpri=10]
        
		ThreadGroup pptg = ptg.getParent();
		out.println("Parent of parent of ThreadGroup of td = "+pptg);//null

		out.println("----------------------------");
		out.println("Programmer Defined Thread Info");
		out.println("----------------------------");
		
		Thread t1 = new Thread();
		String tname = t1.getName();
        out.println("Deafult Thread-Name of Programmer Created Fore Ground Thread = "+tname);//Thread[0]

		boolean b1 = t1.isAlive();
		out.println(" Execution status of thread t1 = "+b1);//false

		Thread.State ts1 = t1.getState();
		out.println("Execution State of the Thread = "+ts1);//New

		ThreadGroup tg1 = t1.getThreadGroup();
		out.println("ThreadGroup of td = "+tg1);//java.lang.ThreadGroup[name=main,maxpri=10]
		
      ThreadGroup ptg1 =tg1.getParent();
	  out.println("Parent of ThreadGroup of tg1 = "+ptg1);//java.lang.ThreadGroup[name=system,maxpri=10]

	  ThreadGroup pptg1 = ptg1.getParent();
      out.println("Parent of parent of ThreadGroup of tg1 = "+pptg1);//null

	 int maxp = Thread.MAX_PRIORITY;
	 out.println("Val of Max. Priority = "+maxp);//10

	 int minp = Thread.MIN_PRIORITY;
	 out.println("Val of Min. Priority = "+minp);//1

	 int normp = Thread.NORM_PRIORITY;
	 out.println("Val of Normal Priority = "+normp);//5

	}
}
