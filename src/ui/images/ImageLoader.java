package ui.images;

import processing.core.PShape;

import java.io.File;
import java.util.HashMap;

public class ImageLoader {
    public static HashMap<String, File> data;
    public static void loadImages() {
        loadFolder("../../../gameFiles/images");
    }

    private static void loadFolder(String path) {
        File folder = new File(path);
        if (!folder.isDirectory()) {
            throw new Error("Path is not a directory!");
        }
        String[] filenames = folder.list();
        for (String s: filenames) {
            File file = new File(path+"/"+s);
            if (file.isDirectory()) {
                loadFolder(file.getPath());
            } else {
                data.put(s, file);
            }
        }
    }
}
