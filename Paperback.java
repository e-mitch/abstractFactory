class Paperback extends Book {
    Paperback(Language language) {
        super(BookType.PAPERBACK, language);
        construct();
    }
    @Override
    protected void construct() {
        System.out.println("Connecting to paperback");
    }
}