package sda.lekcja04_2;
import java.util.ArrayList;
import java.util.List;

public class Notebook {
    public List<Note> notes;

    public Notebook(Note note) {
        notes = new ArrayList<>();
        addNewNote(note);

    }

    public void addNewNote(Note note){
        notes.add(note);
    }

    public void setMemo(String memo, int id){
        notes.get(id).setMemo(memo);
    }

    public void setTags(List<String> tags, int id){
        notes.get(id).setTags(tags);
    }

    public List<Note> search(String word){
        List<Note> score = new ArrayList<>();
        for (int i = 0; i < notes.size(); i++) {
            if (notes.get(i).match(word)){
                score.add(notes.get(i));
            }
        }
        return score;
    }


}
