package Memento;

//The Memento class (The actual state of Document)
public class DocumentState {
    public final String content;
    public final String fontName;
    public final int fontSize;

    //Constructor
    public DocumentState(String content, String fontName, int fontSize) {
        this.content = content;
        this.fontName = fontName;
        this.fontSize = fontSize;
    }

    //Getter Methods
    //No setters because we shouldn't modify a state once it is created.
    public String getContent() {
        return content;
    }



    public String getFontName() {
        return fontName;
    }


    public int getFontSize() {
        return fontSize;
    }

}
