package bowlinggame;

import java.util.ArrayList;
import java.util.List;


public class StartGame {
    public static void main(String[] args){
        List<Frame> framesArray = new ArrayList();
        Frame frame1 = new Frame();
        Frame frame2 = new Frame();
        Frame frame3 = new Frame();
        Frame frame4 = new Frame();
        Frame frame5 = new Frame();
        Frame frame6 = new Frame();
        Frame frame7 = new Frame();
        Frame frame8 = new Frame();
        Frame frame9 = new Frame();
        Frame frame10 = new Frame();
        framesArray.add(frame1);
        framesArray.add(frame2);
        framesArray.add(frame3);
        framesArray.add(frame4);
        framesArray.add(frame5);
        framesArray.add(frame6);
        framesArray.add(frame7);
        framesArray.add(frame8);
        framesArray.add(frame9);
        framesArray.add(frame10);
        
        RollScorer scorer = new RollScorer();
        scorer.scoreWithTwoRolls(5,3,framesArray.get(0), framesArray);
        scorer.scoreWithTwoRolls(9,1,framesArray.get(1), framesArray);
        scorer.scoreWithOneRoll(10, framesArray.get(2), framesArray);
        scorer.scoreWithOneRoll(10,framesArray.get(3), framesArray);
        scorer.scoreWithTwoRolls(5, 2,framesArray.get(4), framesArray);
        scorer.scoreWithTwoRolls(5, 0,framesArray.get(5), framesArray);
        System.out.println(framesArray.get(0).getScore());
        System.out.println(framesArray.get(1).getScore());
        System.out.println(framesArray.get(2).getScore());
        System.out.println(framesArray.get(3).getScore());
        System.out.println(framesArray.get(4).getScore());
        System.out.println(framesArray.get(5).getScore());
        //System.out.println(framesArray.get(6).getScore());
        //System.out.println(framesArray.get(7).getScore());
       // System.out.println(framesArray.get(8).getScore());
        //System.out.println(framesArray.get(9).getScore());
    }
}
