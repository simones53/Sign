public class Sign {
    private String msg;
    private int w;
    public Sign(String message, int width) {
        msg = message;
        w = width;
    }
    public int numberOfLines() {
        int lines = 0;
        int temp = msg.length();
        while(temp > 0) {
            lines++;
            temp -= w;
    }
        return lines;
    }
    public String getLines() {
        String res = "";
        int len = msg.length();
        int mult = 0;
        if(msg.equals("")) return null;
        if(len > w) {
            for(int i = 0; i < numberOfLines()-1; i++) {
                res += msg.substring(i*w, (i+1)*w) + ";";
                mult++;
            }
        }
        res += msg.substring(mult*w, msg.length());
        return res;
    }
}