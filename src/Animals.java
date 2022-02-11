public abstract class Animals {

    protected String species;
    protected String color;
    protected String name;
    protected int maxRun;

    public Animals(String species, String color, String size, int maxRun) {
        this.species = species;
        this.color = color;
        this.name = size;
        this.maxRun = maxRun;
    }


    public void run(int runDist) {
        if (runDist <= maxRun) {
            System.out.println(species + " " + name + " run " + runDist + "m");
        } else if (runDist <= 0) {
            System.out.println("Incorrect data. Please, input length > 0  ");
        } else {
            System.out.println("Too much for fluffy ball " + name);
        }
    }

    abstract void swim(int swimDist);


//    1. Создать классы Собака и Кот с наследованием от класса Животное.
//            2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
//    Результатом выполнения действия будет печать в консоль. (Например, dog.run(150); -> 'Бобик пробежал 150 м.');
//3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
//            4. * Добавить подсчет созданных котов, собак и животных.
//            !!! Организация в разных классе !!!
//            !!! К сдаче 4 класса(файла) !!!
//            !!! Для ленивых: сдать код с урока

}
