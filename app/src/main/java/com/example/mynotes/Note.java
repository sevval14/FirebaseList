package com.example.mynotes;
import com.google.firebase.Timestamp;
import com.google.firebase.firestore.Exclude;
public class Note {
    @Exclude
    private String id;
    private String content;
    private Timestamp date;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }
}
