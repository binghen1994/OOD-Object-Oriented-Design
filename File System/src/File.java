public class File extends FileSystem {
    int size;
    String extension;
    public File(String extension, int size, String name) {
        super(name, true);
        this.extension = extension;
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public String getExtension() {
        return extension;
    }
}
