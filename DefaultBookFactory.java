class DefaultBookFactory {
    public static Book buildBook(BookType type) {
        Book book = null;
        switch(type) {
            case PAPERBACK:
                book = new Paperback(Language.DEFAULT);
                break;
            case HARDCOVER:
                book = new Hardcover(Language.DEFAULT);
                break;
                
                default:
                break;
            }
            return book;
    }
}