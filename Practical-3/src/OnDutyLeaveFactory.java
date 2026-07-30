class OnDutyLeaveFactory extends LeaveFactory
{
    LeaveRequest createLeave()
    {
        return new OnDutyLeave();
    }
}