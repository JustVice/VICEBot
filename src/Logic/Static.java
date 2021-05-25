
package Logic;

import Object.Instrucction;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.LinkedList;

public class Static {

    public static String folderForDataName = "VICEBot";
    public static String globalFolderForData = "SPLIT VICE";
    public static String DataPath = System.getenv("APPDATA") + "\\" + globalFolderForData + "\\" + folderForDataName + "\\UserData.txt";
    public static String DataFolderPath = System.getenv("APPDATA") + "\\" + globalFolderForData + "\\" + folderForDataName;
    public static String title = "VICEBot",version = "PRE-ALPHA 0.3";
    public static Data data = new Data();
    public static LinkedList<Instrucction> instrucciones = new LinkedList<Instrucction>();
    public static Run run;

    public static Image getIconImage() {
        return Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("IMG/iconLogo.png"));
    }
}
