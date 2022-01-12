import java.util.LinkedList;
import java.util.List;

public class Book extends Section implements Visitee {
    String title;
    List<Author> authorList = new LinkedList<>();
    List<Element> elementList = new LinkedList<>();

    public Book(String title) {
        super(title);
        this.title = title;
    }

    public void addContent(Element el) {
        this.elementList.add(el);
    }

    public void addAuthor(Author author) {
        this.authorList.add(author);
    }

    @Override
    public void print() {
        System.out.println("Book: " + this.title + "\n");

        System.out.println("Authors:");
        for (Author aut : authorList) {
            aut.print();
        }

        System.out.println();

        for (Element el : elementList) {
            el.print();
        }
    }

    public void render() {
        System.out.println("Book: " + this.title + "\n");

        System.out.println("Authors:");
        for (Author aut : authorList) {
            aut.print();
        }

        System.out.println();

        for (Element el : elementList) {
            el.print();
        }
    }

    public List<Author> getAuthor() {
        return this.authorList;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (Element el : elementList) {
            el.accept(visitor);
        }
    }
}