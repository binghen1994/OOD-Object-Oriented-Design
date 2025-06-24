public class LargerMatcher extends Matcher {
    int size;
    public LargerMatcher(int size) {
        this.size = size;
    }
    public boolean match(FileSystem file) {
        return ((File)file).getSize() > size;
    }
}

