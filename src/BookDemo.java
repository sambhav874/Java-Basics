public class BookDemo {

    private String Author;
    private String Title;
    private String Genre;
    private int numPages;
    public BookDemo(String Author,String Title,String Genre,int numPages){
        this.Author=Author;
        this.Title=Title;
        this.Genre=Genre;
        this.numPages=numPages;
    }
    public BookDemo(){
        this("The Godfather","Mario Puzo","Human Rights",602);
    }
    public String getAuthor(){
        return Author;
    }
    public String getTitle(){
        return Title;
    }
    public String getGenre(){
        return Genre;
    }

    public int getNumPages(){
        return numPages;
    }
}
