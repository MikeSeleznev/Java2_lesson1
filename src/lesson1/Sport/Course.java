package lesson1.Sport;

import lesson1.particiant.Animal;

public class Course {
    private double swimDistance;
    private double jumpDistance;
    private double runDistance;

    public Course(double swimDistance, double jumpDistance, double runDistance){
        this.jumpDistance = jumpDistance;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
    }

    public void doIt(Team team){

        Sportsman[] sportsman = team.sportsmen();
        for (Sportsman player: sportsman) {
            Boolean jumpB = player.jump(2.5);
            if (jumpB == false){
                team.setDidIt(false);
                break;}
            Boolean runB = player.run(100.1);
            if (runB == false){
                team.setDidIt(false);
                break;}
            Boolean swimB = player.swim(50.1);
            if (swimB == false){
                team.setDidIt(false);
                break;}
        }

    }
}
