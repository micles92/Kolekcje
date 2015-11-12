package com.micles92;

import com.sun.org.apache.xml.internal.utils.StringToStringTable;

/**
 * Created by Bolesław on 2015-11-12.
 */
public class Book implements Comparable<Book> {

    private int nrId;
    private String tytul;
    private String autor;


    public Book(){

    }

    public Book(int nrId, String tytul, String autor){
        this.nrId = nrId;
        this.tytul = tytul;
        this.autor = autor;
    }

    public int getNrId(){
        return nrId;
    }
    public void setNrId(int nrId){
        this.nrId = nrId;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String toString(){
        return nrId +", " +  autor +", "+ tytul;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (nrId != book.nrId) return false;
        if (!autor.equals(book.autor)) return false;
        if (!tytul.equals(book.tytul)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nrId;
        result = 31 * result + tytul.hashCode();
        result = 31 * result + autor.hashCode();
        return result;
    }

    @Override
    public int compareTo(Book o) {

        if(this.nrId < o.nrId) return 1;
        else if(this.nrId > o.nrId) return -1;
        else {
            return 0;
        }
    }
}


