package book;

import java.util.ArrayList;

public class Chapter {
    private String name;
    private ArrayList<SubChapter> subChapter = new ArrayList<>();

    public Chapter(String chapterName) {
    	this.name = chapterName;
    }

    public int createSubChapter(String subChapterName) {
    	SubChapter sCh = new SubChapter(subChapterName);
    	subChapter.add(sCh);
    	return subChapter.indexOf(sCh);
    }

    public SubChapter getSubChapter(int idx) {
    	return subChapter.get(idx);
    }

    public void print() {
    	System.out.println(name);
    	for(SubChapter s: subChapter)
    	{
    		System.out.println("Subchapter: ");
    		s.print();
    	}
    }

}
