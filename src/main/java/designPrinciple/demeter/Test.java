package designPrinciple.demeter;

public class Test {
    public static void main(String[] args) {
//      v1.0
//        Boss boss = new Boss();
//        TeamLeader teamLeader = new TeamLeader();
//        boss.commandCheckNumber(teamLeader);

//      v2.0 使用迪米特法则
        Boss boss1 = new Boss();
        TeamLeader teamLeader1 = new TeamLeader();
        boss1.commandCheckNumber2(teamLeader1);
    }
}
