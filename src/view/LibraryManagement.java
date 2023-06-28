package view;

import model.Book;
import model.Library;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryManagement extends Menu {

    public LibraryManagement(String title, String[] s) {
        super(title, s);
    }

    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1:
                System.out.println("List all book");
                break;
            case 2:
                LibraryManagement menuSearch = new LibraryManagement("Book Searching\n--------------------", new String[]{"Find by bookID", "Find by title", "Find by Author","Find by Year of Publishing"}){
                    @Override
                        public void execute(int choice) {
                            switch (choice) {
                                case 1:
                                    System.out.println("Find id");
                                    break;
                                case 2:
                                    System.out.println("find title");
                                    break;
                                case 3:
                                    System.out.println("Find Author");
                                    break;
                                case 4:
                                    System.out.println("Find YB");
                                    break;
                            }
                    }
                };
                menuSearch.run();
                break;
            case 3:
                System.out.println("Add new book");
                break;
            case 4:
                break;
        }
    }

    public static void main(String[] args) {
        LibraryManagement menu = new LibraryManagement("Library Management\n--------------------", new String[]{"List all books", "Search book", "Add new book", "Exit\n--------------------"});
        menu.run();

    }
}
