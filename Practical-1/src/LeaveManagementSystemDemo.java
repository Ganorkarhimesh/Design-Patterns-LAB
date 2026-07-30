public class LeaveManagementSystemDemo
{
    public static void main(String[] args)
    {
        LeaveManagementSystem s1=LeaveManagementSystem.getInstance();
        LeaveManagementSystem s2=LeaveManagementSystem.getInstance();

        if(s1==s2)
        {
            System.out.println("Only One Instance Created");
        }

        LeaveHandler faculty=new Faculty();
        LeaveHandler hod=new HOD();
        LeaveHandler principal=new Principal();

        faculty.setNext(hod);
        hod.setNext(principal);

        faculty.approveLeave(1);
        faculty.approveLeave(5);
        faculty.approveLeave(10);
    }
}