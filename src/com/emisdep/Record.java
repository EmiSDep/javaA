package com.emisdep;

public class Record {

    static int[] breakingRecords(int[] scores) {
        // create vars: min, max, minCount, maxCount
        // loop through array, 0th index assign min and max
        // each folloing index compare aganist min and max
        // if less or greater changes min/max and update minCount/maxCount
        // print maxCount then minCount
        int min = 0;
        int max = 0;
        int min_count = 0;
        int max_count = 0;
        for (int i = 0; i < scores.length; i++) {
            // if "i" is first index -> set min and max to begin checking scores
            if (i == 0) {
                min = scores[i];
                max = scores[i];
            } else if (scores[i] < min) {
                // if less than min -> breaks min record -> add 1 to min_count and change min
                min_count += 1;
                min = scores[i];
            } else if (scores[i] > max) {
                // if greater than max -> breaks max record -> add 1 to max_count and change max
                max_count += 1;
                max = scores[i];
            }
        }
    }
}
