package Pirate;

import java.util.Random;

public class Pirate{

    private String name;
    private int drunkLvl;
    private int rumCount;
    private boolean isCaptain;
    private boolean isDead;
    private boolean isAsleep;

    public Pirate() {
        name = "Naive Rookie";
        drunkLvl = 0;
        rumCount = 0;
        isCaptain = false;
        isDead = false;
        isAsleep = false;
    }

    public void pirateStatus(){
        if(1 < drunkLvl){
            setName("Prommising Fella");
        } else if(2 < drunkLvl){
            setName("Wise Elder");
        } else if(3 < drunkLvl){
            setName("Drunk Mess");
        }
    }

    public void drinkSomeRum(){
        if(drunkLvl <= 4 && !isDead){
            this.setDrunkLvl(this.drunkLvl++);
            this.rumCount++;
        } else if(!isDead){
            setAsleep(true);
            System.out.println("This " + this.name + " needs to sleep some off first.");
        }
    }

    public String howsItGoingMate(){
        if(drunkLvl <= 4 && !isDead){
            return this.name + ": Pour me anudder!";
        } else {
            setAsleep(true);
            return this.name + ": Arghh, I'ma Pirate. How d'ya d'ink its goin?";
        }
    }

    public String die(){
        setDead(true);
        return this.name + ": aight, see you in hell comrade.";
    }

    public void brawl(Pirate pirate){
        if(pirate.isDead){
            System.out.println(pirate.getName() + ": Aye fella, I'm already dead.");
        } else {
            Random random = new Random();
            int randomNumber = random.nextInt(3) + 1;
            if (randomNumber == 1) {
                pirate.die();
            } else if (randomNumber == 2) {
                this.die();
            } else if (randomNumber == 3) {
                this.isAsleep = true;
                pirate.setAsleep(true);
            }
        }
    }

//getters

    public String getName() {
        return name;
    }

    public int getDrunkLvl() {
        return drunkLvl;
    }

    public int getRumCount() {
        return rumCount;
    }

    public boolean isCaptain() {
        return isCaptain;
    }

    public boolean isDead() {
        return isDead;
    }

    public boolean isAsleep() {
        return isAsleep;
    }


//setters

    public void setName(String name) {
        this.name = name;
    }

    public void setDrunkLvl(int drunkLvl) {
        this.drunkLvl = drunkLvl;
    }

    public void setRumCount(int rumCount) {
        this.rumCount = rumCount;
    }

    public void setCaptain(boolean captain) {
        isCaptain = captain;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    public void setAsleep(boolean asleep) {
        isAsleep = asleep;
    }
}
