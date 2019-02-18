package chapter09.futuretasktest;

public class LocalCacheConnection extends AbstractLocalCache<String, Connection> {
    @Override
    public Connection computeV(String s) {

        logger.info("创建connection开始");
        logger.info("睡觉开始");

        try {
            Thread.sleep(3 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        logger.info("睡觉结束");
        logger.info("创建connection结束");

        return new Connection() {
            @Override
            public String getName() {
                return s;
            }

            @Override
            public String toString() {
                return "A connection(" + s + ") 刘燕霏";
            }
        };
    }
}
