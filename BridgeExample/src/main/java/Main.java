import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Manuscript> documents = new ArrayList<Manuscript>();
        FAQ faq = new FAQ("Nonsense questions", new ArrayList<String>(Arrays.asList("first question", "second question")));
        Book book = new Book("Another book", "whatever text fits as content because this is a small book", "me");
        Paper paper = new Paper("second year", "this is my master degree paper", "Smartest Ever");

        documents.add(faq);
        documents.add(book);
        documents.add(paper);

        BackwardsTextFormatter backwardsTextFormatter=new BackwardsTextFormatter();
        DoubleCharacterFormatter doubleFormatter=
                new DoubleCharacterFormatter();
        for (Manuscript docs: documents) {
            docs.Print(doubleFormatter);
            System.out.println();
        }

        // print the manuscripts backward, so that you can read them in the mirror
    }
}
