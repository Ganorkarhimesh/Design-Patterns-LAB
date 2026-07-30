abstract class LeaveHandler
{
    LeaveHandler next;

    void setNext(LeaveHandler next)
    {
        this.next = next;
    }

    abstract void approveLeave(int days);
}
