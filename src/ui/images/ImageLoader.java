package ui.images;

import processing.core.PGraphics;
import processing.core.PShape;

import java.io.File;
import java.net.URI;
import java.nio.file.spi.FileSystemProvider;
import java.util.HashMap;
import java.nio.file.*;

public class ImageLoader {
    public static HashMap<String, PShape> data;
    public static void loadImages() {
        loadFolder("../data");
    }

    private static void loadFolder(String path) {
        PGraphics pg = new PGraphics();
        File dir = new File("path");
        File [] files = dir.listFiles();

        System.out.print(files.length);
    }
}
