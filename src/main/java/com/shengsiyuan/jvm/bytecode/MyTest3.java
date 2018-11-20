package com.shengsiyuan.jvm.bytecode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;

/**
 * @description: ${description}
 * @author: zhangchunxing
 * @create: 2018-11-04
 **/
public class MyTest3 {
    public void test() {
        try {
            InputStream is = new FileInputStream("text.txt");
            ServerSocket serverSocket = new ServerSocket(999);
            serverSocket.accept();
        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        } catch (Exception e) {

        } finally {
            System.out.println("finally");
        }
    }
}
