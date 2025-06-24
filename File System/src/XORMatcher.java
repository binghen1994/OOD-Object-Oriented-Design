public class XORMatcher extends Matcher {
    Matcher matcher1, matcher2;
    public XORMatcher(Matcher matcher1, Matcher matcher2) {
        this.matcher1 = matcher1;
        this.matcher2 = matcher2;
    }
    public boolean match(FileSystem file) {
        return matcher1.match(file) ^ matcher2.match(file);
    }
}
