package company;

public class WorkerMarketing extends Worker{
    private String area;

    public WorkerMarketing(String name, String surname, String dni, String area) {
        super(name, surname, dni);
        this.area = area;
    }

    @Override
    public void work(){
        System.out.println("Worker named " +  getName() + " " + getSurname() + " is working in the " + area + " area");
    }

    public void work(int extraHours){
        System.out.println("Worker named " +  getName() + " " + getSurname() + " is working " + extraHours + " extra hours");
    }
}
