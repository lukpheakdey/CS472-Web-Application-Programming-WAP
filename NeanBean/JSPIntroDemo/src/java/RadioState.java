/**
 * @author lukpheakdey
 */

public class RadioState {
    String yesCheck;
    String noCheck;
    
    public RadioState(){
        this.yesCheck = "";
        this.noCheck = "";
    }
    
    public String getYesCheck(){
        return yesCheck;
    }
    
    public String getNoCheck(){
        return noCheck;
    }
    
    public void setYesCheck(String yesCheck){
        this.yesCheck = yesCheck;
    }
    
    public void setNoCheck(String noCheck){
        this.noCheck = noCheck;
    }
}
