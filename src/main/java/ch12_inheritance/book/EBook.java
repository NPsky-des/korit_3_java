package ch12_inheritance.book;

public class EBook extends Book {
    public EBook(String title, String author) {
        super(title, author);
    }

    private double fileSize;
    private double format;



    @Override
    public String getTitle() {
        return super.getTitle();
    }

    @Override
    public void setTitle(String title) {
        super.setTitle(title);
    }

    @Override
    public String getAuthor() {
        return super.getAuthor();
    }

    @Override
    public void setAuthor(String author) {
        super.setAuthor(author);
    }

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    public double getFormat() {
        return format;
    }

    public void setFormat(double format) {
        this.format = format;
    }

    public void displayInfo() {
        System.out.println("제목 : " + this.getTitle());
        System.out.println("저자 : " + this.getAuthor());
        System.out.println("파일 크기 : " + fileSize + "MB");
        System.out.println("파일 형식 : " + format);
    }

}
