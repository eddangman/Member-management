package io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputExam {
    public static void main(String[] args) throws Exception{
        User user =new User("tlys@mail.com", "이용수",1989);

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("/temp/users.dat"));
        out.writeObject(user);
        out.close();
    }
}
