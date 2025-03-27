package Level_Jounin.generics;

public class parchments {
    private String content;

    public parchments(String content) {
        this.content = content;
    }

    public parchments() {
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Parchment content: " + content;
    }
}
