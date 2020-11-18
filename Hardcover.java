class Hardcover extends Book {
    Hardcover(Language language) {
        super(BookType.HARDCOVER, language);
        construct();
    }
    @Override
    protected void construct() {
        System.out.println("Connecting to Hardcover");
    }
}