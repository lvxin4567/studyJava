package com.download;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.MalformedInputException;


public class DownLoad {
	public static void main(String[] args) {
		
		String downUrl = "http://192.168.1.110:3000/movie/lena.mp4";
		try {
            URL url = new URL(downUrl);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = urlConnection.getInputStream();
            
            //��ȡ�ļ��ܳ���
            int contentLength = urlConnection.getContentLength();
            System.out.println("�ļ��ܳ���:" + contentLength);
            //��������Ŀ¼�ļ���
            String downLoadFolderNameString = "E:\\testdownload\\";
            File file =new File(downLoadFolderNameString);
            if(!file.exists()) {
            	file.mkdir();
            }
            //�����ļ�
            String fileName = downLoadFolderNameString + "lena.mp4";
            File mp4file = new File(fileName);
            if(mp4file.exists()) {
            	mp4file.delete();
            }
            int downLoadSize = 0;
            byte[] bytes = new byte[1024];
            int length = 0;
            //���ļ�
            OutputStream outputStream = new FileOutputStream(fileName);
            while((length = inputStream.read(bytes)) != -1) {
                outputStream.write(bytes , 0 , length);
                downLoadSize += length;
                System.out.println("�Ѿ�����:"+downLoadSize);
            }
            inputStream.close();
            outputStream.close();
		} catch (MalformedInputException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
