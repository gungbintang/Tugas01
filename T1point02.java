package t1point02;

/**
 *
 * @author Bintang Purnama Dewi 20103019
 */
public class T1point02 {


    public static void main(String[] args) {
        {
        String[][]nama = {
            {"Adi", "127647", "Teknik Informatika"},
            {"Mika", "129883", "Sistem Komputer"},
            {"Budi", "120495", "Sistem Komputer"},
            {"Bunga", "123489", "Teknik Informatika"}        
        };
        
        for (int i=0;i<4;i++){
            for (int j=0;j<3;j++){
                System.out.print(nama[i][j]+"\t");
            }
            System.out.println();
            }
        }
    }
}