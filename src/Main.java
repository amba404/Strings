public class Main {
    public static void main(String[] args) {
        // Task 1
        printTaskTitle(1);

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);

        //Task 2
        printTaskTitle(2);

        System.out.printf("Данные Ф. И. О. сотрудника для заполнения отчета — %s\n", fullName.toUpperCase());

        //Task 3
        printTaskTitle(3);

        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace('ё', 'е');

        System.out.println("Данные Ф. И. О. сотрудника — " + fullName);
    }

    public static void printTaskTitle(int taskNumber) {

        System.out.printf("\n    Task %2d\n", taskNumber);
        System.out.println("---------------");

    }

}