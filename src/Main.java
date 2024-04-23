import company.Worker;
import company.WorkerHHRR;
import company.WorkerMarketing;
import company.WorkerProduction;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Human Resources");
        WorkerHHRR workerHHRR1 = new WorkerHHRR("Franco", "De Bernardi", "123456", 12);

        workerHHRR1.work();

        System.out.println(" ");
        System.out.println("Marketing");
        WorkerMarketing workerMarketing = new WorkerMarketing("Alexis", "Godoy", "547893", "Newsletters");

        workerMarketing.work();
        workerMarketing.work(2);

        System.out.println(" ");
        System.out.println("Production");

        WorkerProduction workerProduction = new WorkerProduction("Angelina", "Houston", "738920", 1256);

        workerProduction.work();

        Worker worker = new Worker("Donald", "Duck", "1945");
        
    }
}