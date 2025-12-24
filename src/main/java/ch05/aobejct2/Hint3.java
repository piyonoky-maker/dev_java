package ch05.aobejct2;

public class Hint3 {
    public static void main(String[] args) {
        NoticeVO[] nvos = new NoticeVO[3];
        NoticeVO nvo = null;
        int i = 0;
        while(i<nvos.length){
            nvo = new NoticeVO();
            nvos[i] = nvo;
            i++;
        }
        for(NoticeVO nvo2: nvos){
            System.out.println(nvo2);
        }
    }
}
