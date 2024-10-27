public class Puffenduy extends Hogwarts {
    private int hardworking; // трудолюбивый
    private int loyal; // верный
    private int honest; // честный

    public Puffenduy(String firstName, String lastName, int hex, int transgress, int hardworking, int loyal, int honest) {
        super(firstName, lastName, hex, transgress);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    @Override
    public String toString() {
        return '{' + firstName + " " + lastName +
                ", колдовство = " + hex +
                ", трансгрессия = " + transgress +
                ", трудолюбие = " + hardworking +
                ", верность = " + loyal +
                ", честь = " + honest +
                '}';
    }

    public static void comparingStudents(Puffenduy student1, Puffenduy student2) {
        if ((student1.hardworking + student1.loyal + student1.honest) > (student2.hardworking + student2.loyal + student2.honest)) {
            System.out.println(student1.firstName + " " + student1.lastName + " " + "лучший студент Пуффендуя, чем " + student2.firstName + " " + student2.lastName);
        } else if ((student1.hardworking + student1.loyal + student1.honest) < (student2.hardworking + student2.loyal + student2.honest)) {
            System.out.println(student2.firstName + " " + student2.lastName + " " + "лучший студент Пуффендуя, чем " + student1.firstName + " " + student1.lastName);
        } else {
            System.out.println("Силы студентов равны");
        }
    }
}