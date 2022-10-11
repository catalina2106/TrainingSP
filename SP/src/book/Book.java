package book;

import java.util.ArrayList;

public class Book {
    private String book;
    private Author author;
    private ArrayList<Chapter> chapter = new ArrayList<>();

    public Book(String book)
    {
    	this.book = book;
    }

    public void addAuthor(Author author) {
    	this.author = author;
    }

    public int createChapter(String chapterName) {
    	Chapter ch = new Chapter(chapterName);
    	chapter.add(ch);
    	return chapter.indexOf(ch);
    }

    public Chapter getChapter(int idx) {
    	return chapter.get(idx);
    }

    public void print() {
    	System.out.print("The book " + book + " has the author ");
    	author.print();
    	for (Chapter c: chapter)
    	{
    		System.out.println("Chapter: ");
    		c.print();
    	}
	}
}
