public class Main {
    public static void main(String[] args) {

        Puffenduy[] studentPuffenduy = {
                new Puffenduy("Захария", "Смит", 5, 12, 10, 15, 7),
                new Puffenduy("Седрик", "Диггори", 7, 10, 8, 9, 3),
                new Puffenduy("Джастин", "Финч-Флетчли", 3, 3, 3, 10, 12)
        };

        Kogtevran[] studentKogtevran = {
                new Kogtevran("Чжоу", "Чанг", 8, 13, 10, 10, 16, 5),
                new Kogtevran("Падма", "Патил", 6, 9, 6, 9, 11, 9),
                new Kogtevran("Маркус", "Белби", 5, 10, 7, 15, 13, 7)
        };

        Slytherin[] studentSlytherin = {
                new Slytherin("Драко", "Малфой", 6, 6, 8, 9, 10, 4, 15),
                new Slytherin("Грэхэм", "Монтегю", 3, 5, 3, 12, 1, 7, 4),
                new Slytherin("Грегори", "Гойл", 7, 5, 8, 7, 13, 8, 7)
        };

        Gryffindor[] studentGryffindor = {
                new Gryffindor("Гарри", "Поттер", 9, 15, 10, 12, 17),
                new Gryffindor("Гермиона", "Грейнджер", 8, 19, 7, 10, 17),
                new Gryffindor("Рон", "Уизли", 5, 9, 14, 9, 5)
        };

        System.out.println("studentGryffindor 2 = " + studentGryffindor[1]);
        System.out.println("studentKogtevran 1 = " + studentKogtevran[0]);
        System.out.println("studentPuffenduy 3 = " + studentPuffenduy[2]);
        System.out.println("studentSlytherin 2 = " + studentSlytherin[1]);

        Puffenduy.comparingStudents(studentPuffenduy[0], studentPuffenduy[2]);
        Gryffindor.comparingStudents(studentGryffindor[0], studentGryffindor[1]);
        Kogtevran.comparingStudents(studentKogtevran[0], studentKogtevran[2]);
        Slytherin.comparingStudents(studentSlytherin[0], studentSlytherin[1]);
        Hogwarts.comparingStudents(studentGryffindor[0], studentSlytherin[0]);
    }
}