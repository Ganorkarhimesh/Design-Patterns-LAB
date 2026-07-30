class HOD extends LeaveHandler
{
    void approveLeave(int days)
    {
        if(days<=7)
        {
            System.out.println("HOD Approved " + days + " day leave");
        }
        else
        {
            next.approveLeave(days);
        }
    }
}
