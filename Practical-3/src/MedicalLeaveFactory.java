class MedicalLeaveFactory extends LeaveFactory
{
    LeaveRequest createLeave()
    {
        return new MedicalLeave();
    }
}