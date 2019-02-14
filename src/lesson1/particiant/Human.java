package lesson1.particiant;

import lesson1.Sport.Sportsman;

/**
 * @author ilnaz-92@yandex.ru
 * Created on 11/02/2019
 */
public class Human extends Animal implements Sportsman
{
  private Gender gender;

  private final static double DEFAULT_JUMP_VALUE = 9.0;

  public Human(int age, String name, Gender gender)
  {
    super(age, name);
    this.gender = gender;
  }

  @Override
  public boolean jump(double distanceJump)
  {
    return distanceJump <= gender.getCoef() * COEF_FOR_HUMAN * DEFAULT_JUMP_VALUE;
  }

  @Override
  public boolean run(double distanceToSwim) {
    return false;
  }


  @Override
  public String toString()
  {
    return "Human{" + "gender=" + gender + "} " + super.toString();
  }

  @Override
  public boolean swim(double distanceToSwim)
  {
    return false;
  }
}
