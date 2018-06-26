package cn.tedu.demo;

public class Son extends father{
    //@Override
//    public void say() {
//        System.out.print("i am son");
//    }
    public void call(){
        super.say();
        this.say();
    }
}
