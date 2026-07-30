class CasualLeaveFactory extends LeaveFactory
{
    LeaveRequest createLeave()
    {
        return new CasualLeave();
    }
}