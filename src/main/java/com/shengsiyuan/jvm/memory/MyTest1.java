package com.shengsiyuan.jvm.memory;

/**
 * @title: 60_JVM内存空间划分与作用详解
 * @note:
 *
 *  1.虚拟机栈：stack frame 栈帧
 *  2.程序计数器（Program Counter）
 *  3.本地方法栈：主要用于处理本地方法
 *  4.堆（Heap）：JVM管理的最大一块内存空间
 *  5.方法区（Method Area）：存储元信息。永久代（Permanent Generation），从JDK 1.8开始，已经彻底废弃了永久代，
 *  使用元空间（meta space）。
 *
 *      5.1 运行时常量池：方法区的一部分内容。
 *
 *  6.直接内存：Direct Memory。不由JVM直接管理的一块内存区域，而是由操作系统管辖的。只不过由JVM向OS
 *  申请了么一块直接内存，来进行操作。
 *
 *
 *
 *
 * @author: zhangchunxing
 * @create: 2018-12-16
 **/
public class MyTest1 {
}
