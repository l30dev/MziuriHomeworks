package Serialization2;

import java.io.Serializable;

public class Book implements Serializable {
    private  String title;
    private String author;
    private String idCode;
    private boolean isCheckedOut;

    public Book(String title, String author, String idCode, boolean isCheckedOut) {
        this.title = title;
        this.author = author;
        this.idCode = idCode;
        this.isCheckedOut = isCheckedOut;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIdCode() {
        return idCode;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        this.isCheckedOut = checkedOut;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", idCode='" + idCode + '\'' +
                ", isCheckedOut=" + isCheckedOut +
                '}';
    }
}
