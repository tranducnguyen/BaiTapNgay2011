package Container;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        XuLyChung xlc = new XuLyChung();
        ArrayList<Container> listContainer = new ArrayList<Container>();

        Scanner sc = new Scanner(System.in);
        int luaChon;
        boolean stopFlag = true;

        while (stopFlag==true) {

            xlc.inMenu();
            luaChon = sc.nextInt();
            switch (luaChon) {
                case 1:
                    listContainer = xlc.nhapThongTinTuManHinh();
                    break;
                case 2:
                    xlc.xuatThongTinTatCaContainer(listContainer);
                    break;
                case 3:
                    xlc.xuatThongTinContainerDieuKien(listContainer);
                    break;
                case 4:
                    stopFlag = false;
                    break;
            }
        }
        System.out.println("Chương trình đã thoát");
    }
}
