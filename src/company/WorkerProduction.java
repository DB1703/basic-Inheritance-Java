package company;

public class WorkerProduction extends Worker{
    private int experienceTime;

    public WorkerProduction(String name, String surname, String dni, int experienceTime) {
        super(name, surname, dni);
        this.experienceTime = experienceTime;
    }

    @Override
    public void work(){
        System.out.println("Worker named " +  getName() + " " + getSurname() + " has worked " + experienceTime + " hours");
    }
}
