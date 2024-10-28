public class Slytherin extends Hogwarts {
    private int cunning; // хитрость
    private int determination; // решительность
    private int ambition; // амбициозность
    private int resourcefulness; // находчивость
    private int power; // власть

    public Slytherin(String firstName, String lastName, int hex, int transgress, int cunning, int determination, int ambition, int resourcefulness, int power) {
        super(firstName, lastName, hex, transgress);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.power = power;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return '{' + firstName + " " + lastName +
                ", колдовство = " + hex +
                ", трансгрессия = " + transgress +
                ", хитрость = " + cunning +
                ", решительность = " + determination +
                ", амбициозность = " + ambition +
                ", находчивость = " + resourcefulness +
                ", жажда власти = " + power +
                '}';
    }

    public static void comparingStudents(Slytherin student1, Slytherin student2) {
        if ((student1.cunning + student1.determination + student1.ambition + student1.resourcefulness + student1.power) > (student2.cunning + student2.determination + student2.ambition+ student2.resourcefulness + student2.power)) {
            System.out.println(student1.firstName + " " + student1.lastName + " " + "лучший студент Слизерина, чем " + student2.firstName + " " + student2.lastName);
        } else if ((student1.cunning + student1.determination + student1.ambition + student1.resourcefulness + student1.power) < (student2.cunning + student2.determination + student2.ambition+ student2.resourcefulness + student2.power)) {
            System.out.println(student2.firstName + " " + student2.lastName + " " + "лучший студент Слизерина, чем " + student1.firstName + " " + student1.lastName);
        } else {
            System.out.println("Силы студентов равны");
        }
    }
}
