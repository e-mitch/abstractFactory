class AbstractDesign{
    public static void main(String[] args) {
        System.out.println(BookFactory.buildBook(BookType.PAPERBACK));
        System.out.println(BookFactory.buildBook(BookType.HARDCOVER));
    }
}