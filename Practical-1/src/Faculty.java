class Faculty extends LeaveHandler
{
    void approveLeave(int days)
    {
        if(days<=2)
        {
            System.out.println("Faculty Approved " + days + " day leave");
        }
        else
        {
            next.approveLeave(days);
        }
    }
}