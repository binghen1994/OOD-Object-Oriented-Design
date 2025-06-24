public class NameMatcher extends Matcher {
    String name;
    public NameMatcher(String name) {
        this.name = name;
    }
    public boolean match(FileSystem file) {
        return file.getName().equals(name);
    }
}

