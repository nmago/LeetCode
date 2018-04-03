package ru.nmago.algorithms.p657;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SolutionTest{

    private class TestDataItem{
        String moves;
        boolean correctAnswer;

        TestDataItem(String moves, boolean correctAnswer){
            this.moves = moves;
            this.correctAnswer = correctAnswer;
        }
    }

    private ArrayList<TestDataItem> testDataItems;

    @Before
    public void setUp(){
        testDataItems = new ArrayList<>();

        //basic1
        testDataItems.add(new TestDataItem(
                "UD",
                true
        ));

        //basic2
        testDataItems.add(new TestDataItem(
                "R",
                false
        ));

        //basic3
        testDataItems.add(new TestDataItem(
                "RDLU",
                true
        ));

        //empty
        testDataItems.add(new TestDataItem(
                "",
                true
        ));

        //null
        testDataItems.add(new TestDataItem(
                null,
                true
        ));
    }

    @Test
    public void judgeCircle(){
        Solution solution = new Solution();
        for(TestDataItem testDataItem : testDataItems){
            boolean actual = solution.judgeCircle(testDataItem.moves);
            try {
                assertEquals(testDataItem.correctAnswer, actual);
            }catch (AssertionError ae){
                System.out.println("Fail on test input: " + testDataItem.moves);
                ae.printStackTrace();
            }
        }
    }
}