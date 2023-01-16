public interface Phone {
    void makeAcall(String phoneNumber);

    boolean incomingCall(String phNo);

    void answerCall();

    boolean switchOn();

    boolean signal();


}
