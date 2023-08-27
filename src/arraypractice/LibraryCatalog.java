package arraypractice;

import java.util.HashMap;
import java.util.Map;

public class LibraryCatalog {

    Map<String, Book> bookCollection;
    int currentDay = 0;
    int lengthOfCheckoutPeriod = 7;
    double initialLateFee = 0.50;
    double feePerLateDay = 1.00;
    
    public LibraryCatalog(Map<String, Book> collection) {
        this.bookCollection = collection;
    }

    public LibraryCatalog(Map<String, Book> collection, int lengthOfCheckoutPeriod,
                          double initialLateFee, double feePerLateDay) {
        this.bookCollection = collection;
        this.lengthOfCheckoutPeriod = lengthOfCheckoutPeriod;
        this.initialLateFee = initialLateFee;
        this.feePerLateDay = feePerLateDay;
    }

    //Getters
    public int getCurrentDay() {
        return this.currentDay;
    }

    public Map<String, Book> getBookCollection() {
        return this.bookCollection;
    }

    public Book getBook(String bookTitle) {
        return getBookCollection().get(bookTitle);
    }

    public int getLengthOfCheckoutPeriod() {
        return this.lengthOfCheckoutPeriod;
    }

    public double getInitialLateFee() {
        return this.initialLateFee;
    }

    public double getFeePerLateDay() {
        return this.feePerLateDay;
    }

    public void nextDay() {
        currentDay++;
    }

    public void setDay(int day) {
        currentDay = day;
    }

    //INSTANCE METHODS:

    public void checkOut(String title) {
        var book = getBook(title);
        if (book.getIsCheckedOut()) {
            sorryBookAlreadyCheckedOut(book);
        } else {
            book.setCheckedOut(true, currentDay);
            System.out.println("You just checked out: " + title + ". It is your day " +
                    (getCurrentDay() + getLengthOfCheckoutPeriod()) + ".");
        }
    }

    public void returnBook(String title) {
        var book = getBook(title);
        var daysLate = currentDay - (book.getDayCheckedOut() + getLengthOfCheckoutPeriod());
        if (daysLate > 0) {
            System.out.println("You owe the library $" + (getInitialLateFee() + daysLate*getFeePerLateDay()) +
                    " because your book is " + daysLate + " days overdue");
        } else {
            System.out.println("Book returned.Thank you.");
        }
        book.setCheckedOut(false, -1);
    }

    public void sorryBookAlreadyCheckedOut(Book book) {
        System.out.println("Sorry," + book.getTitle() + " is already checked out. " +
                "It should be back on day " +  (book.getDayCheckedOut() + getLengthOfCheckoutPeriod()) + ".");
    }

    public static void main (String[] args) {
        var bookCollection = new HashMap<String, Book>();
        var harry = new Book("Harry Potter", 34234, 9999999);
        bookCollection.put("Harry Potter", harry);
        var lib = new LibraryCatalog(bookCollection);
        lib.checkOut("Harry Potter");
        lib.nextDay();
        lib.nextDay();
        lib.checkOut("Harry Potter");
        lib.setDay(17);
        lib.returnBook("Harry Potter");
        lib.checkOut("Harry Potter");
    }
}
