abstract class Book {
    Book(BookType type, Language language) {
        this.type = type;
        this.language = language;
    }
    
    abstract void construct();
    
    BookType type = null;
    Language language = null;
    
    BookType getType() {
        return type;
    }
    
    void setType(BookType type) {
        this.type = type;
    }
    
    Language getLanguage() {
        return language;
    }
    
    void setLanguage(Language language) {
        this.language = language;
    }
    
    @Override
    public String toString() {
        return "Book type = "+type + ". Language = "+language;
    }
}