import java.util.List;

public class Folder extends FileSystem {
    List<FileSystem> files;

    public Folder(List<FileSystem> files, String name) {
        super(name, false);
        this.files = files;
    }

    public List<FileSystem> getFiles() {
        return files;
    }
}
