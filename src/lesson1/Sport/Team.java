package lesson1.Sport;

import lesson1.particiant.Animal;
import lesson1.particiant.Cat;
import lesson1.particiant.Dog;
import lesson1.particiant.Human;

public class Team {

    private String name;
    private Animal[] animals;


    public Team (String name, Animal[] animals){
        this.name = name;
        this.animals = animals;
    }

    public Animal[] getAnimals(){
        return animals;
    }
    /*public void getTeam(){
        System.out.println(name);
        System.out.println(particiant.length);
        //for (int i = 0; i < particiant.length ; i++) {
        //    System.out.println(particiant[i].getName() + " " + particiant[i].getAge());
        //}

   }

    public Participant[] getParticiant(Team team){
        return team.particiant;
    }*/
}