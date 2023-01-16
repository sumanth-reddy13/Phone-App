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
    public boolean incomingCall(String number) {
        if (!isPowerOn) isPowerOn = true;

        if (this.phoneNo.equals(number)) {
            isRinging = true;
            System.out.println("you are getting a call");
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
    public void makeAcall(String phoneNumber) {
        if (!isPowerOn) isPowerOn = true;

        // to check if the number has 10 digits or not.
        if (phoneNumber.length() != 10) {
            System.out.println("please enter a valid number!! ");
            return;
        }

        // to check if the number contains digits from 0-9.
        for (int i = 0;i < phoneNumber.length();i++) {
            if (phoneNumber.charAt(i) < 48 || phoneNumber.charAt(i) > 57) {
                System.out.println("please enter a valid number !!");
                return;
            }
        }

        System.out.println("You are making a call to the number: " + phoneNumber);
        return;
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
