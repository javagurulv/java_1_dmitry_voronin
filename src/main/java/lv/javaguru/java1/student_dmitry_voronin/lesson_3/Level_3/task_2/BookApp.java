package lv.javaguru.java1.student_dmitry_voronin.lesson_3.Level_3.task_2;

public class BookApp {
    public static void main(String[] args) {
        Book book1 = new Book("Columbus and Other Cannibals","Jack D. Forbes",1978,"chapter1","chapter2");
        Chapter chapter1 = new Chapter("The Genesis of the Universe","text");
        Chapter chapter2 = new Chapter("Cannibal and Hero","text");

        Book book2 = new Book("A Historical Geography of China","Yi-Fu Tuan",2008,"chapter2","chapter2");
        Chapter chapter3 = new Chapter("Early regional development","text");
        Chapter chapter4 = new Chapter("The Period of Disunion","text");

    }
}
