package com.astanait.library.builder;

import com.astanait.library.model.Book;

public interface BookBuilder<T extends BookBuilder<T>> {
    T setTitle(String title);
    T setAuthor(String author);
    T setPublicationYear(int publicationYear);
    T setGenre(String genre);
    void reset();
    Book getResult();
}