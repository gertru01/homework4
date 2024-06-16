package ru.gertru;

public class Card {

    private final String number;
    private final String validDate;
    private final String cvv;
    private final String pinCode;

    public Card(String number, String validDate, String cvv, String pinCOde) {
        this.number = number;
        this.validDate = validDate;
        this.cvv = cvv;
        this.pinCode = pinCOde;
    }

    public String getPrivateNumber() {
        return ("**** **** **** " + number.substring(number.length() - 4));
    }

    public void getTrueNumber(String pinCode) {
        if (pinCode.equals(this.pinCode))
            System.out.println(number);
    }
}
