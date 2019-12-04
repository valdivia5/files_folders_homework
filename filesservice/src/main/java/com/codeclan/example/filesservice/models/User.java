package com.codeclan.example.filesservice.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @JsonIgnore
    @OneToMany(mappedBy = "user_id")
    private List<Folder> listOfFolders;

    public User(String name) {
        this.name = name;
        this.listOfFolders = new ArrayList<>();
    }

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Folder> getListOfFolders() {
        return listOfFolders;
    }

    public void setListOfFolders(List<Folder> listOfFolders) {
        this.listOfFolders = listOfFolders;
    }

    public void addFolder(Folder folder) {
        this.listOfFolders.add(folder);
    }



}
