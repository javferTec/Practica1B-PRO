package com.fpmislata.dawprogeval2prac1.business.service.impl;

import com.fpmislata.dawprogeval2prac1.business.entity.Book;
import com.fpmislata.dawprogeval2prac1.business.service.BooksService;
import com.fpmislata.dawprogeval2prac1.persistance.BookRepository;
import com.fpmislata.dawprogeval2prac1.persistance.impl.StaticBookRepositoryImpl;
import java.util.List;

public class BooksServiceImpl implements BooksService {
    private BookRepository repository = new StaticBookRepositoryImpl();

    @Override
    public List<Book> getAll() {
        return this.repository.all();
    }
    @Override
    public Book getById(int id) {
        return this.repository.getById(id);
    }
    @Override
    public int getMaxId() {
        return this.repository.getMaxId();
    }
}
