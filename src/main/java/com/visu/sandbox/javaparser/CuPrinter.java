package com.visu.sandbox.javaparser;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;

import java.io.FileInputStream;

/**
* Examples described in
* https://github.com/javaparser/javaparser/wiki/Manual
**/
public class CuPrinter {

    public static void main(String[] args) throws Exception {
        // creates an input stream for the file to be parsed
        FileInputStream in = new FileInputStream("E:\\Projects\\Test\\src\\main\\java\\com\\visu\\sandbox\\jasypt\\Crypto.java");

        // parse the file
        CompilationUnit cu = JavaParser.parse(in);

        // prints the resulting compilation unit to default system output
        System.out.println(cu.toString());
    }
}
