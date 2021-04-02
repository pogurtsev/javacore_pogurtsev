package ru.geekbrains.lesson5;

public class HomeWork05 {

    public static void main(String[] args) {
        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        employeesArray[1] = new Employee("Sidorov Fedor", "Worker", "sidorov@mailbox.com", "892312313", 25000, 20);
        employeesArray[2] = new Employee("Ivanova Valya", "Сlerk", "ivvalya@mailbox.com", "892312311", 30000, 28);
        employeesArray[3] = new Employee("Sidorova Tanya", "Accountant", "bookkeeping@mailbox.com", "892312314", 30000, 48);
        employeesArray[4] = new Employee("Glavnyuk Andrew", "Director", "glavnyuk@mailbox.com", "892312310", 130000, 50);

        int ageToGetInfo = 40;
        for (int i = 0; i < employeesArray.length; i++) {
            if(employeesArray[i].getAge()>ageToGetInfo){
                employeesArray[i].info();
            }
        }
    }
}
