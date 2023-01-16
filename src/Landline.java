public class Landline implements Phone{

    String phoneNo;
    static boolean isPowerOn;
    boolean isRinging;

    public Landline(String phoneNo) {
        this.phoneNo = phoneNo;
        isPowerOn = false;
        isRinging = false;
    }

    @Override
    public void makeAcall(Object obj) {
        if (!isPowerOn) isPowerOn = true;

        // obj is an object, so we typeCast it to Landline.
        Landline l = (Landline) obj;
        // to check if the number has 10 digits or not.
        if (l.phoneNo.length() != 10) {
            System.out.println("please enter a valid number!! ");
            return;
        }

        // to check if the number contains digits from 0-9.
        for (int i = 0;i < l.phoneNo.length();i++) {
            if (l.phoneNo.charAt(i) < 48 || l.phoneNo.charAt(i) > 57) {
                System.out.println("please enter a valid number !!");
                return;
            }
        }

        // calling the "incomingCall()" method of the object to which call was made.
        System.out.println("Hello " + this.phoneNo + ". You are making a call to the number: " + l.phoneNo );
        System.out.println();
        l.incomingCall(l.phoneNo, this.phoneNo);
        return;
    }
    @Override
    public boolean incomingCall(String number, String incomingNumber) {
        if (!isPowerOn) isPowerOn = true;

        if (this.phoneNo.equals(number)) {
            isRinging = true;
            System.out.println("Hello " + this.phoneNo +  ". You are getting a call from " + incomingNumber);
            return true;
        }else {
            System.out.println("No incoming call at present");
        }
        return false;
    }

    @Override
    public void answerCall() {
        if (isRinging) {
            System.out.println("the call is answered");
            isRinging = false;
            return;
        }
    }



    @Override
    public boolean switchOn() {
        if (isPowerOn) return true;
        return false;
    }

    @Override
    public boolean signal() {
        if (isPowerOn) return true;
        return false;
    }

}
