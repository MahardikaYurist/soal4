package idolgroup;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Member> listidol = new ArrayList<>();
        Member idol1 = new Member();
        Member idol2 = new Member();
        Member idol3 = new Member();

        idol1.setNama("Imam");
        idol1.setTeam("1");
        idol1.setUmur(19);
        idol1.setPenampilan(80.7);
        idol1.setSuara(79.4);
        idol1.setAttitude(83.5);

        idol2.setNama("Adi");
        idol2.setTeam("2");
        idol2.setUmur(20);
        idol2.setPenampilan(85.8);
        idol2.setSuara(83.3);
        idol2.setAttitude(77.2);

        idol3.setNama("David");
        idol3.setTeam("3");
        idol3.setUmur(18);
        idol3.setPenampilan(79.9);
        idol3.setSuara(87.4);
        idol3.setAttitude(80.1);

        listidol.add(idol1);
        listidol.add(idol2);
        listidol.add(idol3);
        
        System.out.println("\tMember Idol");
        System.out.println("=============================");
        for (int i = 0; i < listidol.size(); i++) {
            System.out.println("Nama  : " + listidol.get(i).getNama());
            System.out.println("Team  : " + listidol.get(i).getTeam());
            System.out.println("Umur  : " + listidol.get(i).getUmur());
            System.out.println("Nilai : " + listidol.get(i).getNilai());
            System.out.println("=============================");
        }
    }
}