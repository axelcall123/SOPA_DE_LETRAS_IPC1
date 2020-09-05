package sopadeletras;
public class Palabras {
   private String word;
  
   public Palabras(){
        word="";
    }
    public Palabras(String w){
        word=w;
    }
    //////////////////////////////
    public String getword(){
        return word;
    }
    public void setword(String word){
        this.word=word;  
    }
}
