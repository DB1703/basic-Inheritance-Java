package company;

public class WorkerHHRR extends Worker{
    private int achievedDischarges;

    public WorkerHHRR(String name, String surname, String dni, int achievedDischarges) {
        super(name, surname, dni);
        this.achievedDischarges = achievedDischarges;
    }

    @Override
    public void work(){
        System.out.println("Worker named " +  getName() + " " + getSurname() + " is working with " + achievedDischarges + " achieved discharges");
    }
}
