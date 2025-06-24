public class SmallerMatcher extends Matcher {
    int size;
    public SmallerMatcher(int size) {
        this.size = size;
    }
    public boolean match(FileSystem file) {
        return ((File)file).getSize() < size;
    }
}

