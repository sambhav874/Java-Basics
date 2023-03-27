
public class Book {
    public static void main(String[] args) {

        BookDemo GameOfThrones = new BookDemo("George R. Martin", "Game Of Thrones", "Fantasy", 694);
        BookDemo TheGodfather = new BookDemo("Mario Puzo", "The Godfather", "Human Rights and Mafia", 602);
        BookDemo ToKillAMockingBird = new BookDemo("Harper Lee", "To Kill A MockingBird", "Human Rights", 331);

        System.out.println("This book "+GameOfThrones.getTitle()+" is a "+GameOfThrones.getGenre()+" novel "+" written by "+GameOfThrones.getAuthor()+" and is of "+GameOfThrones.getNumPages()+" pages.");
        System.out.println("This book "+TheGodfather.getTitle()+" is a "+TheGodfather.getGenre()+" novel "+" written by "+TheGodfather.getAuthor()+" and is of "+TheGodfather.getNumPages()+" pages.");
        System.out.println("This book "+ToKillAMockingBird.getTitle()+" is a "+ToKillAMockingBird.getGenre()+" novel "+" written by "+ToKillAMockingBird.getAuthor()+" and is of "+ToKillAMockingBird.getNumPages()+" pages.");
    }

}
