package com.guoyang.com.guoyang.io;

import java.io.*;

/**
 * Created by L'Accordeur on 2016/11/10.
 */
public class IODecorator {
    public static void main(String[] args) {
        InputStream inputStream;  //抽象组件
        FileInputStream fileInputStream;
        StringBufferInputStream stringBufferInputStream;
        ByteArrayInputStream byteArrayInputStream;//具体组件

        FilterInputStream filterInputStream;//抽象装饰者
        BufferedInputStream bufferedInputStream;
        DataInputStream dataInputStream;//具体装饰者

    }
}
