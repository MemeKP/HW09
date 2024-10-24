import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

@SuppressWarnings("unchecked")
public class JavaCollectionTest {

    public static void linkedlistTest(){
        // LinkedList ที่เก็บข้อมูลชนิด int
        LinkedList<Integer> IntList = new LinkedList<Integer>();

        int x;
        for (int i=1; i<10; i+= 2){  // for-loopสำหรับเพิ่มเลขคี่ลงในlist
            x = i;
            IntList.add(x);// เพิ่มค่าลงใน LinkedList
        }

        // ตรวจสอบว่ามีเลข 5 อยู่ในลิสต์ไหม
        boolean check = IntList.contains(5); // เช็คว่าlistมีเลข5อยู่ไหม
        System.out.println("5 is in the list = "+check);  

        // เช็คว่ามีเลข 6 ในlistไหม
        check = IntList.contains(6); // เช็คว่าlistมีเลข 6 อยู่ไหม
        System.out.println("6 is in the list = "+check);  

        // for-loop แสดงค่าทั้งหมดในlist
        for (int i = 0; i < IntList.size(); i++){  
            int e = IntList.get(i);  // ดึงค่าจากทีละตัว
            System.out.print(e + ", ");  
        }
        System.out.println();  // ขึ้นบรรทัดใหม่
    }

    public static void queueTest(){
        // สร้างวัตถุ queue ที่เก็บข้อมูลชนิด String
        // ตั้งชื่อว่าตัวแปร q
        Queue<String> q = new LinkedList<String>();

        String[] names = {"Abraham","Andrew","Benjamin","Claudia","Gabriel"};
        for (int i=0; i<names.length; i++){  // ลูปเพื่อเพิ่มชื่อใน queue
            // เพิ่มชื่อ names[i] ลงใน queue
            q.add(names[i]);
        }

        
        System.out.println("Top = " + q.peek());  // แสดงชื่อที่อยู่บนสุดโดยไม่ลบออกจาก queue
        System.out.println("1st Pop = " + q.poll());  // แสดงชื่อที่ถูกเอาออกจาก queue เป็นตัวแรก
        System.out.println("2nd Pop = " + q.poll());  // แสดงชื่อที่ถูกเอาออกเป็นตัวที่สอง
        System.out.println("3rd Pop = " + q.poll());  // แสดงชื่อที่ถูกเอาออกเป็นตัวที่สาม
    }

    public static void stackTest(){
        // สร้างวัตถุ stack ที่เก็บข้อมูลชนิด String
        // ตั้งชื่อว่าตัวแปร s
        Stack<String> s = new Stack<String>();

        String[] names = {"Abraham","Andrew","Benjamin","Claudia","Gabriel"};
        for (int i=0; i<names.length; i++){  // ลูปเพื่อเพิ่มชื่อใน stack
            s.push(names[i]); //push ลงstack
        }

        // แสดงชื่อที่อยู่ด้านบนสุดของ stack
        System.out.println("Top = " + s.peek());  // แสดงชื่อที่อยู่บนสุดโดยไม่เอาออก
        System.out.println("1st Pop = " + s.pop());  // แสดงชื่อที่อยู่บนสุด
        System.out.println("2nd Pop = " + s.pop());  // แสดงชื่อที่อยู่บนสุดตัวถัดไป
        System.out.println("3rd Pop = " + s.pop());  // แสดงชื่อที่อยู่บนสุดตัวถัดไป
    }

    public static void arrayOfListTest(){
        // สร้าง array ของ LinkedList แต่ละ LinkedList เก็บข้อมูลชนิด String
        LinkedList<String>[] arr = new LinkedList[5];
        String[] names = {"Abraham","Andrew","Benjamin","Claudia","Gabriel"};
        for (int i=0; i<5; i++){
            LinkedList<String> list = new LinkedList();
            for (int j=0; j<=i; j++){  
                list.add(names[j]);
            }
            arr[i] = list;
        }

        for (int i=0; i<arr.length; i++){  // ลูปเพื่อแสดงค่าของแต่ละลิสต์
            System.out.print("arr["+i+"] = ");  // แสดงว่าเป็นลิสต์อันไหน
            for(int j = 0; j < arr[i].size(); j++){  // ลูปเพื่อแสดงค่าของลิสต์นั้น
                String x = arr[i].get(j);  // ดึงค่าจากลิสต์
                System.out.print(x + ", ");  
            }
            System.out.println("");  //ขึ้นบรรทัดใหม่
        }

        // ตรวจสอบว่ามี "Benjamin" อยู่ไหนบ้าง
        for (int i=0; i<arr.length; i++){  // ลูปตรวจสอบทุกอัน
            // ทำการตรวจสอบ
            System.out.println("Benjamin is contained in arr["+i+"]? = " + arr[i].contains("Benjamin"));  
        }
    }
}
