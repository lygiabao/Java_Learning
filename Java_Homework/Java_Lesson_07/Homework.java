package Java_Lesson_07;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        System.out.println("1. Input book");
        System.out.println("2. Find book by ISBN");
        System.out.println("0. Exit!");
        Scanner scanner = new Scanner(System.in);
        boolean isExit = false;
        while (!isExit) {
            System.out.println("Please select option!");
            int selection = scanner.nextInt();
            scanner.nextLine();
            switch (selection) {
                case 0:
                    isExit = true;
                    break;
                case 1:
                    System.out.println("Input ISBN: ");
                    String ISBN = scanner.nextLine();
                    System.out.println("Input title: ");
                    String title = scanner.nextLine();
                    System.out.println("Input author name: ");
                    String authorName = scanner.nextLine();
                    System.out.println("Input year: ");
                    int year = scanner.nextInt();
                    Book book = new Book(ISBN, title, authorName, year);
                    books.add(book);
                    break;
                case 2:
                    System.out.println("Input ISBN to find book: ");
                    String myISBN = scanner.nextLine();
                    List<Book> findBooks = findBookByISBN(myISBN, books);
                    if(findBooks.size()==0) {
                        System.out.println("Incorrect Result");
                        break;
                    }
                    for(Book book1 : findBooks) {
                        System.out.println(book1);
                    }
                    break;
            }
        }
    }
    private static List<Book> findBookByISBN(String ISBN, List<Book> books) {
        List<Book> findBooks = new ArrayList<>();
        for(Book book : books) {
            if(book.getISBN().equals(ISBN)) {
                findBooks.add(book);
            }
        }
        return findBooks;
    }
}
