package Container;

import java.lang.reflect.Array;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class XuLyChung implements IXuLyChung {

    public ArrayList<Container> nhapThongTinTuManHinh() {
        System.out.println("Nhập số lượng các Container cần nhập: ");
        Scanner sc = new Scanner(System.in);
        ArrayList<Container> ctns = new ArrayList<Container>();
        SimpleDateFormat dateTmp;
        DateFormat tmpDate = new SimpleDateFormat("yyyy/mm/dd");

        Container ctn;
        int soLuong = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= soLuong; i++) {
            ctn = new Container();
            System.out.println("Nhập thông tin Container thứ " + i);
            System.out.println("Nhập số Container:");
            ctn.setSoContainer(sc.nextLine());
            System.out.println("Container trong cảng (true) hoặc ngoài cảng (false)");
            ctn.setTrangThai(sc.nextBoolean());
            System.out.println("Cân nặng container");
            ctn.setCanNang(sc.nextFloat());
            System.out.println("Container đang có hàng (true) hay không có hàng (false)");
            ctn.setKhongHang(!sc.nextBoolean());
            sc.nextLine();

            System.out.println("Ngày vào cảng (yyyy/mm/dd)");
            try {
                ctn.setNgayVaoCang(tmpDate.parse(sc.nextLine()));
            } catch (ParseException e) {
                e.printStackTrace();
            }

            System.out.println("Ngày ra cảng (yyyy/mm/dd)");

            try {
                ctn.setNgayRaCang(tmpDate.parse(sc.nextLine()));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            ctns.add(ctn);

        }
        return ctns;


    }

    public void inMenu() {
        System.out.println("Vui lòng chọn các lựa chọn sau: ");
        System.out.println("1. Nhập thông tin các Container.");
        System.out.println("2. Xuất thông tin các Container.");
        System.out.println("3. Xuất thông tin những Container ra ngoài màn hình đối với container nào có ngày vào cảng <=" +
                "ngày người dùng nhập vào (định dạng yyy/mm/dd).");
        System.out.println("4. Thoát chương trình");
    }

    public void xuatThongTinTatCaContainer(ArrayList<Container> listContainers) {
        if (listContainers.size() > 0) {
            System.out.println("Có tất cả " + listContainers.size() + " Container:");
            for (Container c : listContainers
            ) {
                System.out.println("Số container: " + c.getSoContainer()
                        + " Trạng thái: " + (c.isTrangThai() ? "Trong cảng" : "Ngoài cảng") +
                        " Cân năng: " + c.getCanNang() +
                        " Container " + (c.isKhongHang() ? "Không hàng" : "Có hàng") +
                        " Ngày vào cảng: " + c.getNgayVaoCang() +
                        " Ngày ra cảng: " + c.getNgayRaCang());
            }
        } else {
            System.out.println("Chưa có thông tin list Container.");
        }
    }

    public void xuatThongTinContainerDieuKien(ArrayList<Container> listContainers) {

    }
}
