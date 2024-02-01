public class Operations {
    private int TaskID;
    private String TaskTitle;
    private String Description;
    private  boolean Status;


    Operations()
    {
        TaskID = 0;
        TaskTitle = null;
        Description = null;
        Status = false;
    }

    Operations(int taskid, String taskTitle, String description, boolean status)
    {
        this.TaskID = taskid;
        this.TaskTitle = taskTitle;
        this.Description = description;
        this.Status = status;
    }

    public void AddTask()
    {
        System.out.println("Task Successfully Added !");
    }

    public void ViewTasks()
    {
        System.out.println("Task ID : "+ TaskID);
        System.out.println("Task Title : "+ TaskTitle);
        System.out.println("Description : "+ Description);
        if(Status==true)
        {
            System.out.println("Satus : Task Completed.");
        }else{
            System.out.println("Status : Incomplete.");
        }
    }

    public  void MarkAsCompleted()
    {
        Status = true;
        System.out.println("Marked as Complete.");
    }
}
