package pl.zzpj2020.solid.srp.book.solution;

import java.util.Map;

public class Printer implements Readable {
    @Override
    public void printCurrentPage(final Book book) {
        System.out.println(book.getCurrentPageContents());
    }

    @Override
    public String printAllPages(final Book book) {
        String allPages = new String();
        for(Map.Entry<Integer, String> page : book.getPages().entrySet()) {
            allPages += (page.getKey() + " " + page.getValue());
        }
        return  allPages;
    }
}
