public class Profile {
    //instance variables
    Person p;
    Image [] images = new Image[3];

    //constructor
    Profile(Person p, Image [] images ) {
         this.p = p;
        this.images = images;
        

    }

    //method

    //setters
    public void setP(Person p) {
        this.p = p;
    }

    public void setImages(String Image [] images) {
        this.images = images;
    }

    //getters
    public Person getPerson(){
        return this.p;
    }

    public Image[] getImages() {
        return  this.images;
    }

}
*/