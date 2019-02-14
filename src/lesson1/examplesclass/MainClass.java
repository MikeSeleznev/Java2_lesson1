package lesson1.examplesclass;

import lesson1.Sport.Course;
import lesson1.Sport.Participant;
import lesson1.particiant.*;
import lesson1.Sport.Team;

/**
 * @author ilnaz-92@yandex.ru
 * Created on 11/02/2019
 */
public class MainClass
{

  public static void main(String[] args)
  {
    /*
    int a = 5;
    int b = 6;
    ExampleClass exampleClass = new ExampleClass();
    exampleClass.sum(a, b);

    System.out.println(" A in Main = " + a);
    System.out.println(" B in Main = " + b);


    LinkedExampleClass exampleClass = new LinkedExampleClass();
    ExampleForMethodClass exampleForMethodClass = new ExampleForMethodClass();
    exampleForMethodClass.toDo(exampleClass);
    System.out.println(exampleClass.toString()); */

    Participant[] participants1 = new Participant[4];
    participants1[0] = new Participant(new Cat(2,"Barsik", Cat.TYPE_PERSIA));
    participants1[1] = new Participant(new Dog(2,"Polkan", Dog.TYPE_BULDOG));
    participants1[2] = new Participant(new Human(30, "Mike", Gender.MALE));
    participants1[3] = new Participant(new Human(31,"Anna", Gender.FEMALE));

    Participant[] participants2 = new Participant[4];
    participants2[0] = new Participant(new Cat(4,"Murzik", Cat.TYPE_BRITYSH));
    participants2[1] = new Participant(new Dog(2,"Polkan", Dog.TYPE_GERMAN));
    participants2[2] = new Participant(new Human(50, "Alex", Gender.MALE));
    participants2[3] = new Participant(new Human(45,"Rachel", Gender.FEMALE));

    Cat cat = new Cat(4,"Murzik", Cat.TYPE_BRITYSH);
    Dog dog = new Dog(2,"Polkan", Dog.TYPE_GERMAN);
    Human human1 = new Human(50, "Alex", Gender.MALE);
    Human human2 = new Human(45,"Rachel", Gender.FEMALE);

    Animal[] animals = new Animal[4];
    animals[0] = new Cat(4,"Murzik", Cat.TYPE_BRITYSH);
    animals[1] = new Dog(2,"Polkan", Dog.TYPE_GERMAN);
    animals[2] = new Human(50, "Alex", Gender.MALE);
    animals[3] = new Human(45,"Rachel", Gender.FEMALE);

    Team team1 = new Team("Alfa", animals);


    Course course = new Course();
    course.doIt(team1);

  }


}
