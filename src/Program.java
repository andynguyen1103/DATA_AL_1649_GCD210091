import java.util.Scanner;

public class Program {
    public static void main(String[] args)
    {
        Transfer transfer = new Transfer();
        StopWatch watch = new StopWatch();

        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter your message (max: %s): ", transfer.maxMessage);
        String source = sc.nextLine();

        boolean key = true;
        while (key)
        {
            if (source.length()==0){
                System.out.println("Empty input, please try again");
                System.out.printf("Enter your message (max: %s): ", transfer.maxMessage);
                source = sc.nextLine();
                System.out.println();
            }
            else key = false;
        }
        if (source.length()<= transfer.maxMessage)
        {
            //time the function
            watch.Start();
            transfer.transferMessage(source);
            watch.Stop();


            transfer.showMessage();
            System.out.printf("transferred successfully %s characters!", transfer.destination.length());
            System.out.println();
            System.out.printf("Time to perform action is: %s microseconds",watch.Elapse()/1000);
            System.out.println();
            System.out.printf("Buffer size: %s",transfer.maxBuffer);
            System.out.println();
            System.out.printf("Memory used: %s KB",(transfer.memoryUsedAfter- transfer.memoryUsedBefore)/1024);
            System.out.println();
        }
        else
        {
            System.out.println("your input too long, some part might not get transferred");
            //time the function
            watch.Start();
            transfer.transferMessage(source);
            watch.Stop();


            transfer.showMessage();
            System.out.printf("transferred successfully %s characters!", transfer.destination.length());
            System.out.println();
            System.out.printf("Time to perform action is: %s microseconds",watch.Elapse()/1000);
            System.out.println();
            System.out.printf("Buffer size: %s",transfer.maxBuffer);
            System.out.println();
            System.out.printf("Memory used: %s KB",(transfer.memoryUsedAfter- transfer.memoryUsedBefore)/1024);
            System.out.println();
        }
    }
}
//        String message = "this is the message that I want to send that is very long and more than 100 characters in the fucking shit";
//        transfer.transferMessage(message);
//        transfer.showMessage();
