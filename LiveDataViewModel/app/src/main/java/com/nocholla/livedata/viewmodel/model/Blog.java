package com.nocholla.livedata.viewmodel.model;

import com.google.gson.annotations.SerializedName;

public class Blog {

    @SerializedName("author")
    private String author;
    @SerializedName("description")
    private String description;
    @SerializedName("link")
    private String link;
    @SerializedName("pubDate")
    private String pubDate;
    @SerializedName("thumbnail")
    private String thumbnail;
    @SerializedName("title")
    private String title;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}


/*
{
  "status": "ok",
  "error":false,
  "message":"RSS feed found",
  "data": [
   {
      "title": "Person using laptop computer beside aloe vera",
      "pubDate": "2019-02-09 11:22:31",
      "link": "https://images.unsplash.com/photo-1487611459768-bd414656ea10?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=400&q=60",
      "author": "admin",
      "thumbnail": "https://images.unsplash.com/photo-1487611459768-bd414656ea10?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=400&q=60",
      "description": "If you are looking at what type of laptops you will need for your business, then you'd better check with the best Computer stores near you."
    },
   {
      "title": "MacBook Pro on table beside white iMac and Magic Mouse",
      "pubDate": "2019-02-09 11:22:31",
      "link": "https://images.unsplash.com/photo-1499951360447-b19be8fe80f5?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=400&q=60",
      "author": "admin",
      "thumbnail": "https://images.unsplash.com/photo-1499951360447-b19be8fe80f5?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=400&q=60",
      "description": "When you are developing professional-level android application, you'd better use Apple products because they are the best in the market but quite expensive too."
    },
   {
      "title": "Space gray iPhone X beside turned on laptop beside coffee and succulent plant",
      "pubDate": "2019-02-09 11:22:31",
      "link": "https://images.unsplash.com/photo-1512486130939-2c4f79935e4f?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=400&q=60",
      "author": "admin",
      "thumbnail": "https://images.unsplash.com/photo-1512486130939-2c4f79935e4f?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=400&q=60",
      "description": "Apple products are the best in the market. Go get yourself an iPhone to test this out. You will not be surprised. Samsung Galaxy Android phone is the closest to iPhones on the Android side and is a bargain when compared to iPhones."
    }]
}
 */
