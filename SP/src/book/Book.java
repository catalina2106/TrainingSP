package book;

public class Book {
    private String book, paragraph, image, table;

    public Book(String book)
    {
    	this.book = book;
    }

    public void createNewParagraph(String paragraph)
    {
    	this.paragraph = paragraph;
    }

    public void createNewImage(String image)
    {
    	this.image = image;
    }

    public void createNewTable(String table)
    {
    	this.table = table;
    }

    public void print()
    {
    	System.out.println("Book title: "+ book + ", Paragraph " + paragraph +
    			", image " + image + ", table " + table);
    }

}
