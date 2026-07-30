public class FactoryMethod
{
    public static void main(String args[])
    {
        LeaveFactory f1=new CasualLeaveFactory();
        LeaveRequest l1=f1.createLeave();
        l1.apply();

        LeaveFactory f2=new MedicalLeaveFactory();
        LeaveRequest l2=f2.createLeave();
        l2.apply();

        LeaveFactory f3=new OnDutyLeaveFactory();
        LeaveRequest l3=f3.createLeave();
        l3.apply();

        LeaveApplication p1=new LeaveApplicationProxy("admin","1234");
        p1.submitLeave();

        LeaveApplication p2=new LeaveApplicationProxy("user","1111");
        p2.submitLeave();
    }
}