# DesignPattern
### 单例模式Singleton
#### 实现方式
* 饿汉式
* 懒汉式
* 静态内部类
* 枚举
#### 破解
##### 反射
* 直接Class.newInstance()没用，私有的构造函数不能这样调
* Constructor.newInstance()方法
    * 饿汉式和静态内部类都防不住这种，因为异常抛不到调用者层
    * 懒汉式需要在调用时处理getInstance()抛出的异常，有点难看但是能防住
```java
Constructor c0 = StaticInnerSingleton.class.getDeclaredConstructor();
c0.setAccessible(true);
StaticInnerSingleton staticInnerSingleton2 = (StaticInnerSingleton) c0.newInstance();
```
##### 反序列化
前提是单例类实现了`Serializable`接口


### 工厂模式Factoy
#### 实现方式
* 简单工厂（静态工厂），实例工厂
* 工厂方法模式
* 抽象工厂模式
#### 如何选择
* 简单工厂模式不符合开闭原则
    * 相对实现方式比较简单，维护起来也不困难
    * 实际场景中需要工厂模式创建的对象数量一般也不会特别多
    * 可以通过反射+外部配置文件的手段解决开闭原则的问题
* 工厂方法模式是专门用于解决单个对象创建工作，本身模式没问题，也符合开闭原则。
    * 存在工厂类数量膨胀的问题。如果需要创建的工厂类不是很多，是一种不错的选择。
* 抽象工厂模式天生就是为生产产品族而生的。所以如果你需要创建的对象非常之多，但是对象之间存在明显产品族特征，那么这个时候用抽象工厂模式非常合适。

### 原型模式Prototype
#### 实现方式
```java
public class Product implements Cloneable{
    int weight;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
```
#### 补充
* 和工厂模式功能类似，但是基于字节流的clone在效率上比new对象要高
* clone分为深拷贝和浅拷贝
* 除了使用迭代clone的方式实现深拷贝，还有序列化完了反序列化的路子
* 如果需要创建大量并且复杂对象时可以采用原型模式。
* 另外，原型模式可以像工厂方法模式一样，可以在事先不知道具体类型的前提下创建出对象，也就是基于接口创建对象，而且实现方式比工厂模式更高效简单。

### 建造者模式Builder
#### 实现方式
```java
public class MacBookProBuilder extends ComputerBuilder {
    @Override
    MacBookProBuilder buildMem() {
        comp.setMem("16g");
        return this;
    }

    @Override
    MacBookProBuilder buildCpu() {
        comp.setCpu("i7");
        return this;
    }

    @Override
    MacBookProBuilder buildHd() {
        comp.setHd("1T");
        return this;
    }
}
```
#### 补充
* 工厂模式强调创建，建造者模式强调组装
* 建造者模式主要用于创建那些具有明显组装过程的一类复杂对象，并且这类对象中内部结构差异性都不大，基本结构都相同，并且比较稳定。

### 动态代理模式Proxy
#### 实现方式
```java
//自定义调用处理器
public class RentHandler implements InvocationHandler {
    Person landlord;
  
    public RentHandler(Person landlord) {
        this.landlord = landlord;
    }
	//客户端对代理对象发起的所有请求都会被委托给该方法
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
      	//前置处理
        System.out.println("经过前期调研，西湖边的房子环境挺好的...");
      	//委托给真实角色处理业务逻辑
        method.invoke(landlord, args);
      	//后置处理
        System.out.println("房子漏水，帮你联系维修人员...");
        returnnull;
    }
}

//客户端
public class Client2 {
    public static void main(String[] args) {
        Person landlord = new Landlord();
        Person proxy = (Person) Proxy.newProxyInstance(
          ClassLoader.getSystemClassLoader(), // 默认类加载器
          new Class[]{Person.class},         // 代理的接口
          new RentHandler(landlord));        // 自定义调用处理器实现
        proxy.rent();
    }
}
```
#### 补充
* 编译后会生成一个代理类
* 和JVM有关

### 适配器模式Adaptor
#### 实现方式
```java
public class Adaptor implements Computer{
  private Dominate dominate;
  //省略构造器
  public void run(){
    dominate.cost();
  }
}
```
#### 补充
* 默认适配器

### 桥接模式Bridge
#### 实现方式
```java
abstract class Type {
    Brand brand;

    public Type(Brand brand) {
        this.brand = brand;
    }

    protected abstract void run();
}

class Laptop extends Type {
    public Laptop(Brand brand) {
        super(brand);
    }

    protected void run() {
        System.out.println("笔记本");
    }
}
```
#### 补充
* 解决存在多个维度并且需要各自独立变化扩展的场景，将每个维度抽象为一个抽象类或者接口，然后采用组合的方式将各个类联系起来，极大的提高了代码的扩展性。

