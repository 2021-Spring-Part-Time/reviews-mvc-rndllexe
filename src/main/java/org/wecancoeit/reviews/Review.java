package org.wecancoeit.reviews;

public class Review {

    private Long id;
    private Long year;
    private Long rank;
    private String album;
    private String content;
    private String img;

    public Long getId() {
        return id;
    }

    public Long getYear() {
        return year;
    }

    public String getAlbum() {
        return album;
    }

    public String getContent() {
        return content;
    }

    public String getImg() {
        return img;
    }

    public Long getRank() {
        return rank;
    }

    public Review(long id, String album, String content, long year, long rank, String img) {
        this.id = id;
        this.album = album;
        this.content = content;
        this.year = year;
        this.rank = rank;
        this.img = img;
    }

}
