package com.appspot.model.entity;

//import com.framework.util.validator.constraints.NotNull;
//import com.framework.util.validator.constraints.XSSFilter;
import java.io.Serializable;
import java.util.Date;
import org.hibernate.search.annotations.DateBridge;
import org.hibernate.search.annotations.DocumentId;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Index;
import org.hibernate.search.annotations.Indexed;
import org.hibernate.search.annotations.Resolution;
import org.hibernate.search.annotations.Store;
// generator:imports

@Indexed
public class Movie implements Serializable {
    @DocumentId
    private int id;

//    @DocumentId
//    private Long id;

    @Field(index=Index.NO, store=Store.YES)
    @DateBridge(resolution=Resolution.SECOND)
    private Date date;

    @Field(index=Index.YES,store=Store.YES)
    private String title;

    @Field(index=Index.YES,store=Store.YES)
    private String genre;

    @Field(index=Index.YES,store=Store.YES)
    private String url;

    @Field(index=Index.YES,store=Store.YES)
    private String catalogNo;

    @Field(index=Index.YES,store=Store.YES)
    private String upc;

    // generator:attributes
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }

//    @NotNull
//    @XSSFilter
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

//    @NotNull
//    @XSSFilter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

//    @NotNull
//    @XSSFilter
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

//    @NotNull
//    @XSSFilter
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

//    @NotNull
//    @XSSFilter
    public String getCatalogNo() {
        return catalogNo;
    }

    public void setCatalogNo(String catalogNo) {
        this.catalogNo = catalogNo;
    }

//    @NotNull
//    @XSSFilter
    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    // generator:methods
}