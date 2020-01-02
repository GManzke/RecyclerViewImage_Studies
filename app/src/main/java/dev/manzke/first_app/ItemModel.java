package dev.manzke.first_app;

public class ItemModel {

    String name;
    String about;

    public ItemModel (String name, String about){
        this.name = name;
        this.about = about;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    @Override
    public String toString() {
        return "ItemModel{" +
                "name='" + name + '\'' +
                ", about='" + about + '\'' +
                '}';
    }
}
