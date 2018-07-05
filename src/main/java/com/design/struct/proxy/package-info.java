/**
 * 代理模式
 * <p>
 * 动态代理与静态代理相比较，最大的好处是接口中声明的所有方法都被转移到调用处理器一个集中的方法中处理。
 * 在接口方法数量比较多的时候，我们可以进行灵活处理，而不需要像静态代理那样对每一个方法或方法组合进行处理。
 * Proxy 很美很强大，但是仅支持 interface 代理。Java 的单继承机制注定了这些动态代理类们无法实现对 class 的动态代理。
 * 好在有cglib为Proxy提供了弥补。class与interface的区别本来就模糊，
 * 在java8中更是增加了一些新特性，使得interface越来越接近class，当有一日，java突破了单继承的限制，动态代理将会更加强大。
 *
 * @author Andy
 * @date 18/7/5
 */
package com.design.struct.proxy;