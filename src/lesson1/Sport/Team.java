package lesson1.Sport;

import lesson1.particiant.Animal;

public class Team {

    private String name;
    private boolean didIt = true;
    private Sportsman[] sportsmen;


    public Team (String name,Sportsman[] sportsmen){
        this.name = name;
        this.sportsmen = sportsmen;
    }

    public Sportsman[] sportsmen(){
        return sportsmen;
    }

    public String getName() {
        return name;
    }

    public void setDidIt(boolean didIt) {
        this.didIt = didIt;
    }

    public void showResult(){
        String text = "";
        if (this.didIt){
          text = " прошла дистанцию";
        }else {
          text = " прошла дистанцию";
        }
        System.out.println("Команда " + this.name + text);
    }
}