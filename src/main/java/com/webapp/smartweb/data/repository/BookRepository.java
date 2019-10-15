package com.webapp.smartweb.data.repository;

import com.webapp.smartweb.data.domain.Book;

import java.util.List;

public interface BookRepository {

   long save(Book book);
   Book get(long id);
   List<Book> list();
   void update(long id, Book book);
   void delete(long id);

}
