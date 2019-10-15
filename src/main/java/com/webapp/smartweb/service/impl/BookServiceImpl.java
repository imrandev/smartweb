package com.webapp.smartweb.service.impl;

import java.util.List;

import com.webapp.smartweb.data.domain.Book;
import com.webapp.smartweb.data.repository.BookRepository;
import com.webapp.smartweb.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class BookServiceImpl implements BookService {

   @Autowired
   private BookRepository bookRepository;

   @Transactional
   @Override
   public long save(Book book) {
      return bookRepository.save(book);
   }

   @Override
   public Book get(long id) {
      return bookRepository.get(id);
   }

   @Override
   public List<Book> list() {
      return bookRepository.list();
   }

   @Transactional
   @Override
   public void update(long id, Book book) {
      bookRepository.update(id, book);
   }

   @Transactional
   @Override
   public void delete(long id) {
      bookRepository.delete(id);
   }

}
