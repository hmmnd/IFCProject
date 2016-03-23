package excelwriter;

private List<Book> getListBook() {
    Book book1 = new Book("Head First Java", "Kathy Serria", 79);
    Book book2 = new Book("Effective Java", "Joshua Bloch", 36);
    Book book3 = new Book("Clean Code", "Robert Martin", 42);
    Book book4 = new Book("Thinking in Java", "Bruce Eckel", 35);
 
    List<Book> listBook = Arrays.asList(book1, book2, book3, book4);
 
    return listBook;
}
