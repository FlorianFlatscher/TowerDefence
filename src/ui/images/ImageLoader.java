package ui.images;

import com.ehif.td.Sketch;
import processing.core.PGraphics;
import processing.core.PShape;

import java.io.File;
import java.net.URI;
import java.nio.file.spi.FileSystemProvider;
import java.util.HashMap;
import java.nio.file.*;

public class ImageLoader {
    public static HashMap<String, PShape> data = new HashMap<>();
    public static void loadImages() {
        loadFolder(new File("src\\ui\\images\\data"));
}

    private static void loadFolder(File dir) {
        PGraphics pg = new PGraphics();
        File [] files = dir.listFiles();
        for (File file: files) {
            if (file.isDirectory()) {
                loadFolder(file);
            } else {

                data.put(file.getName(), Sketch.s.loadShape(file.getPath()));
            }
        }
    }
}
