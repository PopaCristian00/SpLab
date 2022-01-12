public interface Visitor {
    void visit(Book book);

    void visit(Section section);

    void visit(TableOfContents tableOfContents);

    void visit(Paragraph paragraph);

    void visit(ImageProxy imageProxy);

    void visit(Table table);

    void visit(Image image);
}