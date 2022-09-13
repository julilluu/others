import java.time.Instant;

public class Note {
    private final String name;
    private String text;
    private final String author;
    private final Instant creationDate;
    private Instant updateDate;

    public Note(String name, String text){
        this.name = name; //исползует переменную, которая определеа в классе
        this.text = text;

        author = null;
        creationDate = Instant.now(); //ctr+b провалиться в подсказку. Learning the shortcuts!!!
        //javaDoc
    }

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
        this.updateDate = Instant.now();
    }

    public Instant getCreationDate() {
        return creationDate;
    }

    public Instant getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Instant updateDate) {
        this.updateDate = updateDate;
    }

    public String getAuthor() {
        return author;
    }
}
