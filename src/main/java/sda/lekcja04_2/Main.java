package sda.lekcja04_2;

/*
Ćwiczenie 1:

Napisz klasę "Note", reprezentującą notatkę z tablicę (dla ambitnych listą) tagów ("tags")" i datą utworzenia.
Notaka powinna ponadto mieć swoją zawartość (String memo)
Dodaj metodę "match". Metoda "match" powinna przeszukiwać zawartość notatki oraz listę tagów i zwracać true lub false,
w zalezności od tego czy znalazło podany string. (Wykorzystać metody klasy String)
Notatki powinny mieć unikalny numer zaczynając od 1.
Użyj do tego zmiennej statycznej którą będziesz inkrementować. (Coś podobnego już robiliśmy na zajęciach wspólna dla wszystkich Notek,
zwiększa się o 1 dla każdej notki i przypisuję tą zwiększoną wartość o 1)
Dla spróbuj użyć typu Date dostarczonego przez Javę.

Ćwiczenie 2:
Napisz następnie klasę Notebook, która posiada tablicę "notes" (jeśli ktoś umie to listę) obiekty typu Note. Klasa powinna mieć następujące metody
- new_note - tworzy nową notatkę o podanej zawartości memo oraz liście tagów tags i  dodaje do listy notes,
- modify_memo - nadpisuje zawartość notatki od numerze "note_id" podanym Stringiem memo,
- modify_tags analogicznie  jak powy ̇zej tylko, ̇ze nadpisuje tagi
- search zwraca listę notatek, dla których wywołanie ich metody match z argumentem filter zwróciło true
 */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> tags1 = new ArrayList();
        tags1.add("school");
        tags1.add("health");

        List<String> tags2 = new ArrayList<>();
        tags2.add("education");
        tags2.add("politics");

        List<String> tags3 = new ArrayList<>();
        tags3.add("home");
        tags3.add("sport");

        Note note1 = new Note("There is no tuesday this week",tags1);
        Note note2 = new Note("Let's play the game",tags2);

        Notebook notebook1 = new Notebook(note1);
        notebook1.addNewNote(note2);
        System.out.println(notebook1.notes);
        notebook1.setMemo("Let's play on tuesday",1);
        System.out.println(notebook1.notes.get(0).getMemo());
        System.out.println(notebook1.notes.get(1).getMemo());
        notebook1.setTags(tags3,1);
        System.out.println(notebook1.notes.get(0).getTags());
        System.out.println(notebook1.notes.get(1).getTags());
        List<Note> searched1 = notebook1.search("tuesday");








































    }
}
