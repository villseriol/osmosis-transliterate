// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.detective.v0_6.reports.models;

import java.util.concurrent.ArrayBlockingQueue;


public class NodeCountByCharacterRecord {
    private static final int MAX_EXAMPLES_SIZE = 10;

    private Character character;
    private Long occurences;
    private ArrayBlockingQueue<String> examples;

    public NodeCountByCharacterRecord(Character character) {
        this.character = character;
        this.occurences = 0L;
        this.examples = new ArrayBlockingQueue<>(MAX_EXAMPLES_SIZE);
    }


    public void addExample(String example) {
        examples.offer(example);
    }


    public void incrementOccurences() {
        ++occurences;
    }


    public void decrementOccurences() {
        --occurences;
    }


    public void setCharacter(Character character) {
        this.character = character;
    }


    public Character getCharacter() {
        return character;
    }


    public void setExamples(ArrayBlockingQueue<String> examples) {
        this.examples = examples;
    }


    public ArrayBlockingQueue<String> getExamples() {
        return examples;
    }


    public void setOccurences(Long occurences) {
        this.occurences = occurences;
    }


    public Long getOccurences() {
        return occurences;
    }
}
