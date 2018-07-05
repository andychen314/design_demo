package com.design.behavior.watcher;

/**
 * @author Andy
 * @date 18/6/13
 */
public interface Watched {

    void addWatcher(Watcher watcher);

    void removeWatcher(Watcher watcher);

    void notifyWatchers();
}
