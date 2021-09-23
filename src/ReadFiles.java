import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

public class ReadFiles {
    private static RandomAccessFile randomAccessFile;
    public ReadFiles() {
    }
    public static String readToString1(File file) {
        StringBuffer filestring= new StringBuffer();
        String l = null;
        try {
            FileReader fileread=new FileReader(file);
            BufferedReader filereader = new BufferedReader(fileread);
            while ((l = filereader.readLine()) != null) {
                filestring.append(l + "\n");
            }
            fileread.close();
            filereader.close();
        } catch (FileNotFoundException e) {
            System.out.println("找不到所需文件");
        } catch (IOException e) {
            System.out.println("读取文件出错");
        }
        return filestring.toString();
    }
    public static String readToString2(File file) {
        Long filelength = file.length();     //获取文件长度
        byte[] filecontent = new byte[filelength.intValue()];
        try {
            FileInputStream in = new FileInputStream(file);
            in.read(filecontent);
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String retust=new String(filecontent);
        return retust;//返回文件内容,默认编码
    }
    public static String readToString3(File file) {
        final Charset charset = Charset.forName("GBK"); //字符格式为中文
        String str=null;
        try {
            randomAccessFile = new RandomAccessFile(file, "r");
            MappedByteBuffer mbb = randomAccessFile.getChannel().map(FileChannel.MapMode.READ_ONLY, 0, file.length());
            //str=mbb.toString();
            str = charset.decode(mbb).toString();
            //System.out.println(str);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

    public static boolean write(String fstring, File dist) {
        try {
            FileWriter fwriter=new FileWriter(dist);
            BufferedWriter afwriter = new BufferedWriter(fwriter);
            afwriter.write(fstring);
            afwriter.flush();
            afwriter.close();
            return true;
        } catch (IOException e) {
            return false;
        }
    }
    public static void way1(){
        long startTime = System.currentTimeMillis();
        File file = new File("F:/ming1/ming1.txt");
        File file1 = new File("F:/ming1/ming2.txt");
        String ccout=readToString1(file);
        //String cont = TestFile.read("F:/ming1/ming1.txt");
        //对得到的内容进行处理
        //copy(file);
        ccout = ccout.replaceAll("朱元璋", "大明太祖高皇帝");
        //System.out.println(ccout);
        //更新源文件
        System.out.println(ReadFiles.write(ccout, file1));
        long endTime = System.currentTimeMillis();
        System.out.println("按行读取操作所用时间："+(endTime-startTime)+"ms");
    }
    public static void way2(){
        long startTime = System.currentTimeMillis();
        File file = new File("F:/ming1/ming1.txt");
        File file1 = new File("F:/ming1/ming2.txt");
        String ccout=readToString2(file);
        //对得到的内容进行处理
        ccout = ccout.replaceAll("朱元璋", "大明太祖高皇帝");
        //写入ming2文件
        System.out.println(ReadFiles.write(ccout, file1));
        long endTime = System.currentTimeMillis();
        System.out.println("按字节一次性读完操作所用时间："+(endTime-startTime)+"ms");
    }
    public static void way3(){
        long startTime = System.currentTimeMillis();
        File file = new File("F:/ming1/ming1.txt");
        File file1 = new File("F:/ming1/ming2.txt");
        String ccout=readToString3(file);
        //对得到的内容进行处理
        ccout = ccout.replaceAll("朱元璋", "大明太祖高皇帝");
        //写入ming2文件
        System.out.println(ReadFiles.write(ccout, file1));
        long endTime = System.currentTimeMillis();
        System.out.println("MappedByteBuffer文件映射操作所用时间："+(endTime-startTime)+"ms");
    }

    public static void main(String[] args) throws IOException {
        way1();
        way2();
        way3();

    }


}


