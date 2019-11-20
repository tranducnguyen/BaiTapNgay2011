package Container;

import java.text.ParseException;
import java.util.ArrayList;

public interface IXuLyChung {
    public ArrayList<Container> nhapThongTinTuManHinh() throws ParseException;
    public void inMenu();
    public void xuatThongTinTatCaContainer(ArrayList<Container> listContainers);
    public void xuatThongTinContainerDieuKien(ArrayList<Container> listContainers);
}
