public class StringUtils {
    private String mainString;

    public StringUtils (String mainString){
        this.mainString = mainString;
    }

    public String getMainString() {
        return mainString;
    }

    public void setMainString(String mainString) {
        this.mainString = mainString;
    }

    public static char getFirstSymbolInString(String searchString){
        return searchString.charAt(0);
    }
    public static char getLastSymbolInString (String searchString){
        return searchString.charAt(searchString.length()-1);
    }

}
