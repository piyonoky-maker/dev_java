package ch05.aobejct2;

public class Hint2 {
    public static void main(String[] args) {
        NoticeVO[] nvos = new NoticeVO[3];
        NoticeVO nvo = new NoticeVO();
        for (int i = 0; i < nvos.length; i++) {
            nvos[i] = nvo;
        }
        for (NoticeVO nvo2 : nvos) {
            System.out.println(nvo2);
        }
    }
}
