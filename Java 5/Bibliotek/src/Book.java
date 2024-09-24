import java.util.ArrayList;

public class Book
{
    private String title;
    private String author;

    private int publishingYear;
    private int edition;

    private boolean available;

    ArrayList<String> reserveQueue;

    public Book()
    {
        this.available = true;
        this.reserveQueue = new ArrayList<>();
    }

    public Book(String title, String author, int publishingYear, int edition)
    {
        this.title = title;
        this.author = author;
        this.publishingYear = publishingYear;
        this.edition = edition;
        this.available = true;
        this.reserveQueue = new ArrayList<>();
    }

    public boolean isAvailable()
    {
        return this.available;
    }

    public void loanBook()
    {
        if(available)
        {
            if (!this.reserveQueue.isEmpty())
            {
                this.reserveQueue.removeFirst();
            }
            this.available = false;
        }
    }
    public void returnBook()
    {
        if(!available)
        {
            this.available = true;
        }
    }

    @Override
    public String toString()
    {
        return  "Title: " + this.title +
                " Author: " + this.author +
                " Publishing year: " + this.publishingYear +
                " Edition: " + this.edition;
    }
    public void reserve(String name)
    {
        this.reserveQueue.add(name);
        for (String s : this.reserveQueue) {
            System.out.println(s);
        }
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public int getEdition() {
        return edition;
    }
}
