/**
 * List if of keywords that are supported by commands and .
 */
public enum Keyword{

    QUIT("quit", "Exits from command-line interface.");
 
    private String keyword;
    private String description;

    private Keyword(String keyword, String description){
        this.keyword = keyword;
        this.description = description;
    }
  
}