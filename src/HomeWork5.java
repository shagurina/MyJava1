public class HomeWork5 {

    public static void main(String[] args) {

        Person[] persArray = new Person[5];

        persArray[0] = new Person("Abramov Anton", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 41);
        persArray[1] = new Person("Bobrov Boris", "Manager", "bobrov@mail.ru", "+89151234567", 35000, 28);
        persArray[2] = new Person("Vetrov Vladimir", "HR", "vetrov@yandex.ru", "+79151234568", 25000, 45);
        persArray[3] = new Person("Golov George", "QA engineer", "golov@gmail.com", "+79151234569", 40000, 34);
        persArray[4] = new Person("Dymov Dmitry", "Booker", "dymov@rambler.ru", "+79151234566", 68000, 50);

        System.out.println("-----------------------------------------------------------------------------------------------------------------------");

            for (int i = 0; i <= 4; i++) {
                if (persArray[i].age >= 40) {
                    System.out.println(" Name: " + persArray[i].name + " Position: " + persArray[i].position + " email: " + persArray[i].email + "Phone: " + persArray[i].phone + " Age: " + persArray[i].age);

                }
            }


    }
}







