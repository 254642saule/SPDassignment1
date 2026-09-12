package com.astanait.library.app;

import com.astanait.library.builder.RareEditionBookBuilder;
import com.astanait.library.builder.StandardBookBuilder;
import com.astanait.library.director.LibraryCatalogDirector;
import com.astanait.library.model.Book;
import com.astanait.library.model.CoverType;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StandardBookBuilder builder = new StandardBookBuilder();

        System.out.println("=== CREATE A BOOK ===");

        System.out.print("Enter book title: ");
        String title = scanner.nextLine();

        System.out.print("Enter author: ");
        String author = scanner.nextLine();

        System.out.print("Enter publication year: ");
        int year = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter genre: ");
        String genre = scanner.nextLine();

        builder.setTitle(title)
                .setAuthor(author)
                .setPublicationYear(year)
                .setGenre(genre)
                .setCoverType(CoverType.PAPERBACK);

        Book myBook = builder.getResult();

        System.out.println("\nYour book was created successfully:");
        System.out.println(myBook);

        System.out.println("--------------------------------");
        System.out.println("Building a book from a ready-made Director template (standard edition):");
        LibraryCatalogDirector director = new LibraryCatalogDirector();
        director.constructClassicNovel(builder);
        Book classic = builder.getResult();
        System.out.println(classic);

        System.out.println("--------------------------------");
        System.out.println("Building a rare collector's edition using the second ConcreteBuilder:");
        RareEditionBookBuilder rareBuilder = new RareEditionBookBuilder();
        director.constructRareFirstEdition(rareBuilder);
        Book rareBook = rareBuilder.getResult();
        System.out.println(rareBook);

        System.out.println("--------------------------------");
        System.out.println("Validation check - trying to create a book without a title:");
        try {
            new StandardBookBuilder().setAuthor("Anonymous").getResult();
        } catch (IllegalStateException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        scanner.close();
    }
}