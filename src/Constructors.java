public class Constructors {
    public static void main(String[] args) {

        Human man = new Human("Myroslava");
        String girl = man.getName();
        System.out.println("Name of Girl: " + girl);
        System.out.println();

        Human human = new Human("Oksana", "female",23);

        String name1 = human.getName();
        String sex1 = human.getSex();
        int age1 = human.getAge();

        System.out.println("Name: " + name1);
        System.out.println("Sex: " + sex1);
        System.out.println("Age: " + age1);

        Human people = new Human();

        people.setName("Orest");
        people.setSex("male");
        people.setAge(26);

        String name = people.getName();
        String sex = people.getSex();
        int age = people.getAge();

        System.out.println();

        System.out.println("Name: " + name);
        System.out.println("Sex: " + sex);
        System.out.println("Age: " + age);
    }
}
