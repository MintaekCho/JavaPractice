package User_Login;

public class User {

    private String nickName;
    private String id;
    private String pw;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    void userInfo(){
        System.out.println("아이디 : " + getId());
        System.out.println("비밀번호 : " + getPw());
        System.out.println("닉네임 : " + getNickName());
    }

    void signUp(String user){

    }
}
