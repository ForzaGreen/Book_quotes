package izydor.eurecom.fr.book_quotes;

public class Quote {

    private final String real_quote;
    private final String author;
    private final String title;
    private final String language_of_a_quote;
    private final String type_of_a_book;
    private final int year;

    public Quote(){
        this.author = "";
        this.real_quote="";
        this.title="";
        this.language_of_a_quote="";
        this.type_of_a_book="";
        this.year=1939;
    }
    public Quote(String real_quote,String author,String title,String language_of_a_quote,String type_of_a_book,int year) {
        this.author = author;
        this.real_quote=real_quote;
        this.title=title;
        this.language_of_a_quote=language_of_a_quote;
        this.type_of_a_book=type_of_a_book;
        this.year=year;
    }


    public String getAuthor() { return author; }
    public String getReal_quote() { return real_quote; }
    public String getTitle() { return title; }
    public String getLanguage_of_a_quote() {return language_of_a_quote;}
    public String getType_of_a_book() {return  type_of_a_book;}
    public int getYear() {return year;}

}

class Quote_propereties extends Quote {

    private int likes;

    public Quote_propereties (Quote q){
        super(q.getReal_quote(),q.getAuthor(),q.getTitle(),q.getLanguage_of_a_quote(),q.getType_of_a_book(),q.getYear());
        this.likes=0;
    }

    //Here later additional methods like I wrote on a page 3 quote detailed view
    //like "like on facebook", buy on amazon, show desription of a book show another quotes etc.

}