package chapter09.futuretasktest;

import com.sun.istack.internal.logging.Logger;

import java.util.concurrent.*;

public abstract class AbstractLocalCache<K, V> {
    protected Logger logger = Logger.getLogger(getClass());

    /**
     * 本地缓存存储地址
     */
    private ConcurrentHashMap<K, Future<V>> pool = new ConcurrentHashMap<>();

    private ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() + 1);

    // 模版方法
    public abstract V computeV(K k);

    public Future<V> getResult(K k) {
        Future<V> result = null;
        if (pool.containsKey(k)) {
            return pool.get(k);
        }
        FutureTask<V> future = new FutureTask<V>(new Callable<V>() {
            @Override
            public V call() throws Exception {
                return computeV(k);
            }
        });

        // 说明map中以前没有对应的 futureTask
        // 仔细体会 putIfAbsent 的作用
        if (pool.putIfAbsent(k, future) == null) {
            executorService.submit(future);
        }
        return future;
    }
}
