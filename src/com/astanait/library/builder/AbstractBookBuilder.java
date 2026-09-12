package com.astanait.library.builder;

import com.astanait.library.model.Book;

public abstract class AbstractBookBuilder<T extends AbstractBookBuilder<T>> implements BookBuilder<T> {
    protected Book book;

    public AbstractBookBuilder() {
        this.reset();
    }

    protected abstract T self();

    @Override
    public void reset() {
        this.book = new Book();
        applyDefaults();
    }

    protected void applyDefaults() {
    }

    @Override
    public T setTitle(String title) {
        book.setTitle(title);
        return self();
    }

    @Override
    public T setAuthor(String author) {
        book.setAuthor(author);
        return self();
    }

    @Override
    public T setPublicationYear(int publicationYear) {
        book.setPublicationYear(publicationYear);
        return self();
    }

    @Override
    public T setGenre(String genre) {
        book.setGenre(genre);
        return self();
    }

    @Override
    public Book getResult() {
        validateBeforeBuild();
        Book product = this.book;
        this.reset();
        return product;
    }

    private void validateBeforeBuild() {
        if (book.getTitle() == null || book.getTitle().isBlank()) {
            throw new IllegalStateException("Cannot create a book without a title.");
        }
        if (book.getAuthor() == null || book.getAuthor().isBlank()) {
            throw new IllegalStateException("Cannot create a book without an author.");
        }
    }
}