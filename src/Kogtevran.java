public class Kogtevran extends Hogwarts {
    private int smart; // умный
    private int wise; // мудрый
    private int witty; // остроумный
    private int creative; // творческий

    public Kogtevran(String firstName, String lastName, int hew, int transgress, int smart, int wise, int witty, int creative) {
        super(firstName, lastName, hew, transgress);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creative = creative;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }

    @Override
    public String toString() {
        return '{' + firstName + " " + lastName +
                ", колдовство = " + hex +
                ", трансгрессия = " + transgress +
                ", ум = " + smart +
                ", мудрость = " + wise +
                ", остроумие = " + witty +
                ", творчество = " + creative +
                '}';
    }

    public static void comparingStudents(Kogtevran student1, Kogtevran student2) {
        if ((student1.smart + student1.wise + student1.witty + student1.creative) > (student2.smart + student2.wise + student2.witty + student2.creative)) {
            System.out.println(student1.firstName + " " + student1.lastName + " " + "лучший студент Когтеврана, чем " + student2.firstName + " " + student2.lastName);
        } else if ((student1.smart + student1.wise + student1.witty + student1.creative) < (student2.smart + student2.wise + student2.witty + student2.creative)) {
            System.out.println(student2.firstName + " " + student2.lastName + " " + "лучший студент Когтеврана, чем " + student1.firstName + " " + student1.lastName);
        } else {
            System.out.println("Силы студентов равны");
        }
    }
}
