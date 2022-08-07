public class Main {
    public static void main(String[] args) {
        //Задание 1
        String firstName = "Ivan", middleName = "Ivanov", lastName = "Ivanovich";
        String fullName =  firstName + " " + middleName + " " + lastName;
        System.out.println("ФИО сотрудника - " + fullName);

        //Задание 2
        String fullNameUpp =  fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullNameUpp);

        //Задание 3

        fullName = "Иванов Семён Семёнович";
        String fullNameCor = "";
        boolean ter = fullName.contains("ё");
        if (ter) {
            String[] str = fullName.split("ё");
            for (String i: str) {
                fullNameCor += i + "е";
            }
        }
        fullNameCor = fullNameCor.substring(0, fullNameCor.length() - 1);
        System.out.println(fullNameCor);
    }
}