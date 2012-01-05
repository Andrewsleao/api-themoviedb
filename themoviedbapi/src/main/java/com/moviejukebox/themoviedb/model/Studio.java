/*
 *      Copyright (c) 2004-2012 YAMJ Members
 *      http://code.google.com/p/moviejukebox/people/list 
 *  
 *      Web: http://code.google.com/p/moviejukebox/
 *  
 *      This software is licensed under a Creative Commons License
 *      See this page: http://code.google.com/p/moviejukebox/wiki/License
 *  
 *      For any reuse or distribution, you must make clear to others the 
 *      license terms of this work.  
 */
package com.moviejukebox.themoviedb.model;

import java.io.Serializable;

/**
 *  Studio from the MovieDB.org
 *  
 *  @author Stuart.Boston
 *
 */
public class Studio implements Serializable {
    private static final long serialVersionUID = 1L;

    private static final String UNKNOWN = MovieDB.UNKNOWN;

    private String name = UNKNOWN;
    private String url = UNKNOWN;
    private String id = UNKNOWN;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[Studio=[name=");
        builder.append(name);
        builder.append("][url=");
        builder.append(url);
        builder.append("][id=");
        builder.append(id);
        builder.append("]]");
        return builder.toString();
    }
}
