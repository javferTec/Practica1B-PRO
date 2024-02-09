package com.fpmislata.dawprogeval2prac1.business.service;

import com.fpmislata.dawprogeval2prac1.business.entity.Book;
import java.util.List;

public interface BooksService {
    List<Book> getAll();
    Book getById(int id);
    int getMaxId();
}
