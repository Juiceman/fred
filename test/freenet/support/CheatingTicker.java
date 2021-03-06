package freenet.support;

import freenet.support.Executor;
import freenet.support.Ticker;

public class CheatingTicker implements Ticker {
    
    final Executor underlying;

    public CheatingTicker(Executor exec) {
        underlying = exec;
    }

    @Override
    public void queueTimedJob(Runnable job, long offset) {
        underlying.execute(job);
    }

    @Override
    public void queueTimedJob(Runnable job, String name, long offset, boolean runOnTickerAnyway,
            boolean noDupes) {
        underlying.execute(job);
    }

    @Override
    public Executor getExecutor() {
        return underlying;
    }

    @Override
    public void removeQueuedJob(Runnable job) {
        throw new UnsupportedOperationException();
    }

}
