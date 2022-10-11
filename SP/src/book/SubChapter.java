package book;

import java.util.ArrayList;

public class SubChapter {
    private String name;
    private ArrayList<Paragraph> paragraph = new ArrayList<>();
    private ArrayList<Image> image = new ArrayList<>();
    private ArrayList<Table> table = new ArrayList<>();

    public SubChapter(String name) {
    	this.name = name;
    }

    public void createNewParagraph(String paragraphName) {
    	Paragraph p = new Paragraph(paragraphName);
    	paragraph.add(p);
    }

    public void createNewImage(String imageName) {
    	Image img = new Image(imageName);
    	image.add(img);
    }

    public void createNewTable(String tableName) {
    	Table t = new Table(tableName);
    	table.add(t);
    }

    public void print()
    {
    	System.out.println(name);
    	System.out.println("Paragraphs: ");
    	for(Paragraph p: paragraph)
    		p.print();

    	System.out.println("Images: ");
    	for(Image i: image)
    		i.print();

    	System.out.println("Tables: ");
    	for(Table t: table)
    	    t.print();
    }
}
