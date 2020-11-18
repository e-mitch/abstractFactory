class ENGLISHBookFactory{
    static Book buildBook(BookType type) {
        Book book = null;
        switch(type) {
            case PAPERBACK:
                book = new Paperback(Language.ENGLISH);
                break;
            case HARDCOVER:
                book = new Hardcover(Language.ENGLISH);
                break;
            
                default:
                break;
            }
            return book;
        }
}