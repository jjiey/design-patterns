package com.design.pattern.memento.demo2.v2;

import java.util.Stack;

/**
 * @author yangsanity
 */
public class SnapshotHolder {

    private Stack<Snapshot> snapshots = new Stack<>();

    public Snapshot popSnapshot() {
        return snapshots.pop();
    }

    public void pushSnapshot(Snapshot snapshot) {
        snapshots.push(snapshot);
    }
}
