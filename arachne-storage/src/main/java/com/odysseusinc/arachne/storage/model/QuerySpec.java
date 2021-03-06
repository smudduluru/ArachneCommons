package com.odysseusinc.arachne.storage.model;

import java.util.Collection;

public class QuerySpec {

    private String path;
    private boolean searchSubfolders = false;
    private String name;
    private Boolean nameLike;
    private Collection contentTypes;

    public String getPath() {

        return path;
    }

    public void setPath(String path) {

        this.path = path;
    }

    public boolean isSearchSubfolders() {

        return searchSubfolders;
    }

    public void setSearchSubfolders(boolean searchSubfolders) {

        this.searchSubfolders = searchSubfolders;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public Boolean getNameLike() {

        return nameLike;
    }

    public void setNameLike(Boolean nameLike) {

        this.nameLike = nameLike;
    }

    public Collection getContentTypes() {

        return contentTypes;
    }

    public void setContentTypes(Collection contentTypes) {

        this.contentTypes = contentTypes;
    }
}
