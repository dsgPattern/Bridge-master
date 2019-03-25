public class BackwardsTextFormatter implements IFormatter {
    public String FormatText(String text) {
        String backwardsText="";
        for(int i= text.length()-1; i>=0;i--)
        {
            backwardsText+=text.charAt(i);
        }

        return backwardsText;
    }
}
