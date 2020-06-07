package sda.lekcja04_2;
import java.util.Date;
import java.util.List;

public class Note {
    private String memo;
    private Date date;
    private static int idGlobal;
    private int id;
    private List<String> tags;

    public Note() {
    }

    public Note(String memo, List<String> tags) {
        this.memo = memo;
        this.tags = tags;
        this.date = new Date();
        idGlobal++;
        this.id = idGlobal;

    }

    public boolean match (String word){
        boolean ifContains = false;
        if (memo.contains(word)){
            ifContains = true;
        } else if (tags.contains(word)){
            ifContains = true;
        }
        return ifContains;

    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

}

