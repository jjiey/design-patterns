package com.design.pattern.memento.demo2.v1;

import java.util.Stack;

/**
 * @author yangsanity
 */
public class SnapshotHolder {

    private Stack<InputText> snapshots = new Stack<>();

    public InputText popSnapshot() {
        return snapshots.pop();
    }

    public void pushSnapshot(InputText inputText) {
        InputText deepClonedInputText = new InputText();
        deepClonedInputText.setText(inputText.getText());
        snapshots.push(deepClonedInputText);
    }
}
