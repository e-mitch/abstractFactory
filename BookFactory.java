class BookFactory {
    private BookFactory() {
    }
    public static Book buildBook(BookType type) {
        Book book =  null;
        //for the sake of the example, I'm just setting the language to English here. 
        //in real life, we'd want to detect the language based on the user's browser language, for example, so the user doesn't have to input it.
        Language language = Language.ENGLISH;
        switch(language) {
            case ENGLISH:
                book = ENGLISHBookFactory.buildBook(type);
                break;
            case MANDARIN:
                book = MANDARINBookFactory.buildBook(type);
                break;
            default:
                book = DefaultBookFactory.buildBook(type);
            }
            return book;
        }
    }
 