import java.util.ArrayList;

public class FAQ implements Manuscript {
    private String _title;
    private ArrayList<String> _questions;

    public FAQ(String title, ArrayList<String> questions) {
        _title = title;
        _questions = questions;
    }

    public String getTitle() {
        return _title;
    }

    public ArrayList<String> getQuestions() {
        return _questions;
    }

    public void Print(IFormatter formatter) {
        System.out.println(formatter.FormatText(_title + ":"));
        for (String question : _questions) {
            System.out.println(formatter.FormatText(question));
        }
    }
}