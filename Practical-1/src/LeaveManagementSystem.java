class LeaveManagementSystem
{
    private static LeaveManagementSystem instance;

    private LeaveManagementSystem()
    {
    }

    static LeaveManagementSystem getInstance()
    {
        if(instance==null)
        {
            instance=new LeaveManagementSystem();
        }
        return instance;
    }
}