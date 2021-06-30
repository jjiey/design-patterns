package com.design.pattern.memento.demo2.v2;

import java.util.Scanner;

/**
 * @author yangsanity
 */
public class Demo {

    public static void main(String[] args) {
        InputText inputText = new InputText();
        SnapshotHolder snapshotsHolder = new SnapshotHolder();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String input = scanner.next();
            if (":list".equals(input)) {
                System.out.println(inputText);
            } else if (":undo".equals(input)) {
                Snapshot snapshot = snapshotsHolder.popSnapshot();
                inputText.restoreSnapshot(snapshot);
            } else {
                snapshotsHolder.pushSnapshot(inputText.createSnapshot());
                inputText.append(input);
            }
        }
    }
}
