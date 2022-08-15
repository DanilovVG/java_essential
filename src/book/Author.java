package book;

public class Author {

    private String autor;
    public Author() {
    }
    public void setautor(String autor) {
        this.autor = autor;
    }
    void show() {
        System.out.println("Автор книги : " + autor) ;
    }
}
