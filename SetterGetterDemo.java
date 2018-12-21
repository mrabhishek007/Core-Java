class SetterGetter {
private int sid;
private String sname;
private int marks;
public void setSid(int sid)
{
    this.sid=sid;
}
public int getSid()
{
    return sid;
}
public void setSname(String sname)
{
    this.sname=sname;
}
public String getSName()
{
    return sname;
}
public void setSmarks(int marks)
{
this.marks=marks;
}
public int getSmarks()
{
    return marks;
}
}//SetterGetter-------------BLC

class SetterGetterDemo
{
    public static void main(String[] args) {
        SetterGetter SG =new SetterGetter();
    SG.setSid(10);
    SG.setSname("Vikash Kumar Gaurav");
    SG.setSmarks(80);
    int x=SG.getSid();
	System.out.println(x);
    }
}    


