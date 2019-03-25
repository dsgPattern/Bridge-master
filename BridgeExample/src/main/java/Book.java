public class Book implements Manuscript {
    private String _title, _text, _author;

    public Book(String title, String text, String author) {
        _title = title;
        _text = text;
        _author = author;
    }

    public String getTitle() {
        return _title;
    }

    public String getText() {
        return _text;
    }

    public String getAuthor() {
        return _author;
    }

    public void Print(IFormatter formatter) {
        System.out.println(formatter.FormatText("=====" + _title + "====="));
        System.out.println(formatter.FormatText("            by " + _author));
        System.out.println(formatter.FormatText(_text));
    }
}