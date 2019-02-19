package Object;

import Logic.Static;
import java.io.Serializable;

public class Instrucction implements Serializable, Runnable {

    private static final long serialVersionUID = 4998493289834429995L;

    private String instrucction = "none", instrucctionName = "No name";
    private String ID;
    private int timeDelay;
    private boolean trackActivity = false;

///CONSTRUCTORS
    public Instrucction(String instrucction, int timeDelay, String instrucctionName, boolean trackActivity) {
        this.instrucction = instrucction;
        this.timeDelay = timeDelay;
        ID = Static.run.generateID();
        this.instrucctionName = instrucctionName;
        this.trackActivity = trackActivity;
    }

    public Instrucction() {
        ID = Static.run.generateID();
    }

    //METHODS
    public void initiate() {
        if (!instrucction.equals("none")) {
            if (trackActivity) {
                System.out.println("----Instrucction " + instrucctionName + " " + ID + " started.");
            }
            switch (instrucction) {
                case "delay":
                    try {
                        Thread t = new Thread(this);
                        t.start();
                        t.join();
                    } catch (Exception e) {
                    }
                    break;
                case "1":

                    break;
                case "2":

                    break;
                case "3":

                    break;
                case "4":

                    break;

                default:
                    throw new AssertionError();
            }
            if (trackActivity) {
                System.out.println("----Instrucction " + instrucctionName + " " + ID + " finished.");
            }
        } else {
            System.out.println("INSTRUCTION EMPTY!");
        }
    }

    //////GET AND SET
    public String getInstrucction() {
        return instrucction;
    }

    public void setInstrucction(String instrucction) {
        this.instrucction = instrucction;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(timeDelay);
        } catch (Exception e) {
        }
    }

}
