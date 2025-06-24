public class FileSystem {
    String name;
    boolean isFile;

    public FileSystem(String name, boolean isFile) {
        this.name = name;
        this.isFile = isFile;
    }

    public String getName() {
        return name;
    }

    public boolean isFile() {
        return isFile;
    }
}
