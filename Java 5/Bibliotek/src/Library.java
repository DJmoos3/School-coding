import java.util.ArrayList;
import java.util.Scanner;

public class Library
{
    ArrayList<Book> books = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public void run()
    {
        String answer;
        String menu[] = {"Welcome to the library. What can i do for you today? choose with numbers.",
                "1. Add a book to the library.", "2. Search for a book by name" , "3. Collection",
                "4. Return a book", "5. Quit"};

        boolean running = true;




        while(running)
        {
            for (String s : menu) {
                System.out.println(s);
            }

            if(scanner.hasNextInt())
            {
                answer = scanner.nextLine();
                if (answer.equals("1"))
                {
                    this.addBook();
                }
                else if (answer.equals("2"))
                {
                    this.search();
                }
                else if(answer.equals("3"))
                {
                    this.listOfBooks();
                }
                else if(answer.equals("4"))
                {
                    this.returnBook();
                }
                else if(answer.equals("5"))
                {
                    running = false;
                }
                else
                {
                    System.out.println("Wrong input. Try again.");
                }
            }
            else
            {
                System.out.println("Wrong input. Try again.");
                scanner.nextLine();
            }
        }
    }

    private void addBook()
    {
        Book newBook = new Book();


        System.out.println("What book do you want to add?");
        System.out.println("Start with title:");
        newBook.setTitle(scanner.nextLine());

        System.out.println("Author:");
        newBook.setAuthor(scanner.nextLine());


        System.out.println("Year it was published:");
        newBook.setPublishingYear(scanner.nextInt());
        scanner.nextLine();

        System.out.println("What edition:");
        newBook.setEdition(scanner.nextInt());
        scanner.nextLine();

        books.add(newBook);
        System.out.println("Book has been added.");
    }
    private void search ()
    {
        String title;
        String answer;

        boolean running;

        System.out.println("What book are you looking for?");
        title = scanner.nextLine();

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title))
            {
                System.out.println("We've got that book");
                System.out.println("Do you wanna borrow said book?");
                running = true;
                while (running)
                {
                    answer = scanner.nextLine();
                    if (answer.equalsIgnoreCase("yes") && book.isAvailable() && !book.reserveQueue.isEmpty())
                    {
                        System.out.println("What is your name?");
                        String name = scanner.nextLine();
                        if(book.reserveQueue.getFirst().equalsIgnoreCase(name))
                        {
                            System.out.println("Book borrowed");
                            book.loanBook();
                            running = false;
                        }
                        else
                        {
                            System.out.println("The book is already reserved by someone else");
                            running = false;
                        }
                    }
                    else if (answer.equalsIgnoreCase("yes") && book.isAvailable() && book.reserveQueue.isEmpty())
                    {
                        System.out.println("Book has been borrowed");
                        book.loanBook();
                        running = false;
                    }
                    else if (answer.equalsIgnoreCase("yes") && !book.isAvailable())
                    {

                        System.out.println("Book isn't available as of now. \ndo you want to reserve it?");
                        answer = scanner.nextLine();
                        if (answer.equalsIgnoreCase("yes"))
                        {
                            System.out.println("Then type your name to reserve it.");
                            String name = scanner.nextLine();
                            book.reserve(name);
                            System.out.println("Book has been reserved.");
                        }
                        else
                        {
                            System.out.println("You're welcome to return when it's available");
                        }
                        running = false;
                    }
                    else if (answer.equalsIgnoreCase("no"))
                    {
                        System.out.println("Very well");
                        running = false;
                    }
                    else
                    {
                        System.out.println("Wrong input. Input either type: No/Yes ");
                    }
                }
            }
            else
            {
                System.out.println("We do not have that book");
            }
        }
    }
    public void listOfBooks()
    {
        for (Book book : books)
        {
           System.out.println(book.toString());
        }
    }
    public void returnBook()
    {
        String title;
        System.out.println("What book do you wanna return?");
        title = scanner.nextLine();
        for (Book book : books)
        {
            if (book.getTitle().equalsIgnoreCase(title))
            {
                book.returnBook();
                System.out.println("Thanks for returning the book.");
            }
            else
            {
                System.out.println("That's not one of our books");
            }
        }
    }
}
