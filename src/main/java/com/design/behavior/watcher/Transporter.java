package com.design.behavior.watcher;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Andy
 * @date 18/6/13
 */
public class Transporter implements Watched {

    private List<Watcher> list = new ArrayList<>();


    @Override
    public void addWatcher(Watcher watcher) {
        list.add(watcher);
    }

    @Override
    public void removeWatcher(Watcher watcher) {
        list.remove(watcher);

    }

    @Override
    public void notifyWatchers() {
        for (Watcher watcher : list) {
            watcher.update();
        }
    }
}
