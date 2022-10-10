package com.xiaoyu.oss;

import com.aliyun.oss.OSSClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Date;

/**
 * WJY
 */
@SpringBootTest
public class XiaoYuOssApplicationTests {

    @Autowired
    private OSSClient ossClient;

    @Test
    public void contextLoads() throws FileNotFoundException {

        String bucketName = "yuyifiles";
        String objectName = "ewm11.jpg";
        // 上传文件到指定的存储空间（bucketName）并将其保存为指定的文件名称（objectName）。
        String content = "D:\\9dc818bb41ee45089e04ee86abf2ec35ac.jpg";
        ossClient.putObject(bucketName, objectName, new FileInputStream(content));
        Date expiration = new Date(System.currentTimeMillis() + 5*60);
        URL url = ossClient.generatePresignedUrl(bucketName, objectName, expiration);
        System.out.println("127.0.0.1/" + objectName);
        // 关闭OSSClient。
        ossClient.shutdown();
    }

}
