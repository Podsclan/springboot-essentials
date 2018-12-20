package br.com.brendowpodsclan.sith.model;

import org.springframework.stereotype.Component;

@Component
public class Author {

    private int id;
    private String name;
    private String birth;


    public Author(String name, String birth) {
        this.name = name;
        this.birth = birth;
    }

    public Author(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Author() {
    }


    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

}
