public class Author {
    public String AuthorName;
    public String AuthorBio;
    Book b = new Book();

    public Author(String authorName, String authorBio, Book book){
        AuthorName=authorName;
        AuthorBio= authorBio;
        this.Book= book;
    }

    @Override
    public String toString() {
        return "Author{" +
                "AuthorName='" + AuthorName + '\'' +
                ", AuthorBio='" + AuthorBio + '\'' +
                ", book=" + Book +
                '}';
    }
}

// Book b = new Book("", "");

Author a = new Author("","", b);