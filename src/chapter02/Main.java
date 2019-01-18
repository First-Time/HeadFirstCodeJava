package chapter02;

public strictfp class Main {
    public static void main(String args[]) {
//        Singleton.getInstance();

        /*float f1 = 10.2F;
        float f2 = (float) 10.2;
        System.out.println(f1 * f2);*/

        /*int x = 9;
        int y = 5;
        System.out.println(x / (double) y);*/


        //============================P48(字符型)================================
        /*char c = 'A';
        int num = c;
        System.out.println(c);
        System.out.println(num);*/


        //============================P49(实现字母大小写转换)================================
        /*char c = 'A';
        int num = c;
        num = num + 32;
        c = (char) num;
        System.out.println(c);*/


        //============================P49(利用字符变量保存中文)================================
        /*char c = '王';
        int num = c;
        System.out.println(num);*/


        //============================P50(观察boolean)================================
        /*boolean flag = false;
        if(!flag) {
            System.out.println("Hello World.");
        }*/


        //============================P50(String属于引用数据类型)================================
        /*String str = "Hello World!";
        System.out.println(str);
        System.out.println("Hello World!");*/


        //============================P51(字符串连接)================================
        /*String str = "Hello";
        str = str + " World";
        str += "!!!";
        System.out.println(str);*/


        //============================P51(字符串连接与加法操作一起出现)================================
        /*int numA = 100;
        double numB = 99.0;
        String str = "加法计算：" + numA + numB;
        System.out.println(str);*/


        //============================P51(改变运算优先级)================================
        /*int numA = 100;
        double numB = 99.0;
        String str = "加法计算：" + (numA + numB);
        System.out.println(str);*/


        //============================P52(转义字符)================================
        /*String str = "Hello \"World\"\n\tHello MLDN";
        System.out.println(str);*/


        //============================P55(不建议使用的代码)================================
        /*int numA = 10;
        int numB = 20;
        //如此复杂的代码，一定会损害你的脑细胞
        int result = numA * 2 - --numB * numA++ + numB - numA-- + numB;
        System.out.println(result);*/


        //============================P55(使用关系运算符)================================
        /*System.out.println("3 > 1 = " + (3 > 1));
        System.out.println("3 < 1 = " + (3 < 1));
        System.out.println("3 >= 1 = " + (3 >= 1));
        System.out.println("3 <= 1 = " + (3 <= 1));
        System.out.println("3 == 1 = " + (3 == 1));
        System.out.println("3 != 1 = " + (3 != 1));*/


        //============================P56(四则运算)================================
        /*int numA = 10;
        int numB = 20;
        System.out.println("加法运算：" + (numA + numB));
        System.out.println("减法运算：" + (numA - numB));
        System.out.println("乘法运算：" + (numA * numB));
        System.out.println("除法运算：" + (numA / (double) numB));*/


        //============================P56(求模运算)================================
        /*int numA = 10;
        int numB = 3;
        System.out.println(numA % numB);*/


        //============================P57(奇、偶数判断方法)================================
        /*int numA = 10;
        int numB = 3;
        System.out.println(numA % 2);
        System.out.println(numB % 2);*/


        //============================P57(判断某一个数是奇数还是偶数)================================
        /*int num = 10;
        if (num % 2 == 0) {
            System.out.println(num + "是偶数");
        } else {
            System.out.println(num + "是奇数");
        }*/


        //============================P57(使用简化运算符)================================
        /*int num = 10;
        num *= 2;
        System.out.println(num);*/


        //============================P58(自增观察)================================
        /*int numA = 10;
        int numB = 20;
        //++写在变量前面，表示先对numA的变量内容加1
        //使用处理后的numA变量的内容+numB变量的内容
        int result = ++numA + numB;
        System.out.println("numA = " + numA);
        System.out.println("result = " + result);*/

        //============================P58(自增观察)================================
        /*int numA = 10;
        int numB = 20;
        //++写在变量后面，表示先使用numA的内容进行加法操作
        //加法计算完成之后再对numA的内容进行自增
        int result = numA++ + numB;
        System.out.println("numA = " + numA);
        System.out.println("result = " + result);*/


        //============================P58(三目运算符，实现赋值)================================
        /*int numA = 10;
        int numB = 20;
        int max = numA > numB ? numA : numB;
        System.out.println(max);*/


        //============================P60(非就是针对布尔结果进行求反)================================
        /*boolean flag = true;
        System.out.println(!flag);*/


        //============================P61(观察普通与)================================
        /*if ((1 == 2) & (10 / 0 == 0)) { //使用普通与判断多个条件
            System.out.println("Hello World!");
        }*/


        //============================P61(观察短路与)================================
        /*if ((1 == 2) && (10 / 0 == 0)) { //使用普通与判断多个条件
            System.out.println("Hello World!");
        }*/


        //============================P61(观察普通或操作（|）)================================
        /*if ((1 == 1) | (10 / 0 == 0)) { //使用普通与判断多个条件
            System.out.println("Hello World!");
        }*/

        //============================P61(观察短路或)================================
        /*if ((1 == 1) || (10 / 0 == 0)) { //使用普通与判断多个条件
            System.out.println("Hello World!");
        }*/


        //============================P64(实现位与操作)================================
        /*int numA = 9;
        int numB = 11;
        System.out.println(numA & numB);*/


        //============================P64(实现位或操作)================================
        /*int numA = 9;
        int numB = 11;
        System.out.println(numA | numB);*/


        //============================P64(左移位操作，向左移动两位实现三次方)================================
        /*int x = 2;
        System.out.println(2 << 2);*/


        //============================P67(使用if语句进行判断)================================
        /*double score = 90.0;
        if (score >= 60.0) {
            System.out.println("及格了！");
        }*/


        //============================P67(使用if...else判断)================================
        /*double score = 30.0;
        if (score >= 60.0) {
            System.out.println("及格了！");
        } else {
            System.out.println("小白的成绩！");
        }*/


        //============================P68(使用if...else if...else判断)================================
        /*double score = 101.0;
        if (score < 60.0) {
            System.out.println("小白的成绩！");
        } else if (score >= 60 && score <= 90) {
            System.out.println("中等成绩");
        } else if (score > 90 && score <= 100) {
            System.out.println("优秀成绩");
        } else {
            System.out.println("你家的考试成绩这么怪异！");
        }*/


        //============================P69(使用switch判断。switch控制表达式支持的类型有byte、short、int、char、enum（Java5）、String（Java7）)================================
        /*int ch = 1;
        switch (ch) {
            case 1:
                System.out.println("内容是1");
                break;
            case 2:
                System.out.println("内容是2");
                break;
            case 3:
                System.out.println("内容是3");
                break;
            default:
                System.out.println("没有内容匹配");
                break;
        }*/


        //============================P70(不加入break时的操作)================================
        /*int ch = 2;
        switch (ch) {
            case 1:
                System.out.println("内容是1");
            case 2:
                System.out.println("内容是2");
            case 3:
                System.out.println("内容是3");
            default:
                System.out.println("没有内容匹配");
        }*/


        //============================P71(使用字符串判断)================================
        /*String str = "HELLO";
        switch (str) {
            case "HELLO":
                System.out.println("内容是HELLO");
                break;
            case "hello":
                System.out.println("内容是hello");
                break;
            case "mldn":
                System.out.println("内容是mldn");
                break;
            default:
                System.out.println("没有内容匹配");
                break;
        }*/


        //============================P72(实现1~100的累加，使用while循环)================================
        /*int current = 1;
        int sum = 0;
        while (current <= 100) {
            sum += current;
            current++;
        }
        System.out.println(sum);*/


        //============================P72(使用do...while循环)================================
        /*int current = 1;
        int sum = 0;
        do {
            sum += current;
            current++;
        } while (current <= 100);
        System.out.println(sum);*/


        //============================P74(使用for循环实现1~100累加)================================
        /*int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);*/


        //============================P76(输出乘法口诀表)================================
        /*for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " * " + i + " = " + i * j + "\t");
            }
            System.out.println();
        }*/


        //============================P77(观察continue)================================
        /*for (int x = 0; x < 10; x++) {
            if (x == 3) {
                continue;
            }
            System.out.println("x = " + x);
        }*/


        //============================P77(观察break)================================
        /*for (int x = 0; x < 10; x++) {
            if (x == 3) {
                break;
            }
            System.out.println("x = " + x);
        }*/


        //============================P79================================
        /*printInfo();
        printInfo();*/


        //============================P80================================
        /*pay(10.0);
        pay(-10.0);*/


        //============================P81(定义一个有参数有返回值的方法)================================
        /*int result = add(10, 20);
        System.out.println("计算结果：" + result);
        System.out.println("计算结果：" + add(50, 60));*/


        //============================P81(利用return结束方法调用)================================
        /*set(100);
        set(3);
        set(10);*/


        //============================P82(观察方法重载)================================
        /*System.out.println("计算结果：" + add(10, 20));
        System.out.println("计算结果：" + add(10, 20, 30));
        System.out.println("计算结果：" + add(10.2, 20.3));*/


        //============================P84(递归调用)================================
//        System.out.println(add(100));

    }

    //============================P79(定义一个没有参数没有返回值的方法)================================
    /*public static void printInfo() {
        System.out.println("********************");
        System.out.println("****Java程序设计****");
        System.out.println("********************");
    }*/


    //============================P80(定义一个有参数没有返回值的方法)================================
    /*private static void pay(double money) {
        if (money > 0.0) {
            System.out.println("可以进行支付！");
        } else {
            System.out.println("您穷疯了，没钱还买东西！");
        }
    }*/


    //============================P81(定义一个有参数有返回值的方法)================================
    /*private static int add(int x, int y) {
        return x + y;
    }*/


    //============================P81(利用return结束方法调用)================================
    /*private static void set(int x) {
        if (x == 3) {
            return;
        }
        System.out.println("x = " + x);
    }*/


    //============================P82(观察方法重载)================================
//    /**
//     * 实现两个整数数字的加法计算操作
//     *
//     * @param x 操作数字一
//     * @param y 操作数字二
//     * @return 两个整数数据的加法计算结果
//     */
//    private static int add(int x, int y) { //add方法一共被重载三次
//        return x + y;
//    }
//
//    /**
//     * 实现三个整数数字的加法计算操作
//     *
//     * @param x 操作数字一
//     * @param y 操作数字二
//     * @param z 操作数字三
//     * @return 三个整数数据的加法计算结果
//     */
//    private static int add(int x, int y, int z) {
//        return x + y + z;
//    }
//
//    /**
//     * 实现两个小数的加法计算操作
//     *
//     * @param x 操作数字一
//     * @param y 操作数字二
//     * @return 两个小数数据的加法计算结果
//     */
//    private static double add(double x, double y) {
//        return x + y;
//    }


    //============================P84(递归调用)================================
    /**
     * 数据的累加操作，传入一个数据累加操作的最大值，而后每次进行数据的递减，一直累加到计算数据为1
     * @param num 要进行累加的操作数
     * @return 数据的累加结果
     */
    /*private static int add(int num) {
        if (num == 1) {
            return num;
        } else {
            return num + add(num - 1);
        }
    }*/
}
