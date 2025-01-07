public class Movie {

    private String name;
    private int duration;
    private String date;
    private String time;
    private Screen screen = new Screen("K-zone","Kandana",4);

    public Movie(String name,int duration,String date,String time){
        this.name = name;
        this.duration = duration;
        this.date = date;
        this.time = time;

    }

    public String getDate(){
        return date ;
    }

    public String getTime(){
        return time;
    }

    public String getName(){
        return name;
    }

    public int getDuration(){
        return duration;
    }

}
