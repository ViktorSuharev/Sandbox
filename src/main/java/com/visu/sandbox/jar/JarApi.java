package com.visu.sandbox.jar;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Collections;

public class JarApi {
    public static void main(String[] args) throws IOException {
        File targetDir = new File("E:\\Test");
        File [] jarFiles = targetDir.listFiles((curDir, name) -> name.endsWith(".jar") && !name.contains("source"));
        if (jarFiles == null || jarFiles.length == 0) {
            System.out.println("No jar files found");
            return;
        }
        File fileToAdd = new File("E:\\Test\\Text.txt");
        if (!fileToAdd.exists()) {
            System.out.println("No txt file found");
            return;
        }

        try {
            for (File jarFile : jarFiles) {
                addFileToJar(jarFile, fileToAdd);
            }
        } catch (IOException e) {
            System.out.println("IOException happened " + e);
        }
    }

    private static void addFileToJar(File jarFile, File fileToAdd) throws IOException {
        URI uri = URI.create("jar:" + jarFile.toURI());
        try (FileSystem fs = FileSystems.newFileSystem(uri, Collections.emptyMap())) {
            Files.move(fileToAdd.toPath(), fs.getPath(fileToAdd.getName()), StandardCopyOption.REPLACE_EXISTING);
        }
    }
}
