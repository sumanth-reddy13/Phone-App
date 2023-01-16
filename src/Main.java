public class Main {
    public static void main(String[] args) {
        Landline l1 = new Landline("8374377875");
        Landline l2 = new Landline("8106705268");

        l1.makeAcall("8106705268");

        boolean incoming = l2.incomingCall("810705268");
        if (incoming) l2.answerCall();
        System.out.println(l1.switchOn());

    }
}