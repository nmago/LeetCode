package ru.nmago.algorithms.p804;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SolutionTest{

    private class TestDataItem{
        String[] words;
        int rightAnswer;

        TestDataItem(String[] words, int rightAnswer){
            this.words = words;
            this.rightAnswer = rightAnswer;
        }
    }

    private ArrayList<TestDataItem> testDataItems;

    private void prepareData(){
        testDataItems = new ArrayList<>();

        //basic
        testDataItems.add(new TestDataItem(
                new String[]{"gin", "zen", "gig", "msg"}, 2
        ));

        //empty
        testDataItems.add(new TestDataItem(
                new String[]{}, 0
        ));

        //one
        testDataItems.add(new TestDataItem(
                new String[]{"b"}, 1
        ));

        //null
        testDataItems.add(new TestDataItem(
                null, 0
        ));
    }

    @Test
    public void uniqueMorseRepresentations(){
        prepareData();
        Solution solution = new Solution();
        for(TestDataItem testDataItem : testDataItems){
            int actual = solution.uniqueMorseRepresentations(testDataItem.words);
            try {
                assertEquals(testDataItem.rightAnswer, actual);
            }catch (AssertionError ae){
                System.out.println("Fail on test input: " + Arrays.toString(testDataItem.words));
                ae.printStackTrace();
            }
        }
    }
}