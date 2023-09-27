package com.xiaoyu.api.util;

import com.xiaoyu.common.base.constants.*;
import com.xiaoyu.common.base.exception.CommonServiceException;
import org.apache.commons.codec.digest.DigestUtils;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * WJY
 */
public class FileUtil {

    private static final String BASE64_DATA_IMAGE = "data:image/";
    private static final String BASE64 = "base64";

    public static String getFileSuffix(String fileName){
        int last = fileName.lastIndexOf(SymbolEnum.EN_DIANHAO.getCode());
        String suffix = fileName.substring(last ,fileName.length());
        return suffix;
    }

    /**
     * 获取base64图片后缀
     */
    public static String getSuffixBase64(String base64){
        if (! legal(base64)){
            throw new CommonServiceException(ResponseEnum.FAIL.getCode(),"base64不合法");
        }
        String[] suffixs = base64.split(SymbolEnum.EN_FENHAO.getCode());
        String[] suffix = suffixs[0].split(SymbolEnum.TY_XIEGANG.getCode());
        return SymbolEnum.EN_DIANHAO.getCode() + suffix[1];
    }

    /**
     * 校验base64合法性
     */
    private static boolean legal(String base64){
        int baseFormat = base64.indexOf(SymbolEnum.EN_DOUHAO.getCode());
        if (baseFormat == -1){
            return false;
        }
        String basePrefix = base64.substring(0,baseFormat);
        if (basePrefix.contains(BASE64) && basePrefix.contains(BASE64_DATA_IMAGE)){
            return true;
        }
        return false;
    }

    /**
     * 获取base64前缀
     */
    public static String getBase64Prefix(String base64){
        int baseFormat = base64.indexOf(SymbolEnum.EN_DOUHAO.getCode());
        String basePrefix = base64.substring(0,baseFormat);
        return basePrefix + SymbolEnum.EN_DOUHAO.getCode();
    }

    public static boolean legalSuffix(String url){
        int last = url.lastIndexOf(SymbolEnum.EN_DIANHAO.getCode());
        if (last == -1){
            return false;
        } else {
            String suffix = url.substring(last ,url.length());
            if (ImageFormatEnum.contain(suffix.substring(1,suffix.length())) || FileFormatEunm.contain(suffix.substring(1,suffix.length()))){
                return true;
            }
            return false;
        }
    }

    /**
     * 获取文件的MD5值
     */
    public static String getFileMd5(String path) throws IOException {
        return DigestUtils.md5Hex(new FileInputStream(path));
    }

    /**
     * 下载网络图片或文件
     **@param durl 文件全路径
     * @param localPath 本地路径 例：E:\file
     * @param fileName 文件名，不带后缀
     */
    public static void downloadNetwork(String durl,String localPath,String fileName) throws Exception {
        if (! legalSuffix(durl)){
            throw new CommonServiceException(ResponseEnum.FAIL.getCode(),"该文件不合法");
        }
        //定义一个URL对象，就是你想下载的图片的URL地址
        URL url = new URL(durl);
        //打开连接
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        //设置请求方式为"GET"
        conn.setRequestMethod(RequestTypeEnum.GET.getCode());
        //超时响应时间为10秒
        conn.setConnectTimeout(10 * 1000);
        //通过输入流获取图片数据
        InputStream is = conn.getInputStream();
        //得到图片的二进制数据，以二进制封装得到数据，具有通用性
        byte[] data = readInputStream(is);
        //创建一个文件对象用来保存图片，默认保存当前工程根目录，起名叫Copy.jpg
        File imageFile = new File(localPath + SymbolEnum.TY_XIEGANG.getCode() + fileName +  getFileSuffix(durl));
        //创建输出流
        FileOutputStream outStream = new FileOutputStream(imageFile);
        //写入数据
        outStream.write(data);
        //关闭输出流，释放资源
        outStream.close();
    }

    /**
     * 下载本地图片或文件
     * @param durl 文件全路径
     * @param localPath 本地路径 例：E:\file
     * @param fileName 文件名，不带后缀
     */
    public static void downloadLocal(String durl,String localPath,String fileName)  {
        if (! legalSuffix(durl)){
            throw new CommonServiceException(ResponseEnum.FAIL.getCode(),"该文件不合法");
        }
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(durl);
            outputStream = new FileOutputStream(localPath + SymbolEnum.TY_XIEGANG.getCode() + fileName +  getFileSuffix(durl));
            byte[] buf = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(buf)) > 0) {
                outputStream.write(buf, 0, bytesRead);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static byte[] readInputStream(InputStream inStream) throws Exception {
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        //创建一个Buffer字符串
        byte[] buffer = new byte[6024];
        //每次读取的字符串长度，如果为-1，代表全部读取完毕
        int len;
        //使用一个输入流从buffer里把数据读取出来
        while ((len = inStream.read(buffer)) != -1) {
            //用输出流往buffer里写入数据，中间参数代表从哪个位置开始读，len代表读取的长度
            outStream.write(buffer, 0, len);
        }
        //关闭输入流
        inStream.close();
        //把outStream里的数据写入内存
        return outStream.toByteArray();
    }

    public static void main(String[] args) throws Exception {
        /*System.out.println(getFileSuffix("D:\\9dc818bb41ee45089e04ee86abf2ec35ac.jpg"));
        String aa = "data:image/png;base64,";
        System.out.println(getBase64Prefix(aa));
        System.out.println(getFileMd5("E:\\docu6b91a4148184.docx"));
        System.out.println(getFileMd5("D:\\docu6b91a4148184.docx"));*/
        /*for(int i=1;i<=1;i++){
            String name = i + ".png";
            String url = "http://www.jszygs.com/portal/rootfiles/2023/09/14/1683909777485603-1683909777547676.xlsx";
            downloadNetwork( url, "E:\\file" , "2");
            System.out.println(i);
        }*/
        downloadLocal("E:\\file\\1.png","E:\\file","3");
        System.out.println(legalSuffix("http://sxy.yxxgk.com/xyghs/xyghs/123.docx"));
    }

}
