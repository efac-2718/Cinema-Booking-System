public class Movie {

    private String name;
    private int duration;
    private String date;
    private String time;
    private Screen screen = new Screen("K-zone","Kandana",4, 2000,10,10);

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

    public Screen getScreen(){
        return screen;
    }

    public double getPrice(){
        Screen screen1 = getScreen();
        return screen1.getPrice();
    }


}

