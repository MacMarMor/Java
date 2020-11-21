import java.util.Random;

class Dice{
    Random random = new Random();
    int rzut;

    Dice(){
        roll();
    }
    Dice(int rzut){
        this.rzut = rzut;
    }
    void roll(){
        rzut = random.nextInt(6) + 1;
    }
    void rollInfo(){
        System.out.println("Wyrzuciłeś: " + rzut );
    }
}