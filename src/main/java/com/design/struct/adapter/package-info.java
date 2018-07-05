/**
 * 适配器模式
 * <p>
 * 模式总结
 * <p>
 * 　　1 优点
 * <p>
 * 　　　　1.1 通过适配器，客户端可以调用同一接口，因而对客户端来说是透明的。这样做更简单、更直接、更紧凑。
 * <p>
 * 　　　　1.2 复用了现存的类，解决了现存类和复用环境要求不一致的问题。
 * <p>
 * 　　　　1.3 将目标类和适配者类解耦，通过引入一个适配器类重用现有的适配者类，而无需修改原有代码。
 * <p>
 * 　　　　1.4 一个对象适配器可以把多个不同的适配者类适配到同一个目标，也就是说，同一个适配器可以把适配者类和它的子类都适配到目标接口。
 * <p>
 * 　　2 缺点
 * <p>
 * 　　　　对于对象适配器来说，更换适配器的实现过程比较复杂。
 * <p>
 * 　　3 适用场景
 * <p>
 * 　　　　3.1 系统需要使用现有的类，而这些类的接口不符合系统的接口。
 * <p>
 * 　　　　3.2 想要建立一个可以重用的类，用于与一些彼此之间没有太大关联的一些类，包括一些可能在将来引进的类一起工作。
 * <p>
 * 　　　　3.3 两个类所做的事情相同或相似，但是具有不同接口的时候。
 * <p>
 * 　　　　3.4 旧的系统开发的类已经实现了一些功能，但是客户端却只能以另外接口的形式访问，但我们不希望手动更改原有类的时候。
 * <p>
 * 　　　　3.5 使用第三方组件，组件接口定义和自己定义的不同，不希望修改自己的接口，但是要使用第三方组件接口的功能。
 *
 * @author Andy
 * @date 18/7/5
 */
package com.design.struct.adapter;