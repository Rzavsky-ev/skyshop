package org.skypro.skyshop.model.search;

import java.util.UUID;

public interface Searchable {
    String getSearchTerm();

    String getContentType();

    UUID getId();

    default String getStringRepresentation() {
        return "имя объекта " + getSearchTerm() + "-тип объекта " + getContentType();
    }
}