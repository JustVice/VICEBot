package Logic;

import UI.Start;
import UI.TestRoom;

public class Run {

    public Run() {
        //openStart();
        openTestRoom();
    }

    private void openStart() {
        Start start = new Start();
    }
    
    private void openTestRoom(){
        TestRoom testRoom = new TestRoom();
    }
    
    public String generateID() {
        String str = "";
        int n = 0;
        int random = 0;
        random = (int) (Math.random() * 10000);
        str = "" + random + randomLetter() + (int) (Math.random() * 1000);
        System.out.println("Random ID generated: " + str);
        return str;
    }

    private String randomLetter() {
        String[] alfabeto = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "O", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "Z", "X", "Y"};
        String result = "";
        int randomLetterIndex = 0;
        while (true) {
            randomLetterIndex = ((int) (Math.random() * 100));
            if (randomLetterIndex <= 25) {
                break;
            }
        }
        result = alfabeto[randomLetterIndex];
        return result;
    }

}
