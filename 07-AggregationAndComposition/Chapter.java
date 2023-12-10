public class Chapter {
    private String title;
    private int numberOfPages;
    private int startingPage;

    public Chapter(String title, int numberOfPages, int startingPage){
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.startingPage = startingPage;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getStartingPage() {
        return startingPage;
    }
}