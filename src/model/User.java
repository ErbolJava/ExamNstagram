package model;

import enums.Gender;

public class User {
    private String  nickName;
    private String  password;
    private Long  id;
    private int  age;
    private String  photo;
    private Gender  gender;

    public User() {

    }

    public User (String nickName, String password, Long id, int age, String photo, Gender gender) {
        this.nickName = nickName;
        this.password = password;
        this.id = id;
        this.age = age;
        this.photo = photo;
        this.gender = gender;}

    public String getNickName() {
         return nickName;}

    public void setNickName(String nickName) {
         this.nickName = nickName;
    }

    public String getPassword() {
         return password;}

    public void setPassword(String password) {
         this.password = password;}

    public Long getId() {
         return id;}

    public void setId(Long id) {
         this.id = id;}

    public int getAge() {
         return age;}

    public void setAge(int age) {
         this.age = age;}

    public String getPhoto() {
         return photo;}

    public void setPhoto(String photo) {
         this.photo = photo;}

    public Gender getGender() {
         return gender;}

    public void setGender(Gender gender) {
         this.gender = gender;}

    @Override
    public String toString() {
        return  "User{" +
                "nickName='" + nickName + '\'' +
                ", password='" + password + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", photo='" + photo + '\'' +
                ", gender=" + gender +
                 '}';
    }
}
