package org.example.view.settings;

public enum ResourcePath {
    RESOURCE_PATH("");
    private String filePath;
    private String currentDir = System.getProperty("user.dir");

    private ResourcePath(String filePath) {
        this.filePath += currentDir + "/src/test/resources/image/" + filePath;
    }
}
