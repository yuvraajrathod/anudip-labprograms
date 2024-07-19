package com.Lab_2_programs;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Book 
{
    private String title;
    private String author;
    private String ISBN;

    public Book(String title, String author, String ISBN)
    {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public static class BookCollection {
        private List<Book> books = new ArrayList<>();

        public void addBook(Book book) {
            books.add(book);
        }

        public void removeBook(Book book) {
            books.remove(book);
        }

        public List<Book> getBooks() {
            return books;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the title of the book: ");
        String title = scanner.nextLine();

        System.out.print("Enter the author of the book: ");
        String author = scanner.nextLine();

        System.out.print("Enter the ISBN of the book: ");
        String ISBN = scanner.nextLine();

        Book newBook = new Book(title, author, ISBN);
        System.out.println("New Book added - Title: " + newBook.getTitle() + ", Author: " + newBook.getAuthor() + ", ISBN: " + newBook.getISBN());

        scanner.close();
    }
}