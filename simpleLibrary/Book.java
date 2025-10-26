package org.example;

public class Book {
    private static int nextId=1;
    private int id;
    private String title;
    private String author;
    private int year;
    private Boolean isBorrowed;

    public Book(String title, String author, int year, Boolean isBorrowed) {
        this.id = nextId++;
        this.title = title;
        this.author = author;
        this.year = year;
        this.isBorrowed = false;
    }




    public void returnOrBorrowBook(int id){
        if(isBorrowed){
            System.out.println("Book " +this.title + ": is returned now, thank you!");
            isBorrowed = false;
        }
        else{
            System.out.println("Book " +this.title + ": is borrowed now");
            isBorrowed = true;
        }
    }



    public boolean isBorrowed(){
        if(isBorrowed){
            return true;
        }
        else{
            return false;
        }
    }

    public String getBorrowedBook() {
        if(isBorrowed) {
            return "\n{ \nBook id: " + this.id + "\n" +
                    "title: " + this.title + " \n}"
                    ;
        }
        else{
            return "";
        }
    }

    @Override
    public String toString() {
        return "Book{" + id+
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", isBorrowed=" + isBorrowed +
                '}';
    }

    public String seeBook(){
        return
                "{\nBook id: " +id+": \n"
                + "title: "+title+ "\n"
                + "author: "+author+"\n"
                + "year: "+year+"\n"
                + "borrowed? "+
                        (isBorrowed?"yes":"no")

                        +"\n}";
    }
}
