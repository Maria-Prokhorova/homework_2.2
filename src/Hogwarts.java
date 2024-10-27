public class Hogwarts {
    protected String firstName;
    protected String lastName;
    protected int hex; // колдовать
    protected int transgress; // трансгрессировать

    public Hogwarts(String firstName, String lastName, int hex, int transgress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hex = hex;
        this.transgress = transgress;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getHex() {
        return hex;
    }

    public void setHex(int hex) {
        this.hex = hex;
    }

    public int getTransgress() {
        return transgress;
    }

    public void setTransgress(int transgress) {
        this.transgress = transgress;
    }

    @Override
    public String toString() {
        return "школа Hogwarts {" + firstName + ' ' + lastName  +
                ", колдовство = " + hex +
                ", трансгрессия = " + transgress +
                '}';
    }

    public static void comparingStudents(Hogwarts student1, Hogwarts student2) {
        if ((student1.hex + student1.transgress) > (student2.hex + student2.transgress)) {
            System.out.println(student1.firstName + " " + student1.lastName + " " + "обладает бОльшей мощностью магии, чем " + student2.firstName + " " + student2.lastName);
        } else if ((student1.hex + student1.transgress) < (student2.hex + student2.transgress)) {
            System.out.println(student2.firstName + " " + student2.lastName + " " + "обладает бОльшей мощностью магии, чем " + student1.firstName + " " + student1.lastName);
        } else {
            System.out.println("Силы студентов равны");
        }
    }
}
