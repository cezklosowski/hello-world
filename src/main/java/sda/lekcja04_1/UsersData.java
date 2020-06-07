package sda.lekcja04_1;
import java.util.List;
import java.util.ArrayList;

public class UsersData {
    public List<User> users;

    public UsersData() {
        users = new ArrayList<User>();
        users.add(new User("Tomasz","Adamski","tomadam","123456",1001));
        users.add(new User("Dominika","Zaborowska","dominika11","password",1002));
        users.add(new User("Robert","Makłowicz","pierozek","kotlecik",1003));
        users.add(new User("Julia","Roberts","jr","movieshej",1004));
        users.add(new User("Magda","Gessler","blondi","seksikuchnia",1005));
    }

    public void addUser(User user){
        users.add(new User(user.getName(),user.getSurname(),user.getLogin(),user.getPassword(),user.getId()));
    }

    public List<User> returnUsers(){
        return users;
    }

    public User getUserByLogin(String login){
        User score = null;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getLogin() == login){
                score = users.get(i);
                break;
            }
        }
        return score;
    }

    public User getUserById(int id){
        User score = null;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == id){
                score = users.get(i);
                break;
            }
        }
        return score;
    }


}
