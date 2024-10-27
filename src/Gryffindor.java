public class Gryffindor extends Hogwarts {
    private int nobility; // благородство
    private int honor; // честь
    private int bravery; // храбрость

    public Gryffindor(String firstName, String lastName, int hex, int transgress, int nobility, int honor, int bravery) {
        super(firstName, lastName, hex, transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return '{' + firstName + " " + lastName +
                ", колдовство = " + hex +
                ", трансгрессия = " + transgress +
                ", благородство = " + nobility +
                ", честь = " + honor +
                ", храбрость = " + bravery +
                '}';
    }

    public static void comparingStudents(Gryffindor student1, Gryffindor student2) {
        if ((student1.nobility + student1.honor + student1.bravery) > (student2.nobility + student2.honor + student2.bravery)) {
            System.out.println(student1.firstName + " " + student1.lastName + " " + "лучший студент Гриффиндора, чем " + student2.firstName + " " + student2.lastName);
        } else if ((student1.nobility + student1.honor + student1.bravery) < (student2.nobility + student2.honor + student2.bravery)) {
            System.out.println(student2.firstName + " " + student2.lastName + " " + "лучший студент Гриффиндора, чем " + student1.firstName + " " + student1.lastName);
        } else {
            System.out.println("Силы студентов равны");
        }
    }
}

