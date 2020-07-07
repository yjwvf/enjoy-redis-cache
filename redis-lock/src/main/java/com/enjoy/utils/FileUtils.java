package com.enjoy.utils;

import java.io.*;
import java.net.URLDecoder;
import java.util.ResourceBundle;

public class FileUtils {
    //无成员变量 --- 无状态
    public static String getScript(String fileName) {
        String path = FileUtils.class.getClassLoader().getResource(fileName).getPath();
        try {
            //URLDecoder.decode(path, "UTF-8")
            return readFileByLines(path);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

	public static String readFileByLines(String fileName) {
        FileInputStream file = null;
        BufferedReader reader = null;
        InputStreamReader inputFileReader = null;
        String content = "";
        String tempString = null;
        try {
            file = new FileInputStream(fileName);
            inputFileReader = new InputStreamReader(file, "utf-8");
            reader = new BufferedReader(inputFileReader);
            // 一次读入一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null) {
                content += tempString;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
        return content;
    }

    public static String readFileByLines2(String path) {
        InputStream in = FileUtils.class.getClassLoader().getResourceAsStream(path);
        BufferedReader reader = null;
        InputStreamReader inputFileReader = null;
        String content = "";
        String tempString = null;
        try {
            inputFileReader = new InputStreamReader(in, "utf-8");
            reader = new BufferedReader(inputFileReader);
            // 一次读入一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null) {
                content += tempString;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
        return content;
    }
	
	public static void main(String[] args) throws IOException {
        String script = FileUtils.readFileByLines2("unlock.lua");
		System.out.println(script);
	}

	public void test1() throws IOException {
        InputStream in = FileUtils.class.getClassLoader().getResourceAsStream("unlock.lua");
        in.read();
    }
}
