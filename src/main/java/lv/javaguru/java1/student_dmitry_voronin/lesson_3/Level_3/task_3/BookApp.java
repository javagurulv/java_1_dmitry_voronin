package lv.javaguru.java1.student_dmitry_voronin.lesson_3.Level_3.task_3;


public class BookApp {
    public static void main(String[] args) {
        Book book1 = new Book("Columbus and Other Cannibals", "Jack D. Forbes", 1978, "chapter1", "chapter2");
        Chapter chapter1 = new Chapter("The Genesis of the Universe", "text");
        Chapter chapter2 = new Chapter("Cannibal and Hero", "text");

        System.out.println("Book title: " + book1.getTitle() + " Author " + book1.getAuthor() + " release year: " + book1.getReleaseYear() + "Chapter1 " + book1.getChapter1() + "chapter2 " + book1.getChapter2());
        System.out.println("Chapte: " + chapter1.getTitle() + "text: " + chapter1.getText());


        Book book2 = new Book("A Historical Geography of China", "Yi-Fu Tuan", 2008, "chapter2", "chapter2");
        Chapter chapter3 = new Chapter("Early regional development", "text");
        Chapter chapter4 = new Chapter("The Period of Disunion", "text");

        System.out.println("Book title: " + book2.getTitle() + " Author " + book2.getAuthor() + " release year: " + book2.getReleaseYear() + "Chapter1 " + book2.getChapter1() + "chapter2 " + book2.getChapter2());
        System.out.println("Chapte: " + chapter2.getTitle() + "text: " + chapter2.getText());
    }
}

