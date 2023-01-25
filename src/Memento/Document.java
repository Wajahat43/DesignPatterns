package Memento;

//The Originator Class (whose state we want to store)
public class Document {
    public String content;
    public String fontName;
    public int fontSize;

    /***
     * Method returns the currentStae
     * @return DocumentState the current stae of document
     */
    public DocumentState createState(){
        return new DocumentState(content,fontName,fontSize);
    }

    /***
     * Takes the state and sets the contents of the document to this state.
     * @param state
     */
    public void restoreState(DocumentState state){
        content = state.getContent();
        fontName = state.getFontName();
        fontSize = state.getFontSize();
    }

    //Constructor
    public Document(String content, String fontName, int fontSize) {
        this.content = content;
        this.fontName = fontName;
        this.fontSize = fontSize;
    }

    //Getter And setter methods
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }
}
