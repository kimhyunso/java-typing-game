package org.example.model.image.background;

import org.example.model.image.Image;
import org.example.model.image.soldier.SoldierFilePath;
import org.example.view.settings.Display;

public class BackgroundAutumn extends Image {
    private String name = "autumn";
    private String width = Display.WIDTH.name();
    private String height = Display.HEIGHT.name();
    private String FILE_PATH = System.getProperty("user.dir") + "/src/main/resources/image/background_archive/";

    public BackgroundAutumn() {
        FILE_PATH += "/back_ground_" + name + width + height + ".png";
    }
}
