public class Main {
    public static void main(String [] args) {
        SignedText st1 = new SignedText("", "Wong");
        String temp = st1.getSignature();
        SignedText st2 = new SignedText("henri", "dubois");
        temp = st2.getSignature();
        SignedText st3 = new SignedText("GRACE","LOPEZ");
        temp = st3.getSignature();
        SignedText st4 = new SignedText("", "FOX");
        String text = "Dear";
        temp = st4.addSignature(text);
        text = "Best wishesFOX";
        temp = st4.addSignature(text);
        text = "FOXThanks";
        temp = st4.addSignature(text); 
        text = "G-LOPEZHello";
        temp = st3.addSignature(text); 
    }
}
