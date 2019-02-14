package lesson1.examplesclass;

import com.sun.source.tree.NewArrayTree;
import lesson1.Sport.Course;
import lesson1.Sport.Participant;
import lesson1.Sport.Sportsman;
import lesson1.particiant.*;
import lesson1.Sport.Team;

/**
 * @author ilnaz-92@yandex.ru
 * Created on 11/02/2019
 */
public class MainClass {

  public static void main(String[] args) {
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


    Sportsman[] sportsmen = new Sportsman[4];
    sportsmen[0] = new Cat(4, "Murzik", Cat.TYPE_BRITYSH);
    sportsmen[1] = new Dog(2, "Polkan", Dog.TYPE_GERMAN);
    sportsmen[2] = new Human(50, "Alex", Gender.MALE);
    sportsmen[3] = new Human(45, "Rachel", Gender.FEMALE);

    Team team = new Team("Alfa", sportsmen);

    Course course = new Course(20.0, 2.5,50);
    course.doIt(team);
    team.showResult();
  }
}