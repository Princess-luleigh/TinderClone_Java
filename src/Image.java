public class Image {


    private String url;
    private String description;
    private String title;
    //private String tags;

       // constructor
       Image(String url, String description, String title, String tags) {
        this.url = url;
        this.description = description;
        this.title = title;
        //this.tags = tags;
    }

    public Image(String datum, String datum1, String datum2) {
    }

    // setters
     public void setUrl(String url) {
        this.url = url;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    //public void setTags(String tags) {
     //   this.tags = tags;
   // }


    // getters
    public String getUrl() {
        return this.url;
    }

    public String getDescription() {
        return this.description;
    }

    public String getTitle() {
        return this.title;
    }

    //public String getTags() {
        //return this.tags;
   // }

}