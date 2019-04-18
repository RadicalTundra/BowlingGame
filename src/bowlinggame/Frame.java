package bowlinggame;

public class Frame {
    
    //array of rolls whcih can just be ints
    //keep track of which ones are strikes, so maybe make a roll class to check that
    //then if the last one is a strike/spare, add the current roll onto the strike/spare
    //also check if two rolls ago it is a strike, as we need to add that one too
    private int score;
    //move these into the constructor
    private boolean isStrike = false;
    private boolean isSpare = false;
    
    public Frame(){

    }
    
    
    public int getScore(){
        return score;
    }
    
    public boolean getStrikeStatus(){
        return isStrike;
    }
    
    public void setStrikeStatus(boolean isStrike){
        this.isStrike = isStrike;
    }
    
    public void setScore(int score){
        this.score = score;
    }
    
    public void addScore(int score, int previousScore){
        this.score = score + previousScore;
    }
    
    public boolean getSpareStatus(){
        return isSpare;
    }
    
    public void setSpareStatus(boolean isSpare){
        this.isSpare = isSpare;
    }
}
