public class Poetry {
    private String title;
    private String poet;
    private String style;

    public Poetry(String title, String poet, String style){
        this.title = title;
        this.poet = poet;
        this.style = style;
    }

    public void setStyle(String style){
        if(style.equals("lyric poem")||style.equals("sonnet")||style.equals("free verse")||style.equals("terza rima")||style.equals("couplet")||style.equals("ballad")){
            this.style=style;
        } else {
            this.style = "Not valid";
        }

    }
    public String getTitle(){
        return title;
    }
    public String getStyle(){
        return style;
    }
    public String getPoet(){
        return poet;
    }

    public void setTitle(String title){
        this.title=title;
    }
    public void setPoet(String poet) {
        this.poet = poet;
    }

}
