package io;

import java.util.Iterator;
import java.util.List;

public interface UserService {


    //회원정보를 등록한다.
    public void addUser(User user);
    //회원정보를 수정하다.
    public boolean updateUser(User user);
    //삭제
    public boolean deleteUser(String email);
    //반환
    public Iterator <User> getUsers();
//email에 해당하는 정보가 있을경우 0보다 큰값을 반환
    public boolean exists(String email);



}
