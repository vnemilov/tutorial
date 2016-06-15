package tutorial;

/**
 * Created by vemilov on 15.6.2016 г..
 */
public class Car {
    private Engine engine;

    private String warningMessage;

    public Car(Engine engine){
        this.engine = engine;
    }

    public void accelerate(){
        engine.increaseRpm();
        if(engine.getRpm() > 5000){
            warningMessage = "Slow Down!";
        }else{
            warningMessage = "You are good!";
        }
    }
    public void decelerate() {
        engine.decreaseRpm();
        if(engine.getRpm() < 2000){
            warningMessage = "Speed Up!";
        }else{
            warningMessage = "You are good!";
        }
    }

    public String getWarningMessage() {
        return warningMessage;
    }

    public void setWarningMessage(String warningMessage) {
        this.warningMessage = warningMessage;
    }


}
