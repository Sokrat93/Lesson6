public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.firstName = "Vigen";
        student.lastName = "Gevorgyan";
        student.year = 1981;
        student.mark = 82;
        student.gender = '&';
        student.isArmenia = true;

        Student student1 = new Student();
        student1.firstName = "Sokrat";
        student1.lastName = "Hovhannisyan";
        student1.year = 1993;
        student1.mark = 56;
        student1.gender = '&';
        student1.isArmenia = true;

        System.out.print(student.firstName + " " + student.lastName);
        System.out.println();
        System.out.println(student.year);
        System.out.println(student.mark);
        System.out.println(student.gender);
        System.out.println(student.isArmenia?"yes":"no");
        System.out.println();
        System.out.println("******");
        System.out.println();
        System.out.print(student1.firstName + " " + student1.lastName);
        System.out.println();
        System.out.println(student1.year);
        System.out.println(student1.mark);
        System.out.println(student1.gender);
        System.out.println(student1.isArmenia?"yes":"no");
    }
}
