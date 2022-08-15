package book;

public class Content {
    private String content;

    public Content() {
    }
    public void setcontent(String content) {
        this.content = content;
    }

    void show() {
        System.out.println("Содержание книги : " + content) ;
    }
}
