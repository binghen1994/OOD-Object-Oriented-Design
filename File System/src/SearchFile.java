import java.util.List;

public abstract class SearchFile {
    public List<FileSystem> search(FileSystem file, Matcher matcher, List<FileSystem> list) {
        if (file.isFile()) {
            if (matcher.match(file)) {
                list.add(file);
            }
        } else {
            List<FileSystem> files = ((Folder)file).getFiles();
            for (FileSystem nextFile : files) {
                search(nextFile, matcher, list);
            }
        }

        return list;
    }
}
