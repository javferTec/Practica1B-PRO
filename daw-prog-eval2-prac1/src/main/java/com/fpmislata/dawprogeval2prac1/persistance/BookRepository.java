package com.fpmislata.dawprogeval2prac1.persistance;

import com.fpmislata.dawprogeval2prac1.business.entity.Book;
import java.util.List;

public interface BookRepository {
    List<Book> all();
    Book getById(int id);
    int getMaxId();
}
