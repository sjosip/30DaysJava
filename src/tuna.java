public class tuna {


    public void simpleMessage(){
        System.out.println("THIS IS A SIMPLE MESSAGE FROM ANOTHER CLASS");
    }

    public void sampleVirus(String letter){
        System.out.println("HELLO " + letter);
    }

    public void nextInt(int x){
        System.out.println(" X is : " + x);
    }


    private String girlName;

    //Constructor
    public tuna(String herName){
        girlName = herName;
    }

    public void setName(String herName) {
        girlName = herName;
    }

    public String getName() {
        return girlName;
    }
    public void saying() {
        System.out.printf("Your first gf name :%s\n", getName());
    }

    //Time class method
    private int hour;
    private int minute;
    private int second;

    public void setTimes(int h, int m, int s){
        hour = ((h >= 0 && h<24) ? h : 0);
        minute = ((m >= 0 && m<60) ? m : 0);
        second = ((s >= 0 && s<60) ? s : 0);
        //this key word-> use values not from the method then this ones
        // with key word this
        /*this.hour = 6;
        this.minute = 5;
        this.second = 3;*/

    }
    public String toMIlitaraTime1(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    //to regular time
    public String toRegularTime(){
        return String.format("%d:%02d:%02d %s",((hour == 0|| hour==12)?12:hour%12)
                ,minute,second,(hour<12? "AM":"PM"));
    }
//multiple overloading constructors
    public tuna() {
        this(0,0,0);

    }
    public tuna(int h){
        this(h,0,0);
    }
    public tuna(int h, int m){
        this(h,m,0);
    }
    public tuna(int h,int m,int s){
        setTime(h,m,s);
    }
    public void setTime(int h,int m,int s){
        setHour(h);
        setMinute(m);
        setSecond(s);
    }
    public void setHour(int h){
        hour = ((h >= 0 && h<24)? h:0);
    }
    public void setMinute(int m){
        minute = ((m >= 0 && m <60)? m :0);
    }
    public void setSecond(int s){
        second = ((s >= 0 && s < 60)? s : 0);
    }
    public int getHour(){
        return hour;
    }
    public int getMinutes(){
        return minute;
    }
    public int getSecond(){
        return second;
    }
    public String toMilitaryTime2(){
        return String.format("%02d:%02d:%02d", getHour(),getMinutes(),getSecond());
    }



}

