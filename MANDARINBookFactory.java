class MANDARINBookFactory{
    public static Book buildBook(BookType type) {
        Book book = null;
        switch(type) {
            case PAPERBACK:
                book = new Paperback(Language.MANDARIN);
                break;
            case HARDCOVER:
                book = new Hardcover(Language.MANDARIN);
                break;
                
                default:
                break;
            }
            return book;
        }
}