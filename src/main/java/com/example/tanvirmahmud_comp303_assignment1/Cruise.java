package com.example.tanvirmahmud_comp303_assignment1;

public class Cruise {
    private String firstName;
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    private String lastName;
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    private String areaCode;
    public String getAreaCode() {
        return areaCode;
    }
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }
    private String contactNumber;
    public String getContactNumber() {
        return contactNumber;
    }
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    private String address1;
    public String getAddress1() {
        return address1;
    }
    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    private String address2;
    public String getAddress2() {
        return address2;
    }
    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    private String city;
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    private String province;
    public String getProvince() {
        return province;
    }
    public void setProvince(String province) {
        this.province = province;
    }

    private String postal;
    public String getPostal() {
        return postal;
    }
    public void setPostal(String postal) {
        this.postal = postal;
    }
    private String country;
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    private String email;
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    private Integer rooms;
    public Integer getRooms() {
        return rooms;
    }
    public void setRooms(Integer rooms) {
        this.rooms = rooms;
    }
    private String roomType;
    public String getRoomType() {
        return roomType;
    }
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    private Integer price;
    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }

    private Integer numberOfGuests;
    public Integer getNumberOfGuests() {
        return numberOfGuests;
    }
    public void setNumberOfGuests(Integer numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }
    private String cabinType;
    public String getCabinType() {
        return cabinType;
    }
    public void setCabinType(String cabinType) {
        this.cabinType = cabinType;
    }


    private boolean isSenior;
    public boolean getIsSenior() {
        return isSenior;
    }
    public void setIsSenior(boolean isSenior) {
        this.isSenior = isSenior;
    }
    public int total(){
        return price * numberOfGuests;
    }

    public float discount(){
        if (isSenior){
            return (float) (total() * .1);
        }
        else{
            return 0;
        }
    }

    public  float taxes(){
        return (float) (total() * .13);
    }

    public float grandTotal(){
        return total() - discount() + taxes();
    }

}
