package company;

public class Worker {
    private String name;
    private String surname;
    private String dni;


    public Worker(String name, String surname, String dni) {
        this.name = name;
        this.surname = surname;
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void work(){
        System.out.println("Worker named" + name + " " + surname + " is working");
    }

    public void rest(){
        System.out.println("Worked named" + name + " " + surname + " has begun to rest");
    }

    @Override
    public String toString() {
        return surname + ", " + name;
    }
}
