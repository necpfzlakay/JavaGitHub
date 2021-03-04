package merve;

/**
 * Player Class
 * this class holds variables and creates Singleton object
 *
 */
public class Player {
    private String username;
    private int score;
    private String email;

    // this is creating our player object
    static Player player = new Player();

        // private player constructor
        private Player(){
            setUsername("Singleton");
            setEmail("Singleton@gmail.com");
            setScore(0);
        }
        // static player get instance function it returns player object
        // in this way, user can not create new object
        public static Player getInstance(){
            return player;
        }

    /**
     * toString function returns information about user
     * @return
     */
    @Override
    public String toString() {
        return "Player's\n" +
                "username= " + getUsername() +
                "\nEmail= " + getEmail() +
                "\nScore= " + getScore() + " point" ;

    }


    /**
     * setters and getters
     * @return
     */

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
