/**
 * 解释器模式(Interpreter)
 * <p>
 * 定义
 * 解释器模式是类的行为模式。给定一个语言之后，解释器模式可以定义出其文法的一种表示，
 * 并同时提供一个解释器。客户端可以使用这个解释器来解释这个语句中的句子。
 * <p>
 * 解释器模式的优缺点
 * 解释器是一个简单的语法分析工具，它最显著的优点就是扩展性，修改语法规则只需要修改相应的非终结符就可以了，若扩展语法，只需要增加非终结符类就可以了。
 * 但是，解释器模式会引起类的膨胀，每个语法都需要产生一个非终结符表达式，语法规则比较复杂时，就可能产生大量的类文件，为维护带来非常多的麻烦。
 * 同时，由于采用递归调用方法，每个非终结符表达式只关心与自己相关的表达式，每个表达式需要知道最终的结果，
 * 必须通过递归方式，无论是面向对象的语言还是面向过程的语言，递归都是一个不推荐的方式。由于使用了大量的循环和递归，
 * 效率是一个不容忽视的问题。特别是用于解释一个解析复杂、冗长的语法时，效率是难以忍受的。
 */
package com.design.behavior.interpreter;