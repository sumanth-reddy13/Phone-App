public interface Phone {
    void makeAcall(Object obj);

    boolean incomingCall(String phNo, String incomingNumber);

    void answerCall();

    boolean switchOn();

    boolean signal();


}
