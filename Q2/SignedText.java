public class SignedText{
    private String fn;
    private String ln;

    public SignedText(String first, String last){
        fn = first;
        ln = last;
    }

    public String getSignature(){
        int howbig = fn.lenght;
        String show = "";
        if(howbig > 0){
            show += howbig.substring(0,1);
            show += "-"+ln;
            return show;


        }
        show += ln;
        return show;
    }
    public String addSignature(String word){
      
        
    }

}
