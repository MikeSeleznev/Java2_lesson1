package lesson1.Sport;

import lesson1.particiant.Animal;

public class Course {
    private Obstacles obstacles;
    private double swimDistance = 100.1;
    private double jumpDistance = 2.5;

    public Course(){
        Obstacles[] obstacles = new Obstacles[3];
        obstacles[0] = new Obstacles("1.1");//swim
        obstacles[1] = new Obstacles("Jump");
        //obstacles[0] = new Obstacles("Run");
    }

    public void doIt(Team team){

        boolean catBoolean = true;
        Animal[] animals = team.getAnimals();

        for (Animal animal: animals) {
            String a = "f";
        }
               /*Participant[] participant = team.getParticiant(team);

        for (int i = 0;0<participant.length ; i++) {
           Participant participant1 =  participant[i];
            participant1.
        }*/
    }
}
