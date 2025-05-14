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
        int where = this.getSignature().indexOf(word);
        String newmane = "";
        if(where > -1){
            if (where == 0){
                int howbig = word.lenght;

                String word = word(howbig);
                newmane += word + this.getSignature().substring(where);
                return newmane;
            }
            else{
                return this.getSignature();
            }
            

        }
        newmane = word+this.getSignature();
        return newmane;
        
    }

}
