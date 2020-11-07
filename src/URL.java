public class URL {
    private String desc;
    private String url;

    public URL(String url, String desc) {
        this.desc = desc;
        this.url = url;
    }

    public String getDesc() { return desc; }

    public String toString() { return desc + "\t" + url; }
}