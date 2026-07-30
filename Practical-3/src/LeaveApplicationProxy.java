class LeaveApplicationProxy implements LeaveApplication
{
    private String username;
    private String password;
    private RealLeaveApplication real;

    LeaveApplicationProxy(String username,String password)
    {
        this.username=username;
        this.password=password;
    }

    public void submitLeave()
    {
        if(username.equals("admin") && password.equals("1234"))
        {
            real=new RealLeaveApplication();
            real.submitLeave();
        }
        else
        {
            System.out.println("Invalid Login");
        }
    }
}