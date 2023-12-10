import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private Writer writer;
    private ArrayList<Chapter> chapters;

    public Book(String title, Writer writer) {
        this.title = title;
        this.writer = writer;
        this.chapters = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public Writer getWriter() {
        return writer;
    }

    public void addChapter(Chapter chapter) {
        chapters.add(chapter);
    }

    public void removeChapter(Chapter chapter) {
        chapters.remove(chapter);
    }

}