package com.kiet.libarary.service;

import com.kiet.libarary.model.Book;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    private final List<Book> books = new ArrayList<>();

    public BookService() {
        books.add(new Book(201, "Effective Java",
                "Joshua Bloch", "Programming", 2018, true));

        books.add(new Book(202, "Clean Code",
                "Robert C. Martin", "Programming", 2008, true));

        books.add(new Book(203, "The Alchemist",
                "Paulo Coelho", "Fiction", 1988, false));

        books.add(new Book(204, "Introduction to Algorithms",
                "Thomas H. Cormen", "Education", 2022, true));

        books.add(new Book(205, "Harry Potter",
                "J.K. Rowling", "Fantasy", 1997, false));
    }

    // Get all books
    public List<Book> getAllBooks() {
        return books;
    }

    // Get book by ID
    public Book getBookById(int bookId) {
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                return book;
            }
        }
        return null;
    }

    // Add a new book
    public Book addBook(Book book) {
        books.add(book);
        return book;
    }

    // Update an existing book
    public Book updateBook(int bookId, Book updatedBook) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getBookId() == bookId) {
                updatedBook.setBookId(bookId);
                books.set(i, updatedBook);
                return updatedBook;
            }
        }
        return null;
    }

    // Delete a book
    public boolean deleteBook(int bookId) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getBookId() == bookId) {
                books.remove(i);
                return true;
            }
        }
        return false;
    }

    // Search by category
    public List<Book> searchByCategory(String category) {
        List<Book> result = new ArrayList<>();

        for (Book book : books) {
            if (book.getCategory().equalsIgnoreCase(category)) {
                result.add(book);
            }
        }

        return result;
    }

    // Find books published from a given year onward
    public List<Book> findPublishedFromYear(int fromYear) {
        List<Book> result = new ArrayList<>();

        for (Book book : books) {
            if (book.getPublicationYear() >= fromYear) {
                result.add(book);
            }
        }

        return result;
    }
}