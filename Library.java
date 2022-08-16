class Library {
    String userName;
    int userId;
    String bookName;
    int dueDate;
    String remainderMessage;
    int charges;

    
public static void main(String[]args){
    Library User;
    User  = new Library();
   
   
    User.userName = "Krishna";
    User.bookName = "Sad Truth";
    User.dueDate = 23/8/2022;
    User.remainderMessage = "Please return the book on correct due date without fail";
    //User.charges = 50;
    System.out.println(User.remainderMessage);
    System.out.println(User.charges);

}

    }