package pl.zzpj2020.solid.srp.book.solution;

import java.util.HashMap;
import java.util.Map;

public class Book {
    private int currentPage = 0;

    private Map<Integer, String> pages = new HashMap<>();

    private String libraryRoomName;
    private String rowLocator;
    private int indexOnShelf;

    public String getTitle() {
        return "A Great Book";
    }

    public String getAuthor() {
        return "John Doe";
    }

    public Map<Integer, String> getPages() {
        return pages;
    }

    public String getCurrentPageContents() {
        return pages.get(currentPage);
    }

    public void turnPage() {
        currentPage ++;
    }

    public String libraryRoomName() {
        return libraryRoomName;
    }

    /**
     * Gives the row location of the book.
     * @return
     */
    public String getLocationRowLocator() {
        return rowLocator;
    }

    /**
     * Gives the number from shelf.
     * @return
     */
    public int getIndexOnShelf() {
        return indexOnShelf;
    }
}
