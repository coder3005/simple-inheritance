/*simple inheritance*/
class student  //super
{
    int roll,marks;
    String name;
    void input()
    {
        System.out.println("Enter roll name & marks: ");
    }
}
class abhi extends student  //sub-class
{
    void disp()
    {
        roll=1; name="abhi"; marks=89;
        System.out.println(roll+" "+name+" "+marks);
    }
    public static void main(String[] args) {
        abhi r=new abhi();
        r.input(); r.disp();
    }
}
