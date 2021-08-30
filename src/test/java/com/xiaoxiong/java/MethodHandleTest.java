package com.xiaoxiong.java;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/**
 * @author xiongliang
 * @version 1.0
 * @since 2021/8/30 21:43
 */
public class MethodHandleTest {

  /**
   * MethodHandle   可以将其理解为一种反射
   * @param args String[]
   */
  public static void main(String[] args) {
    MethodHandles.Lookup lookup = MethodHandles.lookup();
    MethodType methodType = MethodType.methodType(String.class, char.class, char.class);
    try {
      MethodHandle methodHandle = lookup.findVirtual(String.class, "replace", methodType);
      String invoke = (String) methodHandle.invoke("abc", 'a', 'c');
      System.out.println(invoke);
    } catch (Throwable e) {
      e.printStackTrace();
    }
  }

}
