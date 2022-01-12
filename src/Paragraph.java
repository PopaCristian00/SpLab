import java.util.LinkedList;
import java.util.List;

public class Paragraph extends Element implements Visitee {
    private String text;
    private AlignStrategy textAlignment;

    public Paragraph(String text) {
        this.text = text;
    }

    public void print() {
        System.out.println("Paragraph: " + this.text);
    }

    public void render() {
        System.out.println("Paragraph: " + this.text);
    }

    @Override
    public void add(Element el) {
    }

    @Override
    public void remove(Element el) {
    }

    @Override
    public Element get(int num) {
        return null;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setAlignStrategy(AlignStrategy alst) {
        this.textAlignment = alst;
        setText(alst.render(this.text));
    }

    public AlignStrategy getTextAlignment() {
        return textAlignment;
    }

    public String getText() {
        return text;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}