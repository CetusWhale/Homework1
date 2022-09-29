public class Application {
    public static void main(String[]args){
        Poetry poem1 = new Poetry("Stopping by Woods on a Snowy Evening", "Robert Frost", "lyric poem");
        Poetry poem2 = new Poetry("Sonnet 18","William Shakespeare", "sonnet");

        poem1.setStyle("free verse");
        System.out.println(poem1.getTitle());
    }
}
