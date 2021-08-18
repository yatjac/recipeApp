package edu.txstate.jpl77;

public class instructor extends Person {
    private String getTitle() {
    return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String title;

    public String welcome(){
        return "Hi, I am" + title + " " + getName() + ".";
    }
}
