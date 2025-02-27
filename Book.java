/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private String refNumber;
    private int pages;
    private int borrowed;
    private boolean courseText;
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean bookiscourseText)
    {
        refNumber = "";
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        courseText = bookiscourseText;
        borrowed = 0;
    }
    public String getRefNumber()
    {
        return refNumber;
    }
    public boolean isCourseText()
    {
        return courseText;
    }
    public int getPages()
    {
        return pages;        
    }
    public int getBorrowed()
    {
        return borrowed;
    }
    public void borrow()
    {
        borrowed++;
    }
    public void setRefNumber(String ref)
    {
        if (ref.length() >= 3)
        {
        refNumber = ref;  
        } else 
        {
            System.out.println("ERROR: \nReference number must be atleast 3 characters long");
        }
    }
    // Add the methods here ...
    public void printAuthor()
    {
        System.out.println(author);
    }
    public void printTitle()
    {
        System.out.println(title);
    }
    
    public void printDetails()
    {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        if (refNumber.length() <= 0)
        {
            System.out.println("Reference Number: ZZZ");
        }else
        {
            System.out.println("Reference Number: " + refNumber);
        }
        System.out.println("Times Borrowed: " + borrowed);
    }
}
