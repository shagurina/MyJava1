public class Person {

    public String name;
    public String position;
    public String email;
    public String phone;
    public int salary;
    public int age;

    public Person(String name, String position, String email,
                  String phone, int salary, int age ) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;

        System.out.println(" ФИО: " + name + " Должность: " + position + " Почта " + email
                         + " Телефон: " + phone + " Зарплата: " + salary + " Возраст: " + age);

    }



    public static void print(String name, String position, String email, String phone, int salary, int age) {
        System.out.println("ФИО: " + name + "Должность: " + position );
    }




//1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
//2. Конструктор класса должен заполнять эти поля при создании объекта.
//3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
//4. Создать массив из 5 сотрудников.
//            Пример:
//    Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
//    persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
//5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
}
