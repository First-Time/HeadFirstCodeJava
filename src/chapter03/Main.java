package chapter03;

public class Main {
    public static void main(String args[]) {
        //============================P95(使用类——在主类中使用Book类)================================
        /*Book book = new Book();
        book.title = "Java开发";
        book.price = 89.9;
        book.getInfo();*/


        //============================P97(声明两个对象)================================
        /*Book bookA = new Book();
        Book bookB = new Book();
        bookA.title = "Java开发";
        bookA.price = 89.9;
        bookB.title = "JSP开发";
        bookB.price = 69.8;
        bookA.getInfo();
        bookB.getInfo();*/


        //============================P98(对象引用传递)================================
        /*Book bookA = new Book();
        Book bookB = null;
        bookA.title = "Java开发";
        bookA.price = 89.9;
        bookB = bookA;
        bookB.title = "JSP开发";
        bookB.price = 69.8;
        bookA.getInfo();
        bookB.getInfo();*/


        //============================P99(深度观察引用传递)================================
        /*Book bookA = new Book();
        Book bookB = new Book();
        bookA.title = "Java开发";
        bookA.price = 89.9;
        bookB.title = "JSP开发";
        bookB.price = 69.8;
        bookB = bookA;
        bookB.price = 100.1;
        bookA.getInfo();*/


        //============================P104()================================
        /*Book bookA = new Book();
        bookA.setTitle("Java开发");
        bookA.setPrice(-89.9);
        bookA.getInfo();*/


        //============================P105(定义构造方法)================================
//        Book book = new Book();


        //============================P106(利用构造方法为属性赋值)================================
        /*Book book = new Book("Java开发", 69.8);
        book.getInfo();*/


        //============================P107(构造方法重载)================================
        /*Book book = new Book("Java开发");
        book.getInfo();*/


        //============================P109(定义匿名对象)================================
//        new Book("Java开发", 69.8).getInfo();


        //============================P112(开发Emp程序类)================================
        /*Emp e = new Emp(7369, "SMITH", "CLERK", 800.0, 1.0);
        System.out.println(e.getInfo());*/


        //============================P113(定义数组)================================
        /*int data[] = new int[3];
        data[0] = 10;
        data[1] = 20;
        data[2] = 30;
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "、");
        }*/


        //============================P114(数组的引用传递)================================
        /*int data[] = new int[3];
        data[0] = 10;
        data[1] = 20;
        data[2] = 30;
        int temp[] = data;
        temp[0] = 99;
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "、");
        }*/


        //============================P115(数组的静态初始化)================================
        /*int data[] = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "、");
        }*/


        //============================P117(观察二维数组的定义及使用)================================
        /*int data[][] = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }*/


        //============================P117(一个数组传递的程序)================================
        /*int data[] = new int[]{1, 2, 3};
        change(data);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "、");
        }*/


        //============================P119(排序基础实现)================================
        /*int data[] = new int[]{2, 1, 9, 0, 5, 3, 7, 6, 8};
        System.out.print("排序前的数据：");
        print(data);
        sort(data);
        System.out.println();
        System.out.print("排序后的数据：");
        print(data);*/


        //============================P121(实现数组的转置（首尾交换），会产生垃圾空间)================================
        /*int data[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int temp[] = new int[data.length];
        int foot = data.length - 1;
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[foot];
            foot--;
        }
        data = temp;
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "、");
        }*/


        //============================P122(实现数组的转置（首尾交换）)================================
        /*int data[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int middle = data.length / 2;
        int head = 0;
        int tail = data.length - 1;
        for (int i = 0; i < middle; i++) {
            int temp = data[head];
            data[head] = data[tail];
            data[tail] = temp;
            head++;
            tail--;
        }
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "、");
        }*/


        //============================P124(二维数组的转置)================================
        /*int data[][] = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int row = 0; row < data.length - 1; row++) {
            for (int col = row + 1; col < data[row].length; col++) {
                int temp = data[row][col];
                data[row][col] = data[col][row];
                data[col][row] = temp;
            }
        }
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }*/


        //============================P127(实现数组复制)================================
        /*int dataA[] = new int[]{1, 2, 3, 4, 5, 6, 7};
        int dataB[] = new int[]{11, 22, 33, 44, 55, 66, 77, 88};
        System.arraycopy(dataA, 4, dataB, 2, 3);
        for (int i = 0; i < dataB.length; i++) {
            System.out.print(dataB[i] + "、");
        }*/


        //============================P128(实现排序)================================
        /*int data[] = new int[]{3, 6, 1, 2, 8, 0};
        Arrays.sort(data);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "、");
        }*/


        //============================P129(对象数组的动态初始化)================================
        /*Book books[] = new Book[3];
        books[0] = new Book("Java", 79.8);
        books[1] = new Book("JSP", 69.8);
        books[2] = new Book("Android", 89.8);
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getInfo());
        }*/


        //============================P129(对象数组的静态初始化)================================
        /*Book books[] = new Book[]{new Book("Java", 79.8), new Book("JSP", 69.8), new Book("Android", 89.8)};
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getInfo());
        }*/


        //============================P133(观察字符串是匿名对象的验证)================================
        /*String str = "hello";
        System.out.println("hello".equals(str));
        System.out.println("hello" == str);*/


        //============================P135(观察直接赋值时的堆内存直接引用)================================
        /*String stra = "hello";
        String strb = "hello";
        String strc = "hello";
        String strd = "yootk";
        System.out.println(stra == strb);
        System.out.println(stra == strc);
        System.out.println(strb == strc);
        System.out.println(stra == strd);*/


        //============================P136(不自动保存对象池操作)================================
        /*String stra = new String("hello");
        String strb = "hello";
        System.out.println(stra == strb);*/


        //============================P137(手工入池)================================
        /*String stra = new String("hello").intern();
        String strb = "hello";
        System.out.println(stra == strb);*/


        //============================P137(修改字符串对象引用（字符串一旦定义则不可改变）)================================
        /*String str = "Hello";
        str = str + " World";
        str += "!!!";
        System.out.println(str);*/


        //============================P142(取出指定索引的字符——使用charAt()方法)================================
        /*String str = "hello";
        char c = str.charAt(0);
        System.out.println(c);*/


        //============================P142(字符数组与字符串的转换)================================
        /*String str = "hello";
        char[] data = str.toCharArray();
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "、");
        }*/


        //============================P142(将字符串转为大写)================================
        /*String str = "hello";
        char[] data = str.toCharArray();
        for (int i = 0; i < data.length; i++) {
            data[i] -= 32;
        }
        System.out.println(new String(data));
        System.out.println(new String(data, 1, 2));*/


        //============================P143(给定一个字符串，要求判断其是否由数字组成)================================
        /*String str = "123423432";
        if (isNumber(str)) {
            System.out.println("字符串由数字组成！");
        } else {
            System.out.println("字符串由非数字组成！");
        }*/


        //============================P144(观察字符串与字节数组的转换)================================
        /*String str = "helloworld";
        byte[] data = str.getBytes();
        for (int i = 0; i < data.length; i++) {
            data[i] -= 32;
        }
        System.out.println(new String(data));
        System.out.println(new String(data, 5, 5));*/


        //============================P145(相等判断)================================
        /*String stra = "Hello";
        String strb = "hELLO";
        System.out.println(stra.equals(strb));
        System.out.println(stra.equalsIgnoreCase(strb));*/


        //============================P145(观察compareTo()方法)================================
        /*String stra = "Hello";
        String strb = "HEllo";
        System.out.println(stra.compareTo(strb));
        if(stra.compareTo(strb) > 0) {
            System.out.println("大于");
        }*/


        //============================P146(使用indexOf()等功能查找)================================
        /*String str = "helloworld";
        System.out.println(str.indexOf("world"));
        System.out.println(str.indexOf("l"));
        System.out.println(str.indexOf("l", 5));
        System.out.println(str.lastIndexOf("l"));*/


        //============================P149(字符串截取)================================
        /*String str = "helloworld";
        String resultA = str.substring(5);
        String resultB = str.substring(0, 5);
        System.out.println(resultA);
        System.out.println(resultB);*/


        //============================P151(要避免正则表达式的影响，可以进行转义操作)================================
        /*String str = "192.168.1.2";
        String result[] = str.split("\\."); //此处如果不进行转义，是不能正常执行的。
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + "、");
        }*/


        //============================P155(观察程序问题)================================
        /*Book book = new Book("Java开发", 89.2);
        System.out.println(book.getInfo());*/


        //============================P162(直接输出对象)================================
        /*Book booka = new Book();
        System.out.println("booka = " + booka);
        booka.print();

        Book bookb = new Book();
        System.out.println("bookb = " + bookb);
        bookb.print();*/


        //============================P163(第一道引用传递范例)================================
        /*Member msg = new Member(30);
        fun(msg);
        System.out.println(msg.getNum());*/


        //============================P165(第二道引用传递范例：一种特殊的类——String)================================
        /*String msg = "Hello";
        fun(msg);
        System.out.println(msg);*/


        //============================P166(第三道引用传递范例：将前两道范例结合在一起来观察引用传递)================================
        /*Member msg = new Member("Hello");
        fun(msg);
        System.out.println(msg.getInfo());*/


        //============================P169()================================
        /*Member m = new Member(1, "李兴华");
        Car c = new Car("八手奥拓100");
        m.setCar(c);
        c.setMember(m);
        System.out.println(m.getCar().getInfo());
        System.out.println(c.getMember().getInfo());*/


        //============================P171()================================
        /*Member m = new Member(1, "李兴华");
        Member chd = new Member(2, "李闯");
        Car c = new Car("八手奥拓100");
        Car cc = new Car("法拉利M9");
        m.setCar(c);
        c.setMember(m);
        chd.setCar(cc);
        cc.setMember(chd);
        m.setChild(chd);
        System.out.println(m.getCar().getInfo());
        System.out.println(c.getMember().getInfo());
        System.out.println(m.getChild().getInfo());
        System.out.println(m.getChild().getCar().getInfo());*/


        //============================P174()================================
        /*//第一步：根据表结构描述设置数据
        //1、产生各自的独立对象
        Dept dept = new Dept(10, "ACCOUNTING", "New York");
        Emp ea = new Emp(7369, "SMITH", "CLERK", 800.0, 0.0);       //部门信息
        Emp eb = new Emp(7902, "FORD", "MANAGER", 2450.0, 0.0);     //雇员信息
        Emp ec = new Emp(7839, "KING", "PRESIDENT", 5000.0, 0.0);   //雇员信息
        //2、设置雇员和领导关系
        ea.setMgr(eb);      //设置雇员领导
        eb.setMgr(ec);      //设置雇员领导
        //3、设置雇员与部门关系
        ea.setDept(dept);   //雇员与部门
        eb.setDept(dept);   //雇员与部门
        ec.setDept(dept);   //雇员与部门
        dept.setEmps(new Emp[]{ea, eb, ec});    //部门与雇员
        //第二步：根据表结构描述取得设置的数据
        System.out.println(ea.getInfo());                       //取得雇员信息
        System.out.println("\t|-" + ea.getMgr().getInfo());     //取得雇员领导信息
        System.out.println("\t|-" + ea.getDept().getInfo());    //取得雇员部门信息
        //取得部门的完整信息，包括部门基础信息以及部门中的所有员工和每个员工的领导信息
        System.out.println(dept.getInfo());                     //部门信息
        for (int i = 0; i < dept.getEmps().length; i++) {       //所有雇员信息
            System.out.println("\t|-" + dept.getEmps()[i].getInfo());
            if (dept.getEmps()[i].getMgr() != null) {
                System.out.println("\t\t|-" + dept.getEmps()[i].getMgr().getInfo());   //领导信息
            }
        }*/


        //============================P176(基础的比较方式)================================
        /*Book b1 = new Book("Java开发", 79.8);         //实例化Book类对象
        Book b2 = new Book("Java开发", 79.8);         //实例化Book类对象
        if (b1.getTitle().equals(b2.getTitle()) && b1.getPrice() == b2.getPrice()) {
            System.out.println("是同一个对象");
        } else {
            System.out.println("不是同一个对象");
        }*/


        //============================P177(对象比较实现)================================
        /*Book b1 = new Book("Java开发", 79.8);         //实例化Book类对象
        Book b2 = new Book("Java开发", 79.8);         //实例化Book类对象
        if (b1.compare(b2)) {
            System.out.println("是同一个对象");
        } else {
            System.out.println("不是同一个对象");
        }*/


        //============================P179(static定义属性)================================
        /*Book ba = new Book("Java开发", 10.2);
        Book bb = new Book("Android开发", 11.2);
        Book bc = new Book("Oracle开发", 12.2);
        Book.pub = "北京大学出版社";
        System.out.println(ba.getInfo());
        System.out.println(bb.getInfo());
        System.out.println(bc.getInfo());*/


        //============================P180(在没有实例化对象产生时直接操作static属性)================================
        /*System.out.println(Book.pub);
        Book.pub = "北京大学出版社";
        Book ba = new Book("Java开发", 10.9);
        System.out.println(ba.getInfo());*/


        //============================P181(使用static定义方法)================================
        /*Book.setPub("北京大学出版社");
        Book ba = new Book("Java开发", 10.2);
        Book bb = new Book("Android开发", 11.2);
        Book bc = new Book("Oracle开发", 12.2);
        System.out.println(ba.getInfo());
        System.out.println(bb.getInfo());
        System.out.println(bc.getInfo());*/


        //============================P187(定义构造快)================================
        /*new Book();
        new Book();*/


        //============================P188(利用静态快为static属性初始化)================================
        /*new Book();
        new Book();
        System.out.println(Book.msg);*/


        //============================P190(观察内部类的基本形式。内部类的最大好处就是可以方便地访问外部类中的私有属性。)================================
        /*Outer outer = new Outer();
        outer.fun();*/


        //============================P191(将内部类放到外部并且实现同样功能)================================
        /*Outer outer = new Outer();
        outer.fun();*/


        //============================P191(访问内部类的私有属性)================================
        /*Outer outer = new Outer();
        outer.fun();*/


        //============================P192(实例化内部类对象)================================
        /*Outer.Inner inner = new Outer().new Inner();
        inner.print();*/


        //============================P193(实例化内部类对象)================================
        /*Outer.Inner inner = new Outer.Inner();
        inner.print();*/


        //============================P194(在普通方法里面定义内部类)================================
//        new Outer().fun();


        //============================P195(访问方法中定义的参数或变量)================================
//        new Outer().fun(100);


        //============================P198(手工配置节点关系，并使用while循环输出全部节点数据)================================
        /*//第一步：定义要操作的节点并设置好包装的字符串数据
        Node root = new Node("火车头");                //定义节点，同时包装数据
        Node n1 = new Node("车厢A");                  //定义节点，同时包装数据
        Node n2 = new Node("车厢B");                  //定义节点，同时包装数据
        root.setNext(n1);
        n1.setNext(n2);
        //第二步：根据节点关系取出所有数据
        Node currentNode = root;                            //当前从根节点开始读取
        while(currentNode != null) {                        //当前节点存在数据
            System.out.println(currentNode.getData());
            currentNode = currentNode.getNext();            //将下一个节点设置为当前节点
        }*/


        //============================P199(手工配置节点关系，通过递归输出全部节点数据)================================
        /*//第一步：定义要操作的节点并设置好包装的字符串数据
        Node root = new Node("火车头");                //定义节点，同时包装数据
        Node n1 = new Node("车厢A");                  //定义节点，同时包装数据
        Node n2 = new Node("车厢B");                  //定义节点，同时包装数据
        root.setNext(n1);
        n1.setNext(n2);
        print(root);*/


        //============================P222()================================
        /*String str = "MLDN中心Java技术学习班20130214";
        System.out.println(str.substring(str.indexOf("20130214")));*/

        /*String str = "MLDN JAVA高端技术培训";
        System.out.println(str.replaceAll("Java".toUpperCase(), "JAVA EE"));*/

        /*String str = "Java技术学习班20130214";
        System.out.println(str.charAt(7));*/

        /*String str = "Java技术学习班20130214";
        System.out.println(str.replaceAll("0", ""));*/

        /*String str = "410426198808063011";
        System.out.println(str.substring(6, 14));*/
    }

