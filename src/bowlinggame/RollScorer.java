package bowlinggame;

import java.util.List;
//TODO list
//need to add up the previous frames to output the scores to the user.
//todo that you need to not display a spare or a strike until it's calculated.
//check if 10th frame needs different scorer... it probably does. probably 2 actually
//make a random rolling class so that you can even call that for both of the rolls. 
//This means that the second RollScorer needs to have validation for 10 and 0.


//Make UML Dagram for everything


//if you have a strike, the next two rolls are added onto it. With this is mind, you need to check the next two rolls. 
//So, if the first frame is a strke, and the second frame is a strike, the next roll of the next frame must also be added.
//2 or more as long as the 2nd frame is not a strike.
public final class RollScorer {
    
    private int roll1;
    private int roll2;
    
    //this should be called ONLY when roll1 is a strike
    public RollScorer(){
        
    }
    
    public void scoreWithOneRoll(int roll1, Frame currentFrame, List<Frame> frames){
        currentFrame.setStrikeStatus(true);
        currentFrame.setScore(roll1);
        //okay, so, what's going on in this cluster fuck is we need to make sure that there is a previous frame, so the size must be above 0.
        //then, we need to check that the previous frame was either a spare or a strike.
        //okay, then, we need to add the score to the previous frame. so we call add score for the current roll and the score that was held on the previous frame.
        if(frames.indexOf(currentFrame) > 1 && ((frames.get(frames.indexOf(currentFrame) - 1).getStrikeStatus() == true) || (frames.get(frames.indexOf(currentFrame) - 1).getSpareStatus() == true))){
            frames.get(frames.indexOf(currentFrame) - 1).addScore(roll1, frames.get(frames.indexOf(currentFrame) - 1).getScore());
        }
        //okay, so, what's going on in this cluster fuck is we need to make sure that there is a previous frame, so the size must be above 0.
        //then, we need to check that the 2nd previous frame was either a spare or a strike.
        //okay, then, we need to add the score to the previous frame. so we call add score for the current roll and the score that was held on the frame 2 frames ago.
        if(frames.indexOf(currentFrame) > 2 && (frames.get(frames.indexOf(currentFrame) - 2).getStrikeStatus() == true) && (frames.get(frames.indexOf(currentFrame) - 1).getStrikeStatus() == true)){
            frames.get(frames.indexOf(currentFrame) - 2).addScore(roll1, frames.get(frames.indexOf(currentFrame) - 2).getScore());
        }
    
    }
    
    public void scoreWithTwoRolls(int roll1, int roll2, Frame currentFrame, List<Frame> frames){
        if(roll1 == 10){
            scoreWithOneRoll(roll1, currentFrame, frames);
        }
        else{
            currentFrame.setScore(roll1 + roll2);
            if((roll1 + roll2) == 10){
                currentFrame.setSpareStatus(true);
            }
            //okay, so, what's going on in this cluster fuck is we need to make sure that there is a previous frame, so the size must be above 0.
            //then, we need to check that the previous frame was either a spare or a strike.
            //okay, then, we need to add the score to the previous frame. so we call add score for the current roll and the score that was held on the previous frame.
            if(frames.indexOf(currentFrame) > 1 && ((frames.get(frames.indexOf(currentFrame) - 1).getSpareStatus() == true))){
                frames.get(frames.indexOf(currentFrame) - 1).addScore(roll1 , frames.get(frames.indexOf(currentFrame) - 1).getScore());
            }
            if(frames.indexOf(currentFrame) > 1 && ((frames.get(frames.indexOf(currentFrame) - 1).getStrikeStatus() == true))){
                frames.get(frames.indexOf(currentFrame) - 1).addScore((roll1 + roll2) , frames.get(frames.indexOf(currentFrame) - 1).getScore());
            }
            if(frames.indexOf(currentFrame) > 2 && (frames.get(frames.indexOf(currentFrame) - 2).getStrikeStatus() == true) && (frames.get(frames.indexOf(currentFrame) - 1).getStrikeStatus() == true)){
            frames.get(frames.indexOf(currentFrame) - 2).addScore(roll1, frames.get(frames.indexOf(currentFrame) - 2).getScore());
        }
        }

    }
    
    public void scoreTenthFrame(int roll1, int roll2, int roll3, Frame currentFrame, List<Frame> frames){
        if(frames.indexOf(currentFrame) > 1 && ((frames.get(frames.indexOf(currentFrame) - 1).getStrikeStatus() == true) || (frames.get(frames.indexOf(currentFrame) - 1).getSpareStatus() == true))){
            frames.get(frames.indexOf(currentFrame) - 1).addScore(roll1 + roll2, frames.get(frames.indexOf(currentFrame) - 1).getScore());
        }
        //okay, so, what's going on in this cluster fuck is we need to make sure that there is a previous frame, so the size must be above 0.
        //then, we need to check that the 2nd previous frame was either a spare or a strike.
        //okay, then, we need to add the score to the previous frame. so we call add score for the current roll and the score that was held on the frame 2 frames ago.
        if(frames.indexOf(currentFrame) > 2 && (frames.get(frames.indexOf(currentFrame) - 2).getStrikeStatus() == true) && (frames.get(frames.indexOf(currentFrame) - 1).getStrikeStatus() == true)){
            frames.get(frames.indexOf(currentFrame) - 2).addScore(roll1, frames.get(frames.indexOf(currentFrame) - 2).getScore());
        }
        if((roll1 + roll2) > 10){
           currentFrame.setScore(roll1 + roll2 + roll3);
        }
        
    }
}
