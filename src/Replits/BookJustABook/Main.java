package Replits.BookJustABook;

public class Main
{
    public static void main(String[] args)
    {

    }
}

class Book
{
    public String title, author, tableOfContents = "";
    public int nextPage = 1;

    public Book(String title, String author)
    {
        this.title = title;
        this.author = author;
    }

    public void addChapter(String chapter, int pages)
    {
        tableOfContents += "\n" + chapter + "..." + nextPage;
        nextPage += pages;
    }

    public int getPages()
    {
        return nextPage-1;
    }

    public String getTableOfContents()
    {
        return tableOfContents;
    }


    public String toString()
    {
        return title+"\n"+author;
    }
}