    //============================P117(一个数组传递的程序)================================
    /*private static void change(int temp[]) {
        for (int i = 0; i < temp.length; i++) {
            temp[i] *= 2;
        }
    }*/


    //============================P119(排序基础实现)================================
    /*private static void sort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    private static void print(int data[]) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "、");
        }
    }*/


    //============================P143(给定一个字符串，要求判断其是否由数字组成)================================
    /*private static boolean isNumber(String temp) {
        char[] data = temp.toCharArray();
        for (int i = 0; i < data.length; i++) {
            if (data[i] > '9' || data[i] < '0') {
                return false;
            }
        }
        return true;
    }*/


    //============================P163(第一道引用传递范例)================================
    /*private static void fun(Member temp) {
        temp.setNum(100);
    }*/


    //============================P165(第二道引用传递范例：一种特殊的类——String)================================
    /*private static void fun(String temp) {
        temp = "World";
    }*/


    //============================P166(第三道引用传递范例：将前两道范例结合在一起来观察引用传递)================================
    /*private static void fun(Member temp) {
        temp.setInfo("World");
    }*/


    //============================P199(手工配置节点关系，通过递归输出全部节点数据)================================
    /*private static void print(Node current) {
        if (current == null) {
            return;
        }
        System.out.println(current.getData());
        print(current.getNext());
    }*/


}
