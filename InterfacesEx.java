package abc;
interface Camera{
    void takeSnap();
    void takeVideo();
}
interface Music{
    void playMusic();
    String[] showPlaylist();
}
interface Game{
    void playGame();
    default void screenOrientation(){
        System.out.println("Game is being played in landscape mode");
    }
}
interface Calculator{
    private int add(int a,int b){
        return a+b;
    }
    default void calc(int a,int b){
        System.out.println(add(a,b));
    }
}
class SmartPhone implements Camera,Music,Game,Calculator{
    public void takeSnap(){
        System.out.println("Taking Snap");
    }
    public void takeVideo(){
        System.out.println("Taking Video");
    }
    public void playMusic(){
        System.out.println("Playing Music");
    }
    public String[] showPlaylist(){
        String[] ar={"Kabhi jo badal barse","Carol of the bells"};
        return ar;
    }
    public void playGame(){
        System.out.print("Playing Game");
    }
}
class InterfacesEx{
    public static void main(String[] args){
        SmartPhone objectPhone=new SmartPhone();
        objectPhone.takeSnap();
        objectPhone.screenOrientation();
        objectPhone.calc(6, 7);
        
    }

}