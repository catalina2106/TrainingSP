package book;

import java.util.ArrayList;

public class Book {
    private String book, i;
    private ArrayList<String> paragraph = new ArrayList<>();
    private ArrayList<String> image = new ArrayList<>();
    private ArrayList<String> table = new ArrayList<>();

    public Book(String book)
    {
    	this.book = book;
    }

    public void createNewParagraph(String paragraphName)
    {
    	paragraph.add(paragraphName);
    }

    public void createNewImage(String imageName)
    {
    	image.add(imageName);
    }

    public void createNewTable(String tableName)
    {
    	table.add(tableName);
    }

    public void print()
    {
    	System.out.println("The book " + book + " has the following: ");
    	System.out.println("Paragraphs: ");
    	paragraph.forEach(name -> System.out.print(name + ", "));
    	System.out.println();

    	System.out.println("Images: ");
    	image.forEach(name -> System.out.print(name + ", "));
    	System.out.println();

    	System.out.println("Tables: ");
    	table.forEach(name -> System.out.print(name + ", "));
    	System.out.println();
    }

}
