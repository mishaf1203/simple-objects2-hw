public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Lev", "Tolstoy");
        Book book1 = new Book("War and peace", 111, author1);

        Author author2 = new Author("Alex", "Pushkin");
        Book book2 = new Book("Winter Road", 1703, author2);


        System.out.println("Год издания книги " + book1.getName()+ " - "+ book1.getYear()+ "; Автор книги "+ book1.getAuthor().getName()+ " "+ book1.getAuthor().getSurname());
        System.out.println("Год издания книги " + book2.getName()+ " - "+ book2.getYear()+ "; Автор книги "+ book2.getAuthor().getName()+ " "+ book2.getAuthor().getSurname());

        book1.setYear(1933);
        System.out.println("Год издания книги " + book1.getName()+ " - "+ book1.getYear()+ "; Автор книги "+ book1.getAuthor().getName()+ " "+ book1.getAuthor().getSurname());



        System.out.println(book1.toString());
        System.out.println(book1.equals(book2));


    }

}