public class Main {

    public static void main(String[] args){
        Shoe s = new Shoe("Nike",10);
        Walking w = new Walking(true,"Nike",10);
        Running r = new Running(4.5,"Nike", 10);
        System.out.println(s.brand);
        System.out.println(w.brand);
        System.out.println(w.goreTex);
        System.out.println(r.weight);
    }


}
