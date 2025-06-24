public class ExtensionMatcher extends Matcher {
    String extension;
    public ExtensionMatcher(String extension) {
        this.extension = extension;
    }
    public boolean match(FileSystem file) {
        return ((File)file).getExtension().equals(extension);
    }
}

