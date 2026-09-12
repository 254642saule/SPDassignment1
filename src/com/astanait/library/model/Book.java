package com.astanait.library.model;

public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private String genre;
    private int pageCount;
    private CoverType coverType;

    private double estimatedValue;
    private int limitedEditionNumber;

    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setPublicationYear(int publicationYear) { this.publicationYear = publicationYear; }
    public void setGenre(String genre) { this.genre = genre; }
    public void setPageCount(int pageCount) { this.pageCount = pageCount; }
    public void setCoverType(CoverType coverType) { this.coverType = coverType; }
    public void setEstimatedValue(double estimatedValue) { this.estimatedValue = estimatedValue; }
    public void setLimitedEditionNumber(int limitedEditionNumber) { this.limitedEditionNumber = limitedEditionNumber; }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    private boolean isRareEdition() {
        return estimatedValue > 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Book {\n");
        sb.append("  Title: '").append(title).append("'\n");
        sb.append("  Author: '").append(author).append("'\n");
        sb.append("  Publication year: ").append(publicationYear).append("\n");
        sb.append("  Genre: '").append(genre).append("'\n");
        sb.append("  Page count: ").append(pageCount).append("\n");
        sb.append("  Cover type: ").append(coverType).append("\n");
        if (isRareEdition()) {
            sb.append("  Estimated value: ").append(estimatedValue).append(" USD\n");
            sb.append("  Limited edition number: ").append(limitedEditionNumber).append("\n");
        }
        sb.append('}');
        return sb.toString();
    }
}