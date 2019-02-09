
package Logic;

import java.awt.Image;
import java.awt.Toolkit;

public class Static {

    public static String folderForDataName = "VICEBot";
    public static String globalFolderForData = "Just Vice";
    public static String DataPath = System.getenv("APPDATA") + "\\" + globalFolderForData + "\\" + folderForDataName + "\\UserData.txt";
    public static String DataFolderPath = System.getenv("APPDATA") + "\\" + globalFolderForData + "\\" + folderForDataName;
    public static String title = "VICEBot",version = "PRE-ALPHA 0.1";
    public static Data data = new Data();
    public static Run run;

    public static Image getIconImage() {
        return Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("IMG/iconLogo.png"));
    }
}
