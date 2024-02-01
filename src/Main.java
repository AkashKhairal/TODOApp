import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option = 0;
        int TaskID = 1;
        ArrayList<Operations> oprList = new ArrayList<Operations>();

        do{
            System.out.println("Welcome to the TODO List Application !");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Remove Task");
            System.out.println("5. Exit");
            System.out.println("Please Enter Your Choice : ");
            Scanner sc = new Scanner(System.in);
            option = sc.nextInt();
            sc.nextLine();


            switch (option)
            {
                case 1 : System.out.println("1. Add Task");
                    try{
                        System.out.println("Please Enter Task Title : ");
                        String taskTitle = sc.nextLine();
                        System.out.println("Please Enter Description : ");
                        String description = sc.nextLine();

                        Operations op = new Operations(TaskID, taskTitle, description,false);
                        op.AddTask();

                        oprList.add(op);
                        TaskID++;

                    }
                    catch (Exception e)
                    {
                        System.out.println(e);
                    }

                    break;

                case 2 :
                    try
                    {
                        for (int i=0; i<oprList.size(); i++)
                        {
                            oprList.get(i).ViewTasks();
                        }

                    }
                    catch (Exception e)
                    {
                        System.out.println(e);
                    }

                    break;

                case 3:
                    try
                    {
                        System.out.println("Enter the TaskID to mark as Completed.");
                        int tId = sc.nextInt();
                        oprList.get(--tId).MarkAsCompleted();
                    }
                    catch (Exception e)
                    {
                        System.out.println(e);
                    }

                    break;

                case 4:
                    try{
                        System.out.println("Please Enter TaskID to be Removed : ");
                        int tId = sc.nextInt();
                        tId--;
                        if (oprList.get(tId)!=null)
                        {
                            oprList.remove(tId);
                            System.out.println("Task ID :"+ (++tId) +" Successfully Removed.");
                        }else{
                            System.out.println("Please Enter a Valid TaskID.");
                        }
                    }
                    catch (Exception e)
                    {
                        System.out.println(e);
                    }
                    break;

                default:
                    System.out.println("Please Enter Valid Option.");
            }
        }while (option!=5);
    }
}
