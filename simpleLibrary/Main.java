package org.example;


import java.util.Scanner;

public class Main {
    static void main() {
        Book[] books = new Book[4];
        books[0] = new Book("Pan tadeusz", "adam mickiewicz", 1834, false);

        books[1] = new Book("the best java programmer", "Zantarii", 2025, true);

        books[2] = new Book("how to make math brain game", "Zantarii", 2024, false);

        books[3] = new Book("Dziady", "adam mickiewicz", 1822, false);



        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("========================================================\n\nWelcome to the library! Press\n1: to check our books and borrow or return one of them,\n2: to check your borrowed books,  \n3: to exit! \n\n========================================================");

            if(sc.hasNextInt()){
                int choice = sc.nextInt();

                if(choice>0 && choice<4){

                    if(choice == 1){
                        System.out.println("These are all our books!");
                        for (int i = 0; i<books.length; i++){
                            System.out.println(books[i].seeBook());
                        }
                        while(true) {
                            System.out.println("Select the id of the book to borrow/return,  OR  enter invalid id to go back!");
                            if(sc.hasNextInt()){
                                int idOfTheBook = sc.nextInt()-1;
                                int booksLength = books.length;
                                if(idOfTheBook>booksLength || idOfTheBook<0){
                                    System.out.println("invalid book selected returning to the library ");
                                    break;
                                }
                                else{
                                    books[idOfTheBook].returnOrBorrowBook(idOfTheBook);

                                    break;

                                }
                            }
                            else{
                                System.out.println("this is not the id of any book, try again or enter INVALID ID");
                                sc.next();
                            }

                        }



                    } else if (choice == 2) {
                        int helper = 0;

                        for (int i = 0; i<books.length; i++){
                            if(books[i].isBorrowed()){
                                helper++;
                            }
                        }

                        if(helper>0){
                            System.out.println("You have " +helper +" borrowed books!: ");

                            for (int i = 0; i<books.length; i++){
                                System.out.print(books[i].getBorrowedBook());
                            }
                            System.out.println("\n\n");

                        }
                        else{
                            System.out.println("You dont have any borrowed books");
                        }


                    } else{
                        System.out.println("thanks for your visit!");
                        System.exit(0);
                    }
                }
                else{
                    System.out.println("wrong number! Press 1 to check our books, or 2 to exit!");
                }
            }
            else{
                System.out.println("You have to enter a number, try again!");
                sc.next();
            }

        }



    }
}
