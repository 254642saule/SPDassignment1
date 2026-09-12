package com.astanait.library.director;

import com.astanait.library.builder.RareEditionBookBuilder;
import com.astanait.library.builder.StandardBookBuilder;
import com.astanait.library.model.CoverType;

public class LibraryCatalogDirector {

    public void constructClassicNovel(StandardBookBuilder builder) {
        builder.reset();
        builder.setTitle("War and Peace")
                .setAuthor("Leo Tolstoy")
                .setPublicationYear(1869)
                .setGenre("Epic Novel")
                .setPageCount(1225)
                .setCoverType(CoverType.HARDCOVER);
    }

    public void constructRareFirstEdition(RareEditionBookBuilder builder) {
        builder.reset();
        builder.setTitle("The Master and Margarita")
                .setAuthor("Mikhail Bulgakov")
                .setPublicationYear(1967)
                .setGenre("Mystical Novel")
                .setPageCount(384)
                .setEstimatedValue(2500.0)
                .setLimitedEditionNumber(17);
    }
